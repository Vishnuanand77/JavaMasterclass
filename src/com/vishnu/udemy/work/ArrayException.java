package com.vishnu.udemy.work;

import java.lang.reflect.Array;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.SortedMap;

public class ArrayException {

    public String getPriceDetails(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array");
        int noOfElements = Integer.parseInt(scanner.next());

        System.out.println("Enter the price details");
        int[] elements = new int[noOfElements];

        for (int i = 0; i < noOfElements; i++){
            try {
                elements[i] = scanner.nextInt();
            } catch (InputMismatchException ie) {
                return "Input was not in the correct format" ;
            }
        }

        System.out.println("Enter the index of the array element you want to access");

        try {
            int index = scanner.nextInt();
            return  "The array element is " + elements[index] ;
        } catch (ArrayIndexOutOfBoundsException ae){
            return "Array index is out of range";
        } catch (InputMismatchException ie) {
            return "Input was not in the correct format" ;
        }

    }

    public static void main(String[] args) {
        System.out.println(new ArrayException().getPriceDetails());
    }
}
