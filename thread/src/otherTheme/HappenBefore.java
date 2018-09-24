package otherTheme;

/**
 * 指令重排：代码执行顺序与预期不一致
 * 编译器或运行时环境对指令重排序
 */
public class HappenBefore {
    private static int a;
    private static boolean flag = false;
    public static void main(String[] args){
        for (int i = 0; i < 100; i++) {
            a = 0;
            flag = false;
            Thread t = new Thread(()->{
                flag = true;
            });
            Thread t2 = new Thread(()->{
                if (flag){
                    a = 1;
                    a *= 1;
                    a = a<<1;
                    a = a>>1;
                }
                if (a == 0){
                    System.out.println("happen>>" + a);
                }
            });
            t.start();
            t2.start();
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {
                t2.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
