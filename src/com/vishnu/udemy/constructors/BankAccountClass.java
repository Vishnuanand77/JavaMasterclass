package com.vishnu.udemy.constructors;

public class BankAccountClass {
    //Fields
    long accountNumber, balance;
    String customerName, email, phoneNumber;

    //Setters
    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(long balance) {
        this.balance = 0;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

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
        System.out.println("Amount Deposited Successfully!");
    }

    public void withdrawFunds(int amount){
        if(this.balance-amount < 0) {
            System.out.println("Insufficient Funds");
        } else{
            this.balance-=amount;
        }
    }
}
