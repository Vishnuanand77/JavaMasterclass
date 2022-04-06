package com.vishnu.udemy.work.bankaccountdetails;

import java.util.Scanner;
public class AccountDetails {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        AccountDetails accountDetails = new AccountDetails();
        Account account = accountDetails.getAccountDetails();
        boolean withdrawn = account.withdraw(accountDetails.getWithdrawAmount());
    }

    public static Account getAccountDetails(){
        // Get input related to account and return an account object.
        Account account = new Account();

        System.out.println("Enter account id:");
        int accountId = scanner.nextInt();
        System.out.println("Enter account type:");
        String accType = scanner.next();

        while(true){
            System.out.println("Enter balance:");
            int balance = scanner.nextInt();
            if(balance <= 0) {
                System.out.println("Balance should be positive");
            } else {
                account.setBalance(balance);
                break;
            }
        }

        account.setAccountId(accountId);
        account.setAccountType(accType);

        return account;
    }

    public static int getWithdrawAmount(){
        // Method gets the amount to be withdrawn as input
        int withdrawAmt;

        while(true){
            System.out.println("Enter amount to be withdrawn:");
            withdrawAmt = scanner.nextInt();
            if(withdrawAmt <= 0) {
                System.out.println("Balance should be positive");
            } else {
                break;
            }
        }

        return withdrawAmt;
    }
}
