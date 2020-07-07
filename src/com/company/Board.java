package com.company;

import java.util.Scanner;

public class Board {

    // Fields
    private int[] column1 = new int[6];
    private int[] column2 = new int[6];
    private int[] column3 = new int[6];
    private int[] column4 = new int[6];
    private int[] column5 = new int[6];
    private int[] column6 = new int[6];
    private int[] column7 = new int[6];

    public int input = 0;
    public int counter = 0;

    // Methods
    public void CreateBoard()
    {
        for (int i = 0; i < column1.length; i++) {
            column1[i] = 0;
            column2[i] = 0;
            column3[i] = 0;
            column4[i] = 0;
            column5[i] = 0;
            column6[i] = 0;
            column7[i] = 0;
        }
    }

    public void DisplayBoard()
    {
    for (int i = 0; i < column1.length; i++)
        {
            System.out.print(column1[i] + " ");
            System.out.print(column2[i] + " ");
            System.out.print(column3[i] + " ");
            System.out.print(column4[i] + " ");
            System.out.print(column5[i] + " ");
            System.out.print(column6[i] + " ");
            System.out.print(column7[i] + " ");
            System.out.println();
        }
    }

    public void EnterNumber()
    {
        Scanner myScanner = new Scanner(System.in);
        input = myScanner.nextInt();
    }

    public void UpdateBoard()
    {
        Player p = new Player();

        int player = p.random;

        if(input == 1)
        {
            column1[5] = player;
            counter++;
        }
        if(input == 2)
        {
            column2[5] = player;
            counter++;
        }
        if(input == 3)
        {
            column3[5] = player;
            counter++;
        }
        if(input == 4)
        {
            column4[5] = player;
            counter++;
        }
        if(input == 5)
        {
            column5[5] = player;
            counter++;
        }
        if(input == 6)
        {
            column6[5] = player;
            counter++;
        }
        if(input == 7)
        {
            column7[5] = player;
            counter++;
        }
    }
}