package com.company;

public class Checks
{
    public boolean IsConnectFour(int[][] grid, Display display, int[] row, int column)
    {

        boolean isConnectFour = false;
        System.out.println("Row: " + (row[column] + 1));
        System.out.println("Column: " + column);
        System.out.println(grid[row[column] + 1][column]);
        int rowCounter = 0;
        int columnCounter = 0;
        int diagonalCounter = 0;


        // Check rows
        if (grid[row[column] + 1][column] != 0)
        {
            for (int i = 0; i < grid.length + 1; i++)
            {
                if (grid[row[column] + 1][column] == grid[row[column] + 1][i])
                {
                    rowCounter++;
                    if (rowCounter == 4)
                    {
                        display.DisplayWinningMessage();
                        isConnectFour = true;
                    }
                }
            }
        }

        // Check columns
        if (grid[row[column] + 1][column] != 0)
        {
            for (int i = 0; i < grid.length; i++)
            {
                if (grid[row[column] + 1][column] == grid[i][column])
                {
                    columnCounter++;
                    if (columnCounter == 4)
                    {
                        display.DisplayWinningMessage();
                        isConnectFour = true;
                    }
                }
            }
        }

        // Check diagonal Left to Right
        int num = -3;
        int num2 = 1;
        if (grid[row[column] + 1][column] != 0)
        {
            if (column >= 3)
            {
                for (int i = 5; i > -1; i--)
                {
                    if (grid[row[column] + 1][column] == grid[i][column + num])
                    {
                        num++;
                        diagonalCounter++;
                        if (diagonalCounter == 4)
                        {
                            System.out.println("yeeees!");
                            break;
                        }
                    }
                }
            }
        }
        else if (column < 3)
        {
            for (int i = 5; i > -1; i--)
            {
                if (grid[row[column] + 1][column] == grid[i][column + num2])
                {
                    num++;
                    diagonalCounter++;
                    if (diagonalCounter == 4)
                    {
                        System.out.println("yeeees!");
                        break;
                    }
                }
            }
        }

        return isConnectFour;
    }
}

