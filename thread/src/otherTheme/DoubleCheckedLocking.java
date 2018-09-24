package otherTheme;

/**
 * 单例模式：多线程下，对外只有一个对象
 * 懒汉式基础上加并发控制
 * 1，构造器私有化->>避免外部new
 * 2，提供私有静态属性->>存储对象地址
 * 3，提供公共静态方法->>获取属性
 */
public class DoubleCheckedLocking {
    public static void main(String[] args){
        new Thread(()->{
            System.out.println(DoubleCheckedLocking.getInstance());
        }).start();
        System.out.println(DoubleCheckedLocking.getInstance());
    }
    //volatile防止指令重排
    private static volatile DoubleCheckedLocking instance;
    private DoubleCheckedLocking(){

    }
    public static DoubleCheckedLocking getInstance(){
        //检测二
        if (null != instance){
            return instance;
        }
        //检测一
        synchronized (DoubleCheckedLocking.class){
            if (null == instance){
                instance = new DoubleCheckedLocking();
            }
        }
        return instance;
    }

}
