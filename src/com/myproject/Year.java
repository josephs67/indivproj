package com.myproject;

public class Year {
    public int whichYear;

    
    public Year(int whichYear) {
        this.whichYear = whichYear;
    }

    public void tellYear(){
        System.out.println("The year is " + whichYear);
    }

}
 