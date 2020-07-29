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

import java.util.Arrays;

public class Grid
{
    // Fields
    int[][] grid = new int[6][7];
    int[] row = new int[8];

    //Methods

    // Create a 2d array(i = row, j = column)
    public void CreateGrid()
    {
        // Rows
        for (int i = 0; i < grid.length; i++)
        {
            // Columns
            for (int j = 0; j < grid.length + 1; j++)
            {
                grid[i][j] = 0;
            }
        }
    }

    // Control the entries by increasing the height of the cell
    public void CreateRows()
    {
        Arrays.fill(row, 5);
    }

    public void UpdateGrid(int player, int[] row, int column)
    {
        // Insert the player's number on the selected cell (we use height(array of 5's) to start from the bottom and decrease to move upwards)
        grid[row[column]][column] = player;
        row[column]--;
    }

    public void DisplayGrid()
    {
        int i = 0;

        for (int[] ints : grid)
        {
            System.out.println();
            System.out.print(i + "| ");
            i++;
            for (int j = 0; j < grid.length + 1; j++)
            {
                System.out.print(ints[j] + " ");
            }
        }
    }
}
