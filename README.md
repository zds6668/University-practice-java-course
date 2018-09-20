# java
兜兜转转<br>
你才是世界上最好的语言<br>

### 学习安排

1. ~~面向对象，多态，string类，数组，常用类~~
2. 容器和数据结构
   - ~~List，Arraylist，LinkedList~~，Vector
   - ~~Map，HashMap~~，HashTable，看源码
   - HashSet，泛型
3. 多线程
4. JVM
5. 设计模式
6. 并发
7. JAVA EE SSM

厚积薄发，做有意义的事，永远都不会太晚





#### 关于hashmap不得不提

总结什么的就不了，都太多了，不过很多都不太严谨或者不太准确，所以我只相信源码。

1. 桶数组长度取2的次方的直接原因：将取模运算优化为做和length-1的与运算，并在此情况下，因为length-1二进制位全为1，求index的结果会等同于hashcode的后n位，也就是可以认为，只要hashcode本身是均匀的，那么hash算法结果也是均匀的。 要点：不是为了减少碰撞把长度取为2的次方，==如果要用与运算，一定要是2的n次方==，如果是为了减少碰撞，那么取素数才是最有效的。这里主要是运算的优化

2. 关于JDK1.7put头插法，扩容头插法，1.8put尾插法，扩容头插法，也没几个说明白，博客什么的都好像差不多（你懂得），尾插法可以让resize后链表不发生反转，真的是这样吗？看过源码后，原来都在瞎xx说。

   - 1）链表的反转问题，和头插法尾插法无关

     - 先说扩容：1.7扩容，对原来的链表从第一个节点开始取，这里以a->b->c->null为例子，不管1.7，1.8取节点都是从头开始取往后遍历，这个是不会变的，那么1.7的操作是，取出a，做rehash，头插到新数组，这时新数组为a->null，接下来取b头插到新数组，假设abc都rehash后还是同样的index，那么变成b->a->null，取c变成c->b->a->null，所以1.7中每一次扩容都会发生链表反转，看源码

       ```java
       //JDK1.7
       void transfer(Entry[] newTable, boolean rehash) {
               int newCapacity = newTable.length;
       　　　　　//for循环中的代码，逐个遍历链表，重新计算索引位置，将老数组数据复制到新数组中去
               for (Entry<K,V> e : table) {
                   while(null != e) {
                       Entry<K,V> next = e.next;
                       if (rehash) {
                           e.hash = null == e.key ? 0 : hash(e.key);
                       }
                       int i = indexFor(e.hash, newCapacity);
       　　　　　　　　　 //将当前取到的entry的next链指向新的索引位置,newTable[i]有可能为空，有可能也是个entry链，如果是entry链，直接在链表头部插入。
                       //关键的代码就是下面三行
                       e.next = newTable[i];
                       newTable[i] = e;
                       e = next;
                   }
               }
           }
       ```

     - 而在1.8中，因为扩容后原链表上的Node可能会分成两部分，通过用了两条新链表：一条loHead下标为index，一条hiHead下标为index+Oldcap，通过遍历所有的原链表中的节点，同样a->b->c->null，这里假设b的index和ac不同，那么首先a，通过1.8的巧运算（遗弃了rehash，后面说）变成loHead->a->null,取b后变成hiHead->b->null，取c后变成loHead->a->c->null，这时遍历完成，会将两条新链表接到新数组对应的index上，然后把新put的Node通过头插插到链表头，可以分析，1.8中就算put用的还是头插法，resize后链表仍然不发生反转。源码看关键部分40行到69行

       ```java
       	//JDK1.8
       final Node<K,V>[] resize() {
               Node<K,V>[] oldTab = table;
               int oldCap = (oldTab == null) ? 0 : oldTab.length;
               int oldThr = threshold;
               int newCap, newThr = 0;
               if (oldCap > 0) {
                   if (oldCap >= MAXIMUM_CAPACITY) {
                       threshold = Integer.MAX_VALUE;
                       return oldTab;
                   }
                   else if ((newCap = oldCap << 1) < MAXIMUM_CAPACITY &&
                            oldCap >= DEFAULT_INITIAL_CAPACITY)
                       newThr = oldThr << 1; // double threshold
               }
               else if (oldThr > 0) // initial capacity was placed in threshold
                   newCap = oldThr;
               else {               // zero initial threshold signifies using defaults
                   newCap = DEFAULT_INITIAL_CAPACITY;
                   newThr = (int)(DEFAULT_LOAD_FACTOR * DEFAULT_INITIAL_CAPACITY);
               }
               if (newThr == 0) {
                   float ft = (float)newCap * loadFactor;
                   newThr = (newCap < MAXIMUM_CAPACITY && ft < (float)MAXIMUM_CAPACITY ?
                             (int)ft : Integer.MAX_VALUE);
               }
               threshold = newThr;
               @SuppressWarnings({"rawtypes","unchecked"})
                   Node<K,V>[] newTab = (Node<K,V>[])new Node[newCap];
               table = newTab;
               if (oldTab != null) {
                   for (int j = 0; j < oldCap; ++j) {
                       Node<K,V> e;
                       if ((e = oldTab[j]) != null) {
                           oldTab[j] = null;
                           if (e.next == null)
                               newTab[e.hash & (newCap - 1)] = e;
                           else if (e instanceof TreeNode)
                               ((TreeNode<K,V>)e).split(this, newTab, j, oldCap);
                        //这里开始，把节点巧运算后分到两条链表
                           else { // preserve order
                               Node<K,V> loHead = null, loTail = null;
                               Node<K,V> hiHead = null, hiTail = null;
                               Node<K,V> next;
                               do {
                                   next = e.next;
                                   if ((e.hash & oldCap) == 0) {
                                       if (loTail == null)
                                           loHead = e;
                                       else
                                           loTail.next = e;
                                       loTail = e;
                                   }
                                   else {
                                       if (hiTail == null)
                                           hiHead = e;
                                       else
                                           hiTail.next = e;
                                       hiTail = e;
                                   }
                               } while ((e = next) != null);
                          //直到原链表全部Node取完，分别把两条链表放到新数组
                               if (loTail != null) {
                                   loTail.next = null;
                                   newTab[j] = loHead;
                               }
                               if (hiTail != null) {
                                   hiTail.next = null;
                                   newTab[j + oldCap] = hiHead;
                     //-------------------------------------------------
                               }
                           }
                       }
                   }
               }
               return newTab;
           }
       ```

       同时，因为这一部分（取出了40-60行），两个链表依次在末端添加节点，在多线程下，第二个线程无非重复第一个线程一模一样的操作，解决了多线程Put导致的死循环。但仍然不安全。

       ```java
       // preserve order
                               Node loHead = null, loTail = null;
                               Node hiHead = null, hiTail = null;
                               Node next;
       						
       						//处理某个hash桶部分
                               do {
                                   next = e.next;
                                      {//确定在newTable中的位置
                                       if (loTail == null)
                                           loHead = e;
                                       else
                                           loTail.next = e;
                                       loTail = e;
                                   }
                                   else {
                                       if (hiTail == null)
                                           hiHead = e;
                                       else
                                           hiTail.next = e;
                                       hiTail = e;
                                   }
                               } while ((e = next) != null);
       
       ```

   - 2）1.8中put用尾插法，猜想是因为红黑树，试想你往一棵树里加节点，你会把他放在原来root根节点的位置还是放到树的子节点呢？

   - 3）关于1.8中舍弃rehash使用的巧运算。既对hash在新增的bit位看为0还是为1，详细的这里不说了，1.7的rehash是对扩容后的length做length-1的与操作，1.8是对e.hash & oldCap这样的与操作

     - 并没有提升量级时间性能！不过减少了代码量。也减少了运算（原来rehash肯定步骤多）。
     - 还有的说1.8对一个位的bit取与操作，让原一个链表的节点均匀分为0或1，这是1.8的优化，我说大哥，能不能想一想，1.8的操作和1.7对length-1与操作的结果，有任何改变吗，一模一样的好吗，1.8的运算就是对& length-1的一个转换方式罢了。原来是1.7是a * c+b * c，现在写为(a + b) * c，结果变没变？ 我看来，不过是写JDK的人取了个巧罢了。

   - 4）关于1.7中PUT用头插法，因为插入链表的时候已经遍历了一遍链表了，并不是说头插比尾插更效率，只要插入都要摸链，那么既然都摸到链表尾了，还使用头插？这里想想操作系统的某些调度算法，是不是有一种，刚用过的数据极大可能马上再用？【最近最久未使用】。这是时间局部性原理。
