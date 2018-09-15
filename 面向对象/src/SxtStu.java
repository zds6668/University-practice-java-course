class Computer{
    String brand; //品牌
}
public class SxtStu {
    int id;
    String sname;
    int age;
    Computer com;
    void study(){
        System.out.println("我在学习用" + com.brand + "电脑");
    }
    SxtStu(){
        
    }

    public static void main(String[] args) {
        SxtStu stu1 = new SxtStu();
        stu1.sname = "帅哥";
        stu1.age = 10;
        stu1.id = 1;
        Computer comp1 = new Computer();
        comp1.brand = "小米";
        stu1.com = comp1;
        stu1.study();
    }
}
