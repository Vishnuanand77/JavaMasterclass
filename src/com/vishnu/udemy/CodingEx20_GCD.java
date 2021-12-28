package com.vishnu.udemy;

public class CodingEx20_GCD {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisor(9, 18));
    }
    public static int getGreatestCommonDivisor(int first, int second){
        if(first < 10 || second < 10) return -1;

        while(first != second){
            if(first > second){
                first = first -second;
            } else {
                second = second - first;
            }
        }
        return second;
    }
}
