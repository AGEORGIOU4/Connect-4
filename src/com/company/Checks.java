package com.company;

public class Checks
{

    // FIELDS
    int[][] grid;
    int[] row;
    int column;
    int c;
    int r;
    int i = column;
    boolean isConnectFour = false;

    //Check rows (for performing, don't check if there are not 4 moves on the row yet
    public boolean checkRows(int[][] grid, Display display, int[] row, int column)
    {

        r = row[column] + 1;
        c = column;

        for (int i = 5; i > -1; i--)
        {
            if (grid[i][c] != 0 && i - 3 > -1 &&
                    r <= 2 &&
                    grid[i][c] == grid[i - 1][c] &&
                    grid[i - 1][c] == grid[i - 2][c] &&
                    grid[i - 2][c] == grid[i - 3][c])
            {
                display.DisplayWinningMessage();
                isConnectFour = true;
            }
        }
        return isConnectFour;
    }


    public boolean checkColumns(int[][] grid, Display display, int[] row, int column)
    {
        r = row[column] + 1;
        c = column;

        // Check only right (1 check)
        switch (column)
        {
            case 0:
                checkRightwards(grid, display, row, column);
                break;
            case 1:
                checkRightwards(grid, display, row, column);
                checkOneLeftTwoRight(grid, display, row, column);
                break;
            case 2:
                checkRightwards(grid, display, row, column);
                checkOneLeftTwoRight(grid, display, row, column);
                checkTwoLeftOneRight(grid, display, row, column);
                checkOneRightTwoLeft(grid, display, row, column);
                checkTwoRightOneLeft(grid, display, row, column);
                break;
            case 3:
                checkRightwards(grid, display, row, column);
                checkOneLeftTwoRight(grid, display, row, column);
                checkTwoLeftOneRight(grid, display, row, column);
                checkOneRightTwoLeft(grid, display, row, column);
                checkTwoRightOneLeft(grid, display, row, column);
                checkLeftwards(grid, display, row, column);
            case 4:
                checkOneLeftTwoRight(grid, display, row, column);
                checkTwoLeftOneRight(grid, display, row, column);
                checkOneRightTwoLeft(grid, display, row, column);
                checkTwoRightOneLeft(grid, display, row, column);
                checkLeftwards(grid, display, row, column);
            case 5:
                checkLeftwards(grid, display, row, column);
                checkOneRightTwoLeft(grid, display, row, column);
            case 6:
                checkLeftwards(grid, display, row, column);
                break;
        }
        return isConnectFour;
    }


    public boolean checkRightwards(int[][] grid, Display display, int[] row, int column)
    {
        i = column;

        if (grid[r][i] == grid[r][i + 1] &&
                grid[r][i + 1] == grid[r][i + 2] &&
                grid[r][i + 2] == grid[r][i + 3])
        {
            display.DisplayWinningMessage();
            isConnectFour = true;
        }
        return isConnectFour;
    }

    public boolean checkLeftwards(int[][] grid, Display display, int[] row, int column)
    {
        i = column;

        if (grid[r][i] != 0 &&
                grid[r][i] == grid[r][i - 1] &&
                grid[r][i - 1] == grid[r][i - 2] &&
                grid[r][i - 2] == grid[r][i - 3])
        {
            display.DisplayWinningMessage();
            isConnectFour = true;
        }
        return isConnectFour;
    }

    public boolean checkOneLeftTwoRight(int[][] grid, Display display, int[] row, int column)
    {
        i = column;

        if (grid[r][i] != 0 &&
                grid[r][i] == grid[r][i - 1] &&
                grid[r][i] == grid[r][i + 1] &&
                grid[r][i + 1] == grid[r][i + 2])
        {
            display.DisplayWinningMessage();
            isConnectFour = true;
        }
        return isConnectFour;
    }

    public boolean checkOneRightTwoLeft(int[][] grid, Display display, int[] row, int column)
    {
        i = column;

        if (grid[r][i] != 0 &&
                grid[r][i] == grid[r][i - 1] &&
                grid[r][i] == grid[r][i + 1] &&
                grid[r][i + 1] == grid[r][i + 2])
        {
            display.DisplayWinningMessage();
            isConnectFour = true;
        }
        return isConnectFour;
    }

    public boolean checkTwoLeftOneRight(int[][] grid, Display display, int[] row, int column)
    {
        i = column;

        if (grid[r][i] != 0 &&
                grid[r][i] == grid[r][i + 1] &&
                grid[r][i] == grid[r][i - 1] &&
                grid[r][i - 1] == grid[r][i - 2])
        {
            display.DisplayWinningMessage();
            isConnectFour = true;
        }
        return isConnectFour;
    }

    public boolean checkTwoRightOneLeft(int[][] grid, Display display, int[] row, int column)
    {
        i = column;

        if (grid[r][i] != 0 &&
                grid[r][i] == grid[r][i - 1] &&
                grid[r][i] == grid[r][i + 1] &&
                grid[r][i + 1] == grid[r][i + 2])
        {
            display.DisplayWinningMessage();
            isConnectFour = true;
        }
        return isConnectFour;
    }


    public boolean isConnectFour(int[][] grid, Display display, int[] row, int column, int counter)
    {
        if (counter >= 6)
        {
            checkRows(grid, display, row, column);
            checkColumns(grid, display, row, column);
        }
        return isConnectFour;
    }
}

