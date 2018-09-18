package com.d.usedClass;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class TestCalendar {
    public static void main(String[] args){
        Calendar c = new GregorianCalendar();
        c.set(2008, 8, 8);
        System.out.println(c.get(Calendar.YEAR));

        c.add(Calendar.YEAR, 10);
        System.out.println(c.get(Calendar.YEAR));
    }
}
