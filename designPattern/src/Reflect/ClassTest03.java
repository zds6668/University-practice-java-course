package Reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 反射操作
 */
public class ClassTest03 {
    public static void main(String[] args){
        String path = "Reflect.User";
        try {
            Class<User> cla = (Class<User>) Class.forName(path);
            //反射调用构造方法
            User u = cla.newInstance();
            System.out.println(u);
            Constructor<User> constructor = cla.getDeclaredConstructor(int.class, int.class, String.class);
            User u2 = constructor.newInstance(1, 18, "dd");
            System.out.println(u2.getName());

            //反射调用普通方法
            User u3 = cla.newInstance();
            Method method3 = cla.getDeclaredMethod("setName", String.class);
            method3.invoke(u3, "dd3普通方法");
            System.out.println(u3.getName());

            //反射操作属性
            User u4 = cla.newInstance();
            Field f = cla.getDeclaredField("name");
            f.setAccessible(true);
            f.set(u4, "name属性");
            System.out.println(u4.getName());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
