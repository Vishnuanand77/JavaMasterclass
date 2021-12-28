package com.vishnu.udemy;

public class CodingEx17_EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
    }

    public static int getEvenDigitSum(int num){

        //Check if number is 0 or negative
        if(num < 0) return -1;

        int sum = 0;

        while(num>0){
            //Check if number if even
            if(num%2 == 0){
                sum += num%10;
            }
            num /= 10;
        }

        return sum;
    }
}
