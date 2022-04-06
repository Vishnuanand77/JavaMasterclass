package com.vishnu.udemy.work.RegisterACandidate_UserDefinedException;

public class InvalidSalaryException extends Exception{
    public InvalidSalaryException(String message){
        super(message);
    }
}
