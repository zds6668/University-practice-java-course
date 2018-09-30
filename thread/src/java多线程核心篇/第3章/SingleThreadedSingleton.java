package java多线程核心篇.第3章;

/**
 * 清单3-14，p120
 *
 */
public class SingleThreadedSingleton {
    //保存该类的唯一实例
    private static SingleThreadedSingleton instance = null;

    //实例变量声明区
    /**
     * 私有构造器
     */
    private SingleThreadedSingleton(){};

    /**
     * 创建并返回该类的唯一实例
     * @return
     */
    public static SingleThreadedSingleton getInstance() {
        if (null == instance) {
            instance = new SingleThreadedSingleton();
        }
        return instance;
    }
    //dosomething的代码
}
