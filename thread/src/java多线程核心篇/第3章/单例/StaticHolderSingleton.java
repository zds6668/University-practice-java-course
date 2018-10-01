package java多线程核心篇.第3章.单例;

/**
 * 静态内部类的单例模式
 */
public class StaticHolderSingleton {
    //私有构造器
    private StaticHolderSingleton() {
        System.out.println("StaticHolderSingleton初始化中");
    }
    private static class InstanceHolder {
        //保存外部类的唯一实例
        final static StaticHolderSingleton INSTANCE = new StaticHolderSingleton();
    }
    
    public static StaticHolderSingleton getInstance() {
        return InstanceHolder.INSTANCE;
    }
    public static void main(String[] args){
        StaticHolderSingleton.getInstance().hashCode();
    }
}
