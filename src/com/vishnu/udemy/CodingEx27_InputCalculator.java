package com.vishnu.udemy;

import java.util.Scanner;

public class CodingEx27_InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);

        int sum = 0, count = 0;

        while(scanner.hasNextInt()){
            sum += scanner.nextInt();
            count++;
        }

        System.out.println("SUM = " + sum + " AVG = " + Math.round((double) sum/count));

        scanner.close();
    }
}
