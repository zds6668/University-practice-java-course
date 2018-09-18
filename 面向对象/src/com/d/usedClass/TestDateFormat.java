package com.d.usedClass;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDateFormat {
    public static void main(String[] args){
        DateFormat df = new SimpleDateFormat("yyyy/mm/dd");
        Date date = new Date();
        System.out.println(df.format(date)); //格式化字符串

        String time = "2007-10-7 20:15:30";
        DateFormat df1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        try {
            System.out.println(df1.parse(time));
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
