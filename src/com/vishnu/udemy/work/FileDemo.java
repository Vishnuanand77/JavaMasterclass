package com.vishnu.udemy.work;

import java.io.FileReader;

public class FileDemo
{
    public static void main(String[] args)
    {
        try {
            FileReader file = new FileReader("log.txt");
            int i;
            while((i = file.read()) != -1){
                System.out.print((char) i);
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
