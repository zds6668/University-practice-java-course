package com.d.game1;

import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Date;

/**
 * 游戏主窗口
 */
public class MyGame01 extends JFrame {


    Image planeimg = GameUtil.getImage("img/fei.png");// 56,37
    Image bg = GameUtil.getImage("img/bj.png");
    Image paodanimg = GameUtil.getImage("img/dan.png");

    Plan plan = new Plan(planeimg, 250, 250);
    Paodan paodan = new Paodan(paodanimg,10 ,10 );

    Date starttime = new Date();
    Date endtime;
    int alltime;

    @Override
    public void paint(Graphics g){
        g.drawImage(bg, 0,0,null);
        paodan.drawSelf(g);
        plan.drawSelf(g);//画飞机
        boolean peng = paodan.getRectanggle().intersects(plan.getRectanggle());
        if (peng){
            plan.live = false;
            endtime = new Date();
            alltime = (int)(endtime.getTime() - starttime.getTime());
        }
        g.drawString("活了" + alltime + "秒", (int)plan.x, (int)plan.y);
    }

    class PaintThread extends Thread{

        @Override
        public void run(){
            while(true){
            repaint();
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            }
        }
    }

    class KeyMonitor extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e) {
            plan.addDirection(e);
        }

        @Override
        public void keyReleased(KeyEvent e) {
            plan.descDirection(e);
        }
    }


    /**
     * 初始化窗口
     */
    public void launchFrame(){
        this.setTitle("飞gay");
        this.setVisible(true);
        this.setSize(450,366);
        this.setLocation(300,300);

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        new PaintThread().start();
        addKeyListener(new KeyMonitor());
    }

    public static void main(String[] args) {
        MyGame01 game = new MyGame01();
        game.launchFrame();
    }
}
