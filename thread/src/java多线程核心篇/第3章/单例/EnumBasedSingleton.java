package java多线程核心篇.第3章.单例;

/**
 * 清单3-19
 * 基于枚举
 */
public class EnumBasedSingleton {
    public static void main(String[] args){
        Thread t = new Thread() {
            @Override
            public void run() {
                Singleton.INSTANCE.someThing();
            }
        };
        t.start();
    }
    public static enum Singleton {
        INSTANCE;
        Singleton() {

        }
        public void someThing() {

        }
    }
}
