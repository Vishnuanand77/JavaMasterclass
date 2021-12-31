package com.vishnu.udemy;

public class SimpleCalculator {
    private double firstNumber, secondNumber;

    //Getters
    public double getFirstNumber(){
        return this.firstNumber;
    }
    public double getSecondNumber(){
        return this.secondNumber;
    }

    //Setters
    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }
    public void setSecondNumber(double secondNumber){
        this.secondNumber = secondNumber;
    }

    //Calculator Methods
    public double getAdditionResult(){
        return this.firstNumber + this.secondNumber;
    }
    public double getSubtractionResult(){
        return this.firstNumber - this.secondNumber;
    }
    public double getMultiplicationResult(){
        return this.firstNumber * this.secondNumber;
    }
    public double getDivisionResult(){
        if(this.secondNumber == 0) return 0;
        return this.firstNumber/this.secondNumber;
    }
}
