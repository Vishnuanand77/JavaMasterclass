package com.vishnu.udemy.work.PlacementEnrollmentCount;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter all roll number separated by comma");
        Stream<String> rollNumberStream = Main.getRollNumbers(sc.nextLine());

        System.out.println("Enter the department name acronym");
        String department = sc.nextLine();


        int count = Main.getCount(rollNumberStream, department);

        if (count == 0){
            System.out.println("No students from " + department);
        } else {
            System.out.println("Number of students in " + department + " is " + count);
        }

    }

    // Function to separate each roll number by comma and return a stream
    public static Stream<String> getRollNumbers(String rollNumbers) {
        return Arrays.stream(rollNumbers.split(","));
    }

    // Function to return the number of students from a department
    public static int getCount(Stream<String> rollNumberStream, String dept) {
        return (int)rollNumberStream.filter(s->s.substring(0,2).equalsIgnoreCase(dept)).count();
    }

}
