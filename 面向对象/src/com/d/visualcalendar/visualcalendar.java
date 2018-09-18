package com.d.visualcalendar;

import com.sun.javafx.image.BytePixelSetter;

import java.io.PrintStream;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class visualcalendar {
    public static void main(String[] args){
        String temp;
        System.out.println("按yyyy-MM-dd格式输入日期");
        Scanner scanner = new Scanner(System.in);
        temp = scanner.nextLine();
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = format.parse(temp);
            Calendar calendar = new GregorianCalendar();
            calendar.setTime(date);
            int curDay = calendar.get(Calendar.DATE);
            calendar.set(Calendar.DATE, 1);
//            System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
            int maxm = calendar.getActualMaximum(Calendar.DATE);
            System.out.println("日\t一\t二\t三\t四\t五\t六");
            for (int i = 0; i < calendar.get(Calendar.DAY_OF_WEEK)-1; i++) {
                System.out.print("\t");
            }
            for (int i = 1 ; i <= maxm; i++) {
                if (curDay == i){
                    System.out.println();
                }
                System.out.print(i + "\t");
                if(calendar.get(Calendar.DAY_OF_WEEK)==7){
                    System.out.println();
                }
                calendar.add(Calendar.DATE,1);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
