package com.vishnu.udemy.constructors;

public class Point {
    private int x,y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(){
        //Return distance between a point and origin
        return (Math.sqrt(getX()*getX() + getY()*getY()));
    }

    public double distance(int x, int y){
        //Returns distance between the stored point and a given point
        return (Math.sqrt((getX() - x)*(getX() - x) + (getY() - y)*(getY() - y)));
    }

    public double distance(Point point){
        return distance(point.x, point.y);
    }
}
