/**
 * 类主动引用一定发生类初始化：
 * - new一个类对象
 * - 调用类静态成员和静态方法
 * - reflect调用
 * - 虚拟机启动初始化main所在类
 * - 初始化一个类先初始化父类
 */

/**
 * 类被动引用不发生初始化
 * - 访问一个静态域，只有声明她的类初始化
 *       例如子类引用父类静态变量
 * - 数组定义类引用
 * - 引用常量 如final
 */
public class Test01 {
    static{
        System.out.println("静态初始化test01");
    }

    public static void main(String[] args) throws Exception {
        System.out.println("test01的main方法！");
        System.out.println(System.getProperty("java.class.path"));

        //主动引用
//		new A();
//		System.out.println(A.width);
//		Class.forName("com.bjsxt.test.A");


        //被动引用
//		System.out.println(A.MAX);
//		A[] as = new A[10];
        System.out.println(B.width);

    }
}

class B  extends A {
    static {
        System.out.println("静态初始化B");
    }
}

class A extends A_Father {
    public static int width=100;   //静态变量，静态域    field
    public static final  int MAX=100;

    static {
        System.out.println("静态初始化类A");
        width=300;
    }
    public A(){
        System.out.println("创建A类的对象");
    }
}

class A_Father extends Object {
    static {
        System.out.println("静态初始化A_Father");
    }
}

