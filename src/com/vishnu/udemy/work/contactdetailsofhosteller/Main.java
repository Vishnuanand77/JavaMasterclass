package com.vishnu.udemy.work.contactdetailsofhosteller;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Hosteller student = getHostellerDetails();

        // Displaying final details
        System.out.println("The Student Details:");
        System.out.println(student.getStudentId() + " " + student.getName() + " " + student.getDepartmentId() + " " +
                student.getGender() + " " + student.getPhone() + " " + student.getHostelName() + " " + student.getRoomNumber());
    }

    public static Hosteller getHostellerDetails(){
        Scanner scanner = new Scanner(System.in);
        Hosteller student = new Hosteller();

        // Inputting student details
        System.out.println("Enter the details:");

        System.out.println("Student Id");
        int studentId = scanner.nextInt();
        student.setStudentId(studentId);

        System.out.println("Student Name");
        String studentName = scanner.next();
        student.setName(studentName);

        System.out.println("Department Id");
        int departmentId = scanner.nextInt();
        student.setDepartmentId(departmentId);

        System.out.println("Gender");
        String gender = scanner.next();
        student.setGender(gender);

        System.out.println("Phone Number");
        String phone = scanner.next();
        student.setPhone(phone);

        System.out.println("Hostel Name");
        String hostelName = scanner.next();
        student.setHostelName(hostelName);

        System.out.println("Room Number");
        int roomNumber = scanner.nextInt();
        student.setRoomNumber(roomNumber);

        System.out.println("Modify Room Number(Y/N)");
        String modifyRoomNum = scanner.next();

        if(Objects.equals(modifyRoomNum, "Y")){
            System.out.println("New Room Number");
            roomNumber = scanner.nextInt();
            student.setRoomNumber(roomNumber);
        }

        System.out.println("Modify Phone Number(Y/N)");
        String modifyPhone = scanner.next();

        if(Objects.equals(modifyPhone, "Y")){
            System.out.println("New Phone Number");
            phone = scanner.next();
            student.setPhone(phone);
        }

        return student;
    }
}
