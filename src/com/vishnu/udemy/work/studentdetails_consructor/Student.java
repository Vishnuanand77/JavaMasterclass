package com.vishnu.udemy.work.studentdetails_consructor;

public class Student {
    private int studentId;
    private String studentName, studentAddress, collegeName;

    // Constructor for students from NIT
    public Student(int studentId, String studentName, String studentAddress){
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
        this.collegeName = "NIT";
    }

    // Constructor for students from other colleges
    public Student(int studentId, String studentName, String studentAddress, String collegeName){
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
        this.collegeName = collegeName;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public String getCollegeName() {
        return collegeName;
    }
}
