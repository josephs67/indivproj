package com.indivproj;

public class Year extends YearPoint {

    private int day;
    private String month;


    public YearPoint(int whichYear, int day, String month){
        super(whichYear);
        this.day = day;
        this.month = month;
    }


    public void whatDate() {
        System.out.println("The date is " + month + ", " + day + ", " + whichYear);
    }
}