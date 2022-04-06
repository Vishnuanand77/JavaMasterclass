package com.vishnu.udemy.work.EmployeePromotion;

import java.text.DecimalFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number of employees");
        int size = sc.nextInt();

        String[] details = new String[size];
        List<Employee> list = new ArrayList<>();

        System.out.println("Enter the employee details");

        for(int i = 0; i < size; i++){
            details[i] = sc.next();
            String x[] = details[i].split(":");
            Employee employee = new Employee(x[0], x[1], Double.parseDouble(x[2]));
            list.add(employee);
        }

        System.out.println("Enter the number of times salary limit to be searched");
        int sizeSalaryLimit = sc.nextInt();

        String[] count = new String[sizeSalaryLimit];

        for (int i = 0; i < sizeSalaryLimit; i++){
            System.out.println("Enter the salary limit to be searched");
            double salaryLimit = sc.nextDouble();

            Management management = new Management(salaryLimit, list);
            management.run();
            int c = management.getCount();

            DecimalFormat df = new DecimalFormat("#.0");
            String d = df.format(salaryLimit);

            count[i] = d + ":" + c;
        }

        for (String s : count) {
            System.out.println(s);
        }



    }
}

