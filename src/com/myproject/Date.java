package com.myproject;

public class Date extends Year {

    private int day;
    private String month;


    public Date(int whichYear, int day, String month){
        super(whichYear);
        this.day = day;
        this.month = month;
    }


    public void whatDate() {
        System.out.println("The date is " + month + ", " + day + ", " + whichYear);
    }
}