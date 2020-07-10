package com.company;

public class Checks
{
    public boolean IsConnectFour(int[][] grid, Display display, int[] row, int column)
    {

        boolean isConnectFour = false;
        System.out.println("Row: " + (row[column] + 1));
        System.out.println("Column: " + column);
        System.out.println(grid[row[column] + 1][column]);
        int counter = 0;


        // Check rows
        if (grid[row[column] + 1][column] != 0)
        {
            for (int i = 0; i < grid.length + 1; i++)
            {
                if (grid[row[column] + 1][column] == grid[row[column] + 1][i])
                {
                    counter++;
                    if (counter == 4)
                    {
                        display.DisplayWinningMessage();
                        isConnectFour = true;
                    }
                }
            }
        }
        return isConnectFour;
    }
}

