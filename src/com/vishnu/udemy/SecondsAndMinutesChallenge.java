package com.vishnu.udemy;

public class SecondsAndMinutesChallenge {

    public static void main(String[] args){
        //Seconds and Minutes Challenge
        System.out.println(getDuration(61, 0));
        System.out.println(getDuration(1540));
    }
    //Seconds and Minutes Challenge
    public static String getDuration(int minutes, int seconds){
        if(minutes <0 || seconds <0 || seconds > 59){
            return "Invalid value";
        }

        int totalSeconds = minutes * 60 + seconds;
        int remainingSeconds = totalSeconds%60;
        int remainingMinutes = (totalSeconds%3600)/60;
        int hours = totalSeconds/3600;

        return hours + "h " + remainingMinutes + "m " + remainingSeconds + "s";
    }

    public static String getDuration(int seconds){
        if(seconds < 0)
            return "Invalid value";
        int minutes = (seconds%3600)/60;
        seconds = seconds%60;

        return getDuration(minutes, seconds);
    }
}

