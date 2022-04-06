package com.vishnu.udemy.work.EmployeeLoanPolymorphism;


public class Loan {

    //Implement the below method

    public double calculateLoanAmount(Employee employeeObj) {
        double loan = 0.0;

        if(employeeObj instanceof PermanentEmployee){
            loan = employeeObj.getSalary() * 0.15;
        } else if (employeeObj instanceof TemporaryEmployee){
            loan = employeeObj.getSalary() * 0.1;
        }

        return loan;
    }

}
