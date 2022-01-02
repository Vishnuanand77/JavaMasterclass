package com.vishnu.udemy.constructors;

public class CodingEx31_WallArea {
    public static void main(String[] args) {
        Wall wall0 = new Wall();
        System.out.println("wall0 = " + wall0.getHeight());

        Wall wall = new Wall(5,4);
        System.out.println("area = " + wall.getArea());

        wall.setHeight(-1.5);
        System.out.println("new height = " + wall.getHeight());
    }
}
