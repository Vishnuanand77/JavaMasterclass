package com.vishnu.udemy;

public class CodingEx14_SumOdd {
    public static void main(String[] args) {
        System.out.println(sumOdd(1, 100));
        System.out.println(sumOdd(-1, 100));
        System.out.println(sumOdd(100, 100));
        System.out.println(sumOdd(13, 13));
    }

    public static boolean isOdd(int num){
        return num % 2 == 1;
    }
    public static int sumOdd(int start, int end){
        int sum = 0;
        if(end < start || start < 0){
            return -1;
        } else {
            for (int i = start; i<=end; i++){
                if(isOdd(i)){
                    sum += i;
                }
            }
        }
        return sum;
    }
}
