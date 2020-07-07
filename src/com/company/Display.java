package com.company;

public class Display {

    // Fields

    public void DisplayNumbers()
    {
        //Display column numbers
        System.out.println("-------------");
        for (int i = 1; i < 8; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n-------------");
        System.out.println("Pick from 1-7");
        System.out.println("-------------");
    }
}
