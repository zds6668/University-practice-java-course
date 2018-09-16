package com.d.game1;


import java.awt.*;
import java.awt.event.KeyEvent;

public class Plan extends BaseObject {

    boolean left, right, up, down,live=true;
    int speed = 10;

    public Plan(Image img, double x, double y) {
        super(img, x, y);
        this.width = img.getWidth(null);
        this.height = img.getHeight(null);
    }

    public void drawSelf(Graphics g){
        if (live){
            g.drawImage(img, (int)x, (int)y,null);
            if (left){x -= speed;}
            if (right){x += speed;}
            if (up){y -= speed;}
            if (down){y += speed;}
        }
    }

    public void addDirection(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_LEFT:
                left = true;
                break;
            case KeyEvent.VK_RIGHT:
                right = true;
                break;
            case KeyEvent.VK_UP:
                up = true;
                break;
            case KeyEvent.VK_DOWN:
                down = true;
                break;
            default:
                break;
        }
    }
    public void descDirection(KeyEvent e){
        switch (e.getKeyCode()){
            case KeyEvent.VK_LEFT:
                left = false;
                break;
            case KeyEvent.VK_RIGHT:
                right = false;
                break;
            case KeyEvent.VK_UP:
                up = false;
                break;
            case KeyEvent.VK_DOWN:
                down = false;
                break;
            default:
                break;
        }
    }
}
