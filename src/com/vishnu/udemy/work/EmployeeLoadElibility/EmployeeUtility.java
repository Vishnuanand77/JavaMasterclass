package com.vishnu.udemy.work.EmployeeLoadElibility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EmployeeUtility {

    public Employee[] getEmployeeDetails(String[] details) {

        //Convert array of strings to array of employee objects

        int i = 0;
        int length = details.length;

        Employee[] employeeObj = new Employee[length]; // Main Employee object array

        while (i < length){
            String[] detailsArr = details[i].split(";"); // String array split based on a delimiter

            // Parsing employee details from split string
            String id = detailsArr[0]; String name = detailsArr[1]; double salary = Double.parseDouble(detailsArr[2]);

            // Temporary employee object
            Employee tempEmp = new Employee();
            tempEmp.setEmpId(id); tempEmp.setEmpName(name); tempEmp.setSalary(salary); // Setting employee details

            // Adding Employee object to Employee object array
            employeeObj[i] = tempEmp;

            i+=1;
        }

        return employeeObj;
    }

    public Stream<Employee> getStreamOfEmployee(Employee[] empDetails) {

        return Arrays.stream(empDetails);
    }

    public String[] shortlistedEmployee(Stream<Employee> empStream,double minSalary) {

        List<String> stringList = new ArrayList<>();

        empStream.filter(emp -> emp.getSalary() >= minSalary).forEach(x -> {
            String result = "";
            result += x.getEmpId() + " " + x.getEmpName() + " " + x.getSalary();
            stringList.add(result);
        });

        String[] stringArray = new String[stringList.size()];

        // Converting List to String[]
        int j = 0;
        for(String temp : stringList){
            stringArray[j] = temp;
            j+=1;
        }

        Arrays.sort(stringArray); // Sorting String[]

        return stringArray;
    }

}

