public class Test02 {
    public static void main(String[] args){
        System.out.println(ClassLoader.getSystemClassLoader());
        System.out.println(ClassLoader.getSystemClassLoader().getParent());
        System.out.println(ClassLoader.getSystemClassLoader().getParent().getParent());
        System.out.println("------------------");

        String a = "你给我返回abc吗";
        System.out.println(a);
        System.out.println(a.getClass().getClassLoader());
        //双亲委派到了启动类加载器
        //包名冲突了，也还是加载正确的核心包
    }
}
