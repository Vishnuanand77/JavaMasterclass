package com.vishnu.udemy;
//Udemy Code Challenge
public class MethodOverloading {
    public static void main(String[] args){
        //Method Overloading Challenge
        System.out.println(calcFeetAndInchesToCentimeters(0,1));
        System.out.println(calcFeetAndInchesToCentimeters(100));
    }

    //Method Overloading Challenge
    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        double cm = 0;
        //Parameter validation
        if (feet >= 0 && inches >= 0 && inches <= 12){
            double feetToInch = feet * 12;
            cm = (feetToInch + inches) * 2.54;
        } else {
            return -1;
        }
        return cm;
    }
    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches >= 0){
            double feet = (int) (inches / 12);
            return calcFeetAndInchesToCentimeters(feet, inches%12);
        }
        return -1;
    }
}
