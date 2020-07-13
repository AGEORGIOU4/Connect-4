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
                break;
            }
        }
        return isConnectFour;
    }

    public boolean checkColumns(int[][] grid, Display display, int[] row, int column)
    {
        r = row[column] + 1;
        c = column;

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
                break;
            case 4:
                checkOneLeftTwoRight(grid, display, row, column);
                checkTwoLeftOneRight(grid, display, row, column);
                checkOneRightTwoLeft(grid, display, row, column);
                checkTwoRightOneLeft(grid, display, row, column);
                checkLeftwards(grid, display, row, column);
                break;
            case 5:
                checkLeftwards(grid, display, row, column);
                checkOneRightTwoLeft(grid, display, row, column);
                break;
            case 6:
                checkLeftwards(grid, display, row, column);
                break;
        }
        return isConnectFour;
    }

    public boolean checkDiagonal(int[][] grid, Display display, int[] row, int column)
    {
        r = row[column] + 1;
        c = column;

        checkLeftwardDiagonal(grid, display, row, column);
        checkRightwardDiagonal(grid, display, row, column);

        return isConnectFour;
    }

    //=========================COLUMN CHECKS===========================//

    public boolean checkRightwards(int[][] grid, Display display, int[] row, int column)
    {
        if (grid[r][c] == grid[r][c + 1] &&
                grid[r][c + 1] == grid[r][c + 2] &&
                grid[r][c + 2] == grid[r][c + 3])
        {
            display.DisplayWinningMessage();
            isConnectFour = true;
        }
        return isConnectFour;
    }

    public boolean checkLeftwards(int[][] grid, Display display, int[] row, int column)
    {
        if (grid[r][c] != 0 &&
                grid[r][c] == grid[r][c - 1] &&
                grid[r][c - 1] == grid[r][c - 2] &&
                grid[r][c - 2] == grid[r][c - 3])
        {
            display.DisplayWinningMessage();
            isConnectFour = true;
        }
        return isConnectFour;
    }

    public boolean checkOneLeftTwoRight(int[][] grid, Display display, int[] row, int column)
    {
        c = column;

        if (grid[r][c] != 0 &&
                grid[r][c] == grid[r][c - 1] &&
                grid[r][c] == grid[r][c + 1] &&
                grid[r][c + 1] == grid[r][c + 2])
        {
            display.DisplayWinningMessage();
            isConnectFour = true;
        }
        return isConnectFour;
    }

    public boolean checkOneRightTwoLeft(int[][] grid, Display display, int[] row, int column)
    {
        c = column;

        if (grid[r][c] != 0 &&
                grid[r][c] == grid[r][c - 1] &&
                grid[r][c] == grid[r][c + 1] &&
                grid[r][c + 1] == grid[r][c + 2])
        {
            display.DisplayWinningMessage();
            isConnectFour = true;
        }
        return isConnectFour;
    }

    public boolean checkTwoLeftOneRight(int[][] grid, Display display, int[] row, int column)
    {
        c = column;

        if (grid[r][c] != 0 &&
                grid[r][c] == grid[r][c + 1] &&
                grid[r][c] == grid[r][c - 1] &&
                grid[r][c - 1] == grid[r][c - 2])
        {
            display.DisplayWinningMessage();
            isConnectFour = true;
        }
        return isConnectFour;
    }

    public boolean checkTwoRightOneLeft(int[][] grid, Display display, int[] row, int column)
    {
        c = column;

        if (grid[r][c] != 0 &&
                grid[r][c] == grid[r][c - 1] &&
                grid[r][c] == grid[r][c + 1] &&
                grid[r][c + 1] == grid[r][c + 2])
        {
            display.DisplayWinningMessage();
            isConnectFour = true;
        }
        return isConnectFour;
    }

    //=========================DIAGONAL CHECKS===========================//

    public boolean checkLeftwardDiagonal(int[][] grid, Display display, int[] row, int column)
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
        return isConnectFour;
    }

    public boolean checkRightwardDiagonal(int[][] grid, Display display, int[] row, int column)
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
        return isConnectFour;
    }

}

