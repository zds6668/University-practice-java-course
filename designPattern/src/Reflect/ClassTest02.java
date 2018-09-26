package Reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 通过反射api获取类信息
 */
public class ClassTest02 {
    public static void main(String[] args){
        String path = "Reflect.User";
        try {
            Class cla = Class.forName(path);
            //获取名字
            System.out.println("获取名字");
            System.out.println(cla.getName());
            System.out.println(cla.getSimpleName());
            System.out.println("----------------");
            //获取属性
            System.out.println("获取属性--field");
            Field[] fields = cla.getFields();//只能获得public
            Field[] fields2 = cla.getDeclaredFields();//获得所有
            System.out.println(fields.length);
            Field fi = cla.getDeclaredField("name");
            System.out.println(fi);
            for (Field tmp:fields2
                 ) {
                System.out.println(tmp);
            }
            System.out.println("----------------");

            //获取方法
            System.out.println("获取方法");
            Method[] methods = cla.getDeclaredMethods();
            System.out.println(methods.length);
            //如果方法有参，则必须传递参数类型对应的class对象
            Method method1 = cla.getDeclaredMethod("getId", null);
            for (Method tmp:methods ) {
                System.out.println(tmp);
            }
            System.out.println("----------------");

            System.out.println("获取构造器");
            Constructor[] constructors = cla.getDeclaredConstructors();
            for ( Constructor c:constructors ) {
                System.out.println(c);
            }
            System.out.println(cla.getDeclaredConstructor(int.class,int.class, String.class));



        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
