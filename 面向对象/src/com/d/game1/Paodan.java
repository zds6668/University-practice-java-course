package com.d.game1;

import java.awt.*;

public class Paodan extends BaseObject {
    double degree;

    public Paodan(Image img, double x, double y) {
        super(img, x, y);
        speed = 15;
        width = 10;
        height = 10;
        degree = Math.random() * Math.PI * 2;
    }

    public void drawSelf(Graphics g){
        g.drawImage(img, (int)x, (int)y,null);
        x += speed * Math.cos(degree);
        y += speed * Math.sin(degree);

        if (x < 0 || x > 430) {
            degree = Math.PI - degree;
        }
        if (y < 20 || y > 350) {
            degree = -degree;
        }
    }
}

