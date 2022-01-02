package com.vishnu.udemy.constructors;

public class constructorsChallenge_main {
    public static void main(String[] args) {

        //Using the setters method
//        BankAccountClass customer_vishnu = new BankAccountClass();

//        customer_vishnu.setAccountNumber(69696969);
//        customer_vishnu.setCustomerName("Vishnu Anand");
//        customer_vishnu.setEmail("vishnuanand2000@gmail.com");
//        customer_vishnu.setPhoneNumber("7338320727");

        BankAccountClass customer_vishnu = new BankAccountClass(
                696969,
                0,
                "Vishnu Anand",
                "vishnuanand2000@gmail.com",
                "7338320727");

        System.out.println(customer_vishnu.getCustomerName() + "\n"
                + customer_vishnu.getEmail() + "\n"
                + customer_vishnu.getPhoneNumber() + "\n"
                + customer_vishnu.getBalance() + "\n");

        customer_vishnu.depositFunds(1000);
        customer_vishnu.withdrawFunds(500);

        System.out.println(customer_vishnu.getBalance());

        customer_vishnu.withdrawFunds(501);
        System.out.println(customer_vishnu.getBalance());
    }
}
