package com.vishnu.udemy.work.TravelAgency;

import java.util.Scanner;

public class UserInterface {

    public static void main(String args[]) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of passengers");
        int n=sc.nextInt();
        int p=1;
        double sum=0;
        Ticket[] t =new Ticket[n];
        int i=0;
        while(n!=0){
            System.out.println("Details of Passenger "+(p++)+":");
            System.out.println("Enter the pnr no:");
            long no=sc.nextLong();
            System.out.println("Enter passenger name:");
            String name=sc.next();
            System.out.println("Enter seat no:");
            int sno=sc.nextInt();
            System.out.println("Enter class type:");
            String ct=sc.next();
            System.out.println("Enter ticket fare:");
            double f=sc.nextDouble();
            t[i++]=new Ticket(no,name,sno,ct,f);

            n--;
        }
        System.out.println("Commission Obtained");
        CommissionInfo commissionInfo = generateCommissionObtained();
        for(int j=0;j<i;j++){
            sum+=commissionInfo.calculateCommissionAmount(t[j]);
        }
        System.out.printf("Commission obtained per each person: Rs.%.2f",sum);
    }

    public static CommissionInfo generateCommissionObtained(){
        CommissionInfo commissionInfo = (obj)->{
            String ticketClass = obj.getClassType();
            if (ticketClass.equalsIgnoreCase("1A") || ticketClass.equalsIgnoreCase("2A") || ticketClass.equalsIgnoreCase("3A")){
                return 100;
            } else {
                return 60;
            }
        };

        return commissionInfo;
    }

}
