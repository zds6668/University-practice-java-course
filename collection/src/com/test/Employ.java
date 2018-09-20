package com.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Employ {
    private int id;
    private String name;
    private int salary;
    private Date hiredate;
    private String depatment;

    public Employ(int id, String name, int salary, String hiredate, String depatment) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.depatment = depatment;
        DateFormat format = new SimpleDateFormat("yy-MM");
        try {
            this.hiredate = format.parse(hiredate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    public void setDepatment(String depatment) {
        this.depatment = depatment;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public String getDepatment() {
        return depatment;
    }

}
