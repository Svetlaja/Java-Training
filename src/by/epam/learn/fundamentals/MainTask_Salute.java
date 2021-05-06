package by.epam.learn.fundamentals;

import java.io.IOException;

import java.io.*;

public class MainTask_Salute {
    public static void main (String [] args) {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader bis = new BufferedReader(is);
        try{
            System.out.println("Enter user's name: ");
            String name = bis.readLine();
            System.out.println("Hello, " + name);
        }
        catch(IOException e)
        {
            System.out.println("Input error " + e);
        }
    }
}