package com.company;

public class Checks
{

    // FIELDS
    int c;
    int r;

    boolean isConnectFour = false;


    public boolean isConnectFour(int[][] grid, Display display, int[] row, int column, int counter)
    {
        if (counter >= 6)
        {
            checkRows(grid, display, row, column);
            checkColumns(grid, display, row, column);
        }
        if (counter >= 10)
        {
            checkDiagonal(grid, display, row, column);
        }
        return isConnectFour;
    }

    //Check rows (for performing, don't check if there are not 4 moves on the row yet
    public void checkRows(int[][] grid, Display display, int[] row, int column)
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
                break;
            }
        }
    }

    //=========================COLUMN CHECKS===========================//

    public void checkRightwards(int[][] grid, Display display)
    {
        if (grid[r][c] == grid[r][c + 1] &&
                grid[r][c + 1] == grid[r][c + 2] &&
                grid[r][c + 2] == grid[r][c + 3])
        {
            display.DisplayWinningMessage();
            isConnectFour = true;
        }
    }

    public void checkLeftwards(int[][] grid, Display display)
    {
        if (grid[r][c] != 0 &&
                grid[r][c] == grid[r][c - 1] &&
                grid[r][c - 1] == grid[r][c - 2] &&
                grid[r][c - 2] == grid[r][c - 3])
        {
            display.DisplayWinningMessage();
            isConnectFour = true;
        }
    }

    public void checkOneLeftTwoRight(int[][] grid, Display display)
    {
        if (grid[r][c] != 0 &&
                grid[r][c] == grid[r][c - 1] &&
                grid[r][c] == grid[r][c + 1] &&
                grid[r][c + 1] == grid[r][c + 2])
        {
            display.DisplayWinningMessage();
            isConnectFour = true;
        }
    }

    public void checkOneRightTwoLeft(int[][] grid, Display display)
    {
        if (grid[r][c] != 0 &&
                grid[r][c] == grid[r][c - 1] &&
                grid[r][c] == grid[r][c + 1] &&
                grid[r][c + 1] == grid[r][c + 2])
        {
            display.DisplayWinningMessage();
            isConnectFour = true;
        }
    }

    public void checkTwoLeftOneRight(int[][] grid, Display display)
    {
        if (grid[r][c] != 0 &&
                grid[r][c] == grid[r][c + 1] &&
                grid[r][c] == grid[r][c - 1] &&
                grid[r][c - 1] == grid[r][c - 2])
        {
            display.DisplayWinningMessage();
            isConnectFour = true;
        }
    }

    public void checkTwoRightOneLeft(int[][] grid, Display display)
    {
        if (grid[r][c] != 0 &&
                grid[r][c] == grid[r][c - 1] &&
                grid[r][c] == grid[r][c + 1] &&
                grid[r][c + 1] == grid[r][c + 2])
        {
            display.DisplayWinningMessage();
            isConnectFour = true;
        }
    }

    public void checkColumns(int[][] grid, Display display, int[] row, int column)
    {
        r = row[column] + 1;
        c = column;

        switch (column)
        {
            case 0:
                checkRightwards(grid, display);
                break;
            case 1:
                checkRightwards(grid, display);
                checkOneLeftTwoRight(grid, display);
                break;
            case 2:
                checkRightwards(grid, display);
                checkOneLeftTwoRight(grid, display);
                checkTwoLeftOneRight(grid, display);
                checkOneRightTwoLeft(grid, display);
                checkTwoRightOneLeft(grid, display);
                break;
            case 3:
                checkRightwards(grid, display);
                checkOneLeftTwoRight(grid, display);
                checkTwoLeftOneRight(grid, display);
                checkOneRightTwoLeft(grid, display);
                checkTwoRightOneLeft(grid, display);
                checkLeftwards(grid, display);
                break;
            case 4:
                checkOneLeftTwoRight(grid, display);
                checkTwoLeftOneRight(grid, display);
                checkOneRightTwoLeft(grid, display);
                checkTwoRightOneLeft(grid, display);
                checkLeftwards(grid, display);
                break;
            case 5:
                checkLeftwards(grid, display);
                checkOneRightTwoLeft(grid, display);
                break;
            case 6:
                checkLeftwards(grid, display);
                break;
        }
    }

    public void checkDiagonal(int[][] grid, Display display, int[] row, int column)
    {
        r = row[column] + 1;
        c = column;

        checkLeftwardDiagonal(grid, display);
        checkRightwardDiagonal(grid, display);
    }
    //=========================DIAGONAL CHECKS===========================//

    public void checkLeftwardDiagonal(int[][] grid, Display display)
    {
        if (r <= 2 && r >= 0 && c >= 3 && c <= 6)
        {
            if (grid[r][c] != 0 &&
                    grid[r][c] == grid[r + 1][c - 1] &&
                    grid[r + 1][c - 1] == grid[r + 2][c - 2] &&
                    grid[r + 2][c - 2] == grid[r + 3][c - 3])
            {
                display.DisplayWinningMessage();
                isConnectFour = true;
            }
        }
    }

    public void checkRightwardDiagonal(int[][] grid, Display display)
    {
        if (r <= 2 && r >= 0 && c >= 0 && c <= 3)
        {
            if (grid[r][c] != 0 &&
                    grid[r][c] == grid[r + 1][c + 1] &&
                    grid[r + 1][c + 1] == grid[r + 2][c + 2] &&
                    grid[r + 2][c + 2] == grid[r + 3][c + 3])
            {
                display.DisplayWinningMessage();
                isConnectFour = true;
            }
        }
    }
}

