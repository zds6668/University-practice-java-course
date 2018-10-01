package java多线程核心篇.第3章.单例;

/**
 * 清单3-15
 */
public class SimpleMultithreadedSingleton {
    //保存该类的唯一实例
    private static SimpleMultithreadedSingleton instance = null;

    //实例变量声明区
    /**
     * 私有构造器
     */
    private SimpleMultithreadedSingleton() {};

    /**
     * 创建并返回该类的唯一实例
     * @return
     */
    public static SimpleMultithreadedSingleton getInstance() {
        synchronized (SimpleMultithreadedSingleton.class) {
            if (null == instance) {
                instance = new SimpleMultithreadedSingleton();
            }
            return instance;
        }
    }
    //dosomething的代码区
}
