package java多线程核心篇.第3章.单例;

/**
 * 清单3-17
 * 双重检查锁单例
 */
public class DCLSingleton {
    //保存该类的唯一实例
    private static volatile DCLSingleton instance = null;//volatile保障可见性，有序性

    //实例变量声明区
    /**
     * 私有构造器
     */
    private DCLSingleton() {};

    /**
     * 创建并返回该类的唯一实例
     * @return
     */
    public static DCLSingleton getInstance() {
        if (instance == null) { //出错的地方在这里，因为重排序导致返回了一个未初始化的实例，即变量instance值不为null，但是所引用的对象中某些实例变量未初始化
            synchronized (DCLSingleton.class) {
                if (null == instance) {
                    instance = new DCLSingleton();
                }
            }
        }
        return instance;
    }
    //dosomething的代码区
}
