import javax.swing.*;
import java.awt.*;

public class BallGame extends JFrame{

    Image ball = Toolkit.getDefaultToolkit().getImage("imgs/ball.png");
    Image desk = Toolkit.getDefaultToolkit().getImage("imgs/dek.jpg");

    double x = 100;
    double y = 100;
    boolean right = true;
    double degree= 3.14/3;

    //画窗口
    public void paint(Graphics g){
        g.drawImage(desk, 0, 0, null);
        g.drawImage(ball, (int)x, (int)y, null);

        x = x + 10*Math.cos(degree);
        y = y + 10*Math.sin(degree);

        if (y>500-70 || y<80){
            degree = -degree;
        }
        if (x>856-70 || x<80){
            degree = 3.14-degree;
        }
    }


    //窗口加载
    void launchFrame(){
        setSize(856,500);
        setLocation(50, 50);
        setVisible(true);

        //重画
        while (true){
            repaint();
            try {
                Thread.sleep(40);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args){
        System.out.println("来");
        BallGame game = new BallGame();
        game.launchFrame();
    }
}
