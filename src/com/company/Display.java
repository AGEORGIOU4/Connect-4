/**
 * Author: Andreas Georgiou
 * Email: ageorgiou4@uclan.ac.uk
 * Connect Four is a two player classic board game. To win this game,
 * the player must connect a line by four discs in a horizontal,
 * vertical or diagonal row (numbers in this case)
 * This program was assigned at UCLan as a Summer Hacker Challenge
 * I have tried to reduce as much as possible the checks for optimal performance
 */

package com.company;

public class Display
{
    public void DisplayNumbers()
    {
        //Display column numbers
        System.out.println("\n-------------------");
        System.out.print("   ");
        for (int i = 0; i < 7; i++)
        {
            System.out.print(i + " ");
        }
        System.out.println("\n-------------------");
        System.out.println("   Pick from 0-6");
        System.out.println("-------------------");
    }

    public void DisplayHeightWarningMessage()
    {
        System.out.println("\n--------------------");
        System.out.print("This column is full!");
        System.out.println("\n--------------------");
    }

    public void DisplayWinningMessage()
    {
        System.out.println("\n----------");
        System.out.print("Connect 4!");
        System.out.println("\n----------");
    }

    public void DisplayRowColumn(int[][] grid, int[] row, int column)
    {
        System.out.println("Row: " + (row[column] + 1));
        System.out.println("Column: " + column);
        System.out.println(grid[row[column] + 1][column]);
    }
}
