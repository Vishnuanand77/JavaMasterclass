package com.vishnu.udemy;

public class CodingEx18_SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12,23));
        System.out.println(hasSharedDigit(9,99));
        System.out.println(hasSharedDigit(15,55));
    }
    public static boolean hasSharedDigit(int num1, int num2){
        //Check if two numbers are within the given range
        if((num1 >= 10 && num1 <=99) && (num2 >= 10 && num2 <= 99)){
            if((num1%10 == num2%10) || (num1/10 == num2/10) || (num1/10 == num2%10) || (num1%10 == num2/10)){
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}
