package com.vishnu.udemy.constructors;

public class BankAccountClass {
    //Fields
    long accountNumber, balance;
    String customerName, email, phoneNumber;

    //Using a constructor instead of setters
    public BankAccountClass(long accountNumber, long balance, String customer, String email, String phoneNumber){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customer;
        this.email = email;
        this.phoneNumber = phoneNumber;

        System.out.println("Account Successfully Created \n");
    }

    //Setters
//    public void setAccountNumber(long accountNumber) {
//        this.accountNumber = accountNumber;
//    }
//
//    public void setBalance(long balance) {
//        this.balance = 0;
//    }
//
//    public void setCustomerName(String customerName) {
//        this.customerName = customerName;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public void setPhoneNumber(String phoneNumber) {
//        this.phoneNumber = phoneNumber;
//    }

    //Getters
    public long getAccountNumber() {
        return this.accountNumber;
    }

    public long getBalance() {
        return this.balance;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    //Additional Methods
    public void depositFunds(int deposit){
        this.balance += deposit;
        System.out.println("Amount Deposited Successfully! \n" + this.balance + " present in account");
    }

    public void withdrawFunds(int amount){
        if(this.balance-amount < 0) {
            System.out.println("Insufficient Funds" + "Current balance is : " + this.balance);
        } else{
            this.balance-=amount;
            System.out.println(amount + " withdrawn. Current balance is : " + this.balance);
        }
    }
}
