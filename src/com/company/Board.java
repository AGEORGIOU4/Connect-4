package com.company;

import java.util.Scanner;

public class Board {

    // Fields
    public int input = 0;
    public int counter = 0;
    public int player = 0;
    public int changeLine1 = 0;
    public int changeLine2 = 0;
    public int changeLine3 = 0;
    public int changeLine4 = 0;
    public int changeLine5 = 0;
    public int changeLine6 = 0;
    public int changeLine7 = 0;


    private int[] column1 = new int[6];
    private int[] column2 = new int[6];
    private int[] column3 = new int[6];
    private int[] column4 = new int[6];
    private int[] column5 = new int[6];
    private int[] column6 = new int[6];
    private int[] column7 = new int[6];

    // Methods
    public void CreateBoard() {
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

    public void DisplayBoard() {
        for (int i = 0; i < column1.length; i++) {
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

    public void EnterNumber() {
        Scanner myScanner = new Scanner(System.in);
        input = myScanner.nextInt();
    }

    public void UpdateBoard(int random) {
        player = random;


        // Column 1
        if (input == 1 && changeLine1 == 5) {
            column1[0] = player;
            counter++;
            changeLine1++;
        }

        if (input == 1 && changeLine1 == 4) {
            column1[1] = player;
            counter++;
            changeLine1++;
        }
        if (input == 1 && changeLine1 == 3) {
            column1[2] = player;
            counter++;
            changeLine1++;
        }

        if (input == 1 && changeLine1 == 2) {
            column1[3] = player;
            counter++;
            changeLine1++;
        }
        if (input == 1 && changeLine1 == 1) {
            column1[4] = player;
            counter++;
            changeLine1++;
        }

        if (input == 1 && changeLine1 == 0) {
            column1[5] = player;
            counter++;
            changeLine1++;
        }

        // Column 2
        if (input == 2 && changeLine2 == 5) {
            column2[0] = player;
            counter++;
            changeLine2++;
        }

        if (input == 2 && changeLine2 == 4) {
            column2[1] = player;
            counter++;
            changeLine2++;
        }
        if (input == 2 && changeLine2 == 3) {
            column2[2] = player;
            counter++;
            changeLine2++;
        }

        if (input == 2 && changeLine2 == 2) {
            column2[3] = player;
            counter++;
            changeLine2++;
        }
        if (input == 2 && changeLine2 == 1) {
            column2[4] = player;
            counter++;
            changeLine2++;
        }

        if (input == 2 && changeLine2 == 0) {
            column2[5] = player;
            counter++;
            changeLine2++;
        }
        // Column 3
        if (input == 3 && changeLine3 == 5) {
            column3[0] = player;
            counter++;
            changeLine3++;
        }

        if (input == 3 && changeLine3 == 4) {
            column3[1] = player;
            counter++;
            changeLine3++;
        }
        if (input == 3 && changeLine3 == 3) {
            column3[2] = player;
            counter++;
            changeLine3++;
        }

        if (input == 3 && changeLine3 == 2) {
            column3[3] = player;
            counter++;
            changeLine3++;
        }
        if (input == 3 && changeLine3 == 1) {
            column3[4] = player;
            counter++;
            changeLine3++;
        }

        if (input == 3 && changeLine3 == 0) {
            column3[5] = player;
            counter++;
            changeLine3++;
        }
        // Column 4
        if (input == 4 && changeLine4 == 5) {
            column4[0] = player;
            counter++;
            changeLine4++;
        }

        if (input == 4 && changeLine4 == 4) {
            column4[1] = player;
            counter++;
            changeLine4++;
        }
        if (input == 4 && changeLine4 == 3) {
            column4[2] = player;
            counter++;
            changeLine4++;
        }

        if (input == 4 && changeLine4 == 2) {
            column4[3] = player;
            counter++;
            changeLine4++;
        }
        if (input == 4 && changeLine4 == 1) {
            column4[4] = player;
            counter++;
            changeLine4++;
        }

        if (input == 4 && changeLine4 == 0) {
            column4[5] = player;
            counter++;
            changeLine4++;
        }
        // Column 5
        if (input == 5 && changeLine5 == 5) {
            column5[0] = player;
            counter++;
            changeLine5++;
        }

        if (input == 5 && changeLine5 == 4) {
            column5[1] = player;
            counter++;
            changeLine5++;
        }
        if (input == 5 && changeLine5 == 3) {
            column5[2] = player;
            counter++;
            changeLine5++;
        }

        if (input == 5 && changeLine5 == 2) {
            column5[3] = player;
            counter++;
            changeLine5++;
        }
        if (input == 5 && changeLine5 == 1) {
            column5[4] = player;
            counter++;
            changeLine5++;
        }

        if (input == 5 && changeLine5 == 0) {
            column5[5] = player;
            counter++;
            changeLine5++;
        }
        // Column 6
        if (input == 6 && changeLine6 == 5) {
            column6[0] = player;
            counter++;
            changeLine6++;
        }

        if (input == 6 && changeLine6 == 4) {
            column6[1] = player;
            counter++;
            changeLine6++;
        }
        if (input == 6 && changeLine6 == 3) {
            column6[2] = player;
            counter++;
            changeLine6++;
        }

        if (input == 6 && changeLine6 == 2) {
            column6[3] = player;
            counter++;
            changeLine6++;
        }
        if (input == 6 && changeLine6 == 1) {
            column6[4] = player;
            counter++;
            changeLine6++;
        }

        if (input == 6 && changeLine6 == 0) {
            column6[5] = player;
            counter++;
            changeLine6++;
        }
        // Column7
        if (input == 7 && changeLine7 == 5) {
            column7[0] = player;
            counter++;
            changeLine7++;
        }

        if (input == 7 && changeLine7 == 4) {
            column7[1] = player;
            counter++;
            changeLine7++;
        }
        if (input == 7 && changeLine7 == 3) {
            column7[2] = player;
            counter++;
            changeLine7++;
        }

        if (input == 7 && changeLine7 == 2) {
            column7[3] = player;
            counter++;
            changeLine7++;
        }
        if (input == 7 && changeLine7 == 1) {
            column7[4] = player;
            counter++;
            changeLine7++;
        }

        if (input == 7 && changeLine7 == 0) {
            column7[5] = player;
            counter++;
            changeLine7++;
        }
    }
}