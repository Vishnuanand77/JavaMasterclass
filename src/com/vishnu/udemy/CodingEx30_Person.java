package com.vishnu.udemy;

public class CodingEx30_Person {
    public static void main(String[] args) {
        Person person = new Person();

        person.setFirstName("");
        person.setLastName("");
        person.setAge(10);
        System.out.println("Full name : " + person.getFullName());
        System.out.println(person.isTeen());

        person.setFirstName("Vishnu");
        person.setAge(18);
        System.out.println(person.getFullName());
        System.out.println(person.isTeen());

        person.setLastName("Anand");
        System.out.println(person.getFullName());

        person.setFirstName("Tim");
        person.setLastName("Buchalka");
        System.out.println(person.getFullName());

    }
}
