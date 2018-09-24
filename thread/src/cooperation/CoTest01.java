package cooperation;

public class CoTest01 {
    public static void main(String[] args){
        Contain contain = new Contain();
        new Productor(contain).start();
        new Consumer(contain).start();
    }
}
//生产者
class Productor extends Thread{
    Contain contain;
    public Productor(Contain contain){
        this.contain = contain;
    }
    public void run(){
        for (int i = 1; i < 100; i++) {
            contain.push(new Produc(i));
            System.out.println("生产第"+ i +"个，现在柜台上可以买的有" + (contain.count+1) + "个");
        }
    }
}
//消费者
class Consumer extends Thread{
    Contain contain;
    public Consumer(Contain contain){
        this.contain = contain;
    }
    public void run(){
        for (int i = 1; i < 100; i++) {
            System.out.println("拿走第"+ contain.pop().id);
        }
    }
}

//缓冲区
class Contain{
    Produc[] producs = new Produc[5];
    int count = 0;

    //生产，存入
    public synchronized void push(Produc produc){
        if (count == producs.length){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        producs[count] = produc;
        count++;
        this.notifyAll();

    }
    //消费，拿走
    public synchronized Produc pop( ){
        if (count == 0){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        count--;
        Produc tmp = producs[count];
        this.notifyAll();
        return tmp;
    }
}

//产品
class Produc{
    int id;
    public Produc(int id){
        this.id = id;
    }
}