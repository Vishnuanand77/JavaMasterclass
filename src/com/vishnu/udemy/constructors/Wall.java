package com.vishnu.udemy.constructors;

public class Wall {

    public double width, height;

    public Wall() {
        this(0,0);
    }

    public Wall(double width, double height) {
        //Init fields
        if(width < 0) this.width = 0;
        else this.width = width;

        if(height < 0) this.height = 0;
        else this.height = height;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        if(width < 0) this.width = 0;
        else this.width = width;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        if(height < 0) this.height = 0;
        else this.height = height;
    }

    public double getArea(){
        return this.width * this.height;
    }
}
