package com.vishnu.udemy;

public class CodingEx21_AllFactors {
    public static void main(String[] args) {
        printFactor(-10);
        printFactor(32);
        printFactor(10);
    }

    public static void printFactor(int number){
        if(number < 1) System.out.println("Invalid Value");

        for(int i = 1; i<=number; i++){
            if(number%i == 0) System.out.println(i);
        }
    }
}
