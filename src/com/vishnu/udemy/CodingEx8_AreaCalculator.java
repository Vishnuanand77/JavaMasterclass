package com.vishnu.udemy;
//Udemy Code Challenge
public class CodingEx8_AreaCalculator {

    public static void main(String[] args) {
        //Coding Exercise 8 : Area Calculator
        System.out.println(area(10));
        System.out.println(area(5, 2));
    }

    //Coding Exercise 8 : Area Calculator
    public static double area(double radius) {
        if (radius < 0)
            return -1.0;
        return radius * radius * Math.PI;
    }

    public static double area(double x, double y) {
        if (x < 0 || y < 0)
            return -1.0;
        return x * y;

    }
}