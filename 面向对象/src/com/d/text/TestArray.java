package com.d.text;

    class Man{
        private int age;
        private int id;
        public Man(int id,int age) {
            super();
            this.age = age;
            this.id = id;
        }
    }
    public class TestArray {
        public static void main(String[] args) {
            Man[] mans;  //声明引用类型数组；
            mans = new Man[10];  //给引用类型数组分配空间；

            Man m1 = new Man(1,11);
            Man m2 = new Man(2,22);

            mans[0]=m1;//给引用类型数组元素赋值；
            mans[1]=m2;//给引用类型数组元素赋值；


            int[] a1 = {1,2,3};//静态初始化
            //动态初始化，初始化，分配空间与赋值分开
            int[] a2 = new int[3];
            a2[0] = 1;

            //foreach
            for (int i:a1){
                System.out.println(i);
            }
        }
    }

