package Reflect;

public class ClassTest01 {
    public static void main(String[] args){
        String path = "Reflect.User";
        Class cla;
    {
        try {
            cla = Class.forName(path);
            System.out.println(cla.hashCode());
            Class cla2 = String.class;
            System.out.println(cla2.hashCode());
            System.out.println(path.getClass().hashCode());

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }}
}
