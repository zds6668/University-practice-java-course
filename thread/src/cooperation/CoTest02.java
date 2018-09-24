package cooperation;

public class CoTest02 {
    public static void main(String[] args){
        Tv tv = new Tv();
        new Watcher(tv).start();
        new Player(tv).start();
    }
}

class Player extends Thread{
    Tv tv;
    public Player(Tv tv){
        this.tv = tv;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if (i%2 == 0){
                this.tv.play("java is best");
            }else{
                this.tv.play("PHP is best");
            }
        }
    }
}

class Watcher extends Thread{
    Tv tv;
    public Watcher(Tv tv){
        this.tv = tv;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            this.tv.watch();
        }
    }
}
class Tv{
    String voice;
    boolean flag = false;

    public synchronized void play(String voice){
        if (flag){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.voice = voice;
        System.out.println("表演"+voice);
        this.flag = !this.flag;
        this.notifyAll();
    }

    public synchronized void watch( ){
        if (!flag){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }System.out.println("听到"+voice);
        this.flag = !this.flag;
        this.notifyAll();
    }
    }
