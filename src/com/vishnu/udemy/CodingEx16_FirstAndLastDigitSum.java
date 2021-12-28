package com.vishnu.udemy;

public class CodingEx16_FirstAndLastDigitSum {
    public static void main(String[] args) {
        sumFirstAndLastDigit(252);
        sumFirstAndLastDigit(257);
        sumFirstAndLastDigit(0);
        sumFirstAndLastDigit(-10);
    }

    public static int sumFirstAndLastDigit(int num){
        if(num < 0) return -1;

        int lastDigit = num % 10; //Picks the last digit
        while(num > 9){
            num = num/10;
        }
        System.out.println(lastDigit + num);
        return lastDigit + num;
    }
}
