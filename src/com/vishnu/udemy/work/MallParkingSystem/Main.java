package com.vishnu.udemy.work.MallParkingSystem;


import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {

    public static void main(String [] args) {
        LocalDateTime inTime = null, outTime = null;

        Scanner scanner = new Scanner(System.in);

        // Setting date and time format
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        // Hard coding the current time
        String currentTimeStr = "29/10/2019 20:10";

        System.out.println("In-time");
        String inTimeStr = scanner.nextLine();

        // Trying to parse the datetime string
        try {
            inTime = LocalDateTime.parse(inTimeStr, pattern);
        } catch (Exception e){
            System.out.println(inTimeStr + " is an invalid In-time");
            System.exit(1);
        }

        // Parsing the currentTimeStr
        LocalDateTime currentTime = LocalDateTime.parse(currentTimeStr, pattern);

        // Validating In-time
        if (inTime.compareTo(currentTime) >= 0){
            System.out.println(inTimeStr + " is an Invalid In-time");
            System.exit(1);
        }

        // Getting out time
        System.out.println("Out-time");
        String outTimeStr = scanner.nextLine();

        try {
            outTime = LocalDateTime.parse(outTimeStr, pattern);
        } catch (Exception e){
            System.out.println(outTimeStr + " is an Invalid Out-time");
            System.exit(1);
        }

        if (inTime.compareTo(outTime) >= 0){
            System.out.println(outTimeStr + " is an Invalid Out-time");
            System.exit(1);
        }

        // Calculating time difference
        long hours = inTime.until(outTime, ChronoUnit.HOURS);
        long fee = hours * 10 + 10L;

        System.out.println(fee + " Rupees");

    }
}
