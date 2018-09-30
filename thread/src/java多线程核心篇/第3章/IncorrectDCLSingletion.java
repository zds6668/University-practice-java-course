package java多线程核心篇.第3章;

/**
 * 清单3-16
 * 双重检查锁的错误单例
 */
public class IncorrectDCLSingletion {
    //保存该类的唯一实例
    private static IncorrectDCLSingletion instance = null;

    //实例变量声明区
    /**
     * 私有构造器
     */
    private IncorrectDCLSingletion() {};

    /**
     * 创建并返回该类的唯一实例
     * @return
     */
    public static IncorrectDCLSingletion getInstance() {
        if (instance == null) { //出错的地方在这里，因为重排序导致返回了一个未初始化的实例，即变量instance值不为null，但是所引用的对象中某些实例变量未初始化
            synchronized (IncorrectDCLSingletion.class) {
                if (null == instance) {
                    instance = new IncorrectDCLSingletion();
                }
            }
        }
        return instance;
    }
    //dosomething的代码区
}
