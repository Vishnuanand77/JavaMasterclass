package com.vishnu.udemy.work.studentdetails_consructor;

import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        // Scanner
        Scanner scanner = new Scanner(System.in);

        int sId;
        String sName, sAdd, collegeName;
        boolean isFromNIT;

        // User inputs
        System.out.println("Enter Student's Id:");
        sId = scanner.nextInt();
        System.out.println("Enter Student's Name:");
        sName = scanner.nextLine();
        System.out.println("Enter Student's address:");
        sAdd = scanner.nextLine();

        isFromNIT = false;
        collegeName = "";

        while(true){
            System.out.println("Whether the student is from NIT(Yes/No):");
            String input = scanner.nextLine();

            if (input == "yes" || input == "YES") {
                // If student is from NIT
                isFromNIT = true;
                break;
            } else if (input == "no" || input == "NO") {
                System.out.println("Enter the college name:");
                collegeName = scanner.nextLine();
                break;
            } else {
                System.out.println("Wrong Input");
            }
        }

        Student student;

        if(isFromNIT){
            student = new Student(sId, sName, sAdd);
        } else {
            student = new Student(sId, sName, sAdd, collegeName);
        }

        System.out.println("Student id:" + student.getStudentId());
        System.out.println("Student name:" + student.getStudentName());
        System.out.println("Address:" + student.getStudentAddress());
        System.out.println("Collage name:" + student.getCollegeName());

    }
}
