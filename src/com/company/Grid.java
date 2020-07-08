package com.company;
import java.util.Arrays;

public class Grid
{
    // Fields
    int[][] grid = new int[6][7];
    int[] height = new int[8];

    //Methods

    // Create a 2d array(i = row, j = column)
    public void CreateGrid()
    {
        for (int i = 0; i < grid.length; i++)
        {
            for (int j = 0; j < grid.length + 1; j++)
            {
                grid[i][j] = 0;
            }
        }
    }

    public void UpdateGrid(int player, int input)
    {
        // Insert the player's number on the selected cell
        grid[height[input]][input - 1] = player;
        height[input]--;
    }

    public void DisplayGrid()
    {
        for (int[] ints : grid)
        {
            System.out.println();
            for (int j = 0; j < grid.length + 1; j++)
            {
                System.out.print(ints[j] + " ");
            }
        }
    }

    // Control the entries by increasing the height of the cell
    public void ControlHeight()
    {
        Arrays.fill(height, 5);
    }
}
