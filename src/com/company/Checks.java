package com.company;

public class Checks
{

    // FIELDS
    int c;
    int r;

    boolean isConnectFour = false;


    public boolean IsConnectFour(int[][] grid, Display display, int[] row, int column, int counter)
    {
        if (counter >= 6)
        {
            CheckRows(grid, display, row, column);
            CheckColumns(grid, display, row, column);
        }
        if (counter >= 10)
        {
            CheckDiagonal(grid, display, row, column);
        }
        return isConnectFour;
    }

    //Check rows (for performing, don't check if there are not 4 moves on the row yet
    public void CheckRows(int[][] grid, Display display, int[] row, int column)
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

    public void CheckRightwards(int[][] grid, Display display)
    {
        if (grid[r][c] == grid[r][c + 1] &&
                grid[r][c + 1] == grid[r][c + 2] &&
                grid[r][c + 2] == grid[r][c + 3])
        {
            display.DisplayWinningMessage();
            isConnectFour = true;
        }
    }

    public void CheckLeftwards(int[][] grid, Display display)
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

    public void CheckOneLeftTwoRight(int[][] grid, Display display)
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

    public void CheckOneRightTwoLeft(int[][] grid, Display display)
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

    public void CheckTwoLeftOneRight(int[][] grid, Display display)
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

    public void CheckTwoRightOneLeft(int[][] grid, Display display)
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

    public void CheckColumns(int[][] grid, Display display, int[] row, int column)
    {
        r = row[column] + 1;
        c = column;

        switch (column)
        {
            case 0:
                CheckRightwards(grid, display);
                break;
            case 1:
                CheckRightwards(grid, display);
                CheckOneLeftTwoRight(grid, display);
                break;
            case 2:
                CheckRightwards(grid, display);
                CheckOneLeftTwoRight(grid, display);
                CheckTwoLeftOneRight(grid, display);
                CheckOneRightTwoLeft(grid, display);
                CheckTwoRightOneLeft(grid, display);
                break;
            case 3:
                CheckRightwards(grid, display);
                CheckOneLeftTwoRight(grid, display);
                CheckTwoLeftOneRight(grid, display);
                CheckOneRightTwoLeft(grid, display);
                CheckTwoRightOneLeft(grid, display);
                CheckLeftwards(grid, display);
                break;
            case 4:
                CheckOneLeftTwoRight(grid, display);
                CheckTwoLeftOneRight(grid, display);
                CheckOneRightTwoLeft(grid, display);
                CheckTwoRightOneLeft(grid, display);
                CheckLeftwards(grid, display);
                break;
            case 5:
                CheckLeftwards(grid, display);
                CheckOneRightTwoLeft(grid, display);
                break;
            case 6:
                CheckLeftwards(grid, display);
                break;
        }
    }

    public void CheckDiagonal(int[][] grid, Display display, int[] row, int column)
    {
        r = row[column] + 1;
        c = column;

        CheckLeftwardDiagonal(grid, display);
        CheckRightwardDiagonal(grid, display);
    }
    //=========================DIAGONAL CHECKS===========================//

    public void CheckLeftwardDiagonal(int[][] grid, Display display)
    {
        // Downwards
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

        // Upwards
        if (r <= 5 && r >= 3 && c >= 3 && c <= 6)
        {
            if (grid[r][c] != 0 &&
                    grid[r][c] == grid[r - 1][c - 1] &&
                    grid[r - 1][c - 1] == grid[r - 2][c - 2] &&
                    grid[r - 2][c - 2] == grid[r - 3][c - 3])
            {
                display.DisplayWinningMessage();
                isConnectFour = true;
            }
        }
    }

    public void CheckRightwardDiagonal(int[][] grid, Display display)
    {
        // Downwards
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

        // Upwards
        if (r <= 5 && r >= 3 && c >= 0 && c <= 3)
        {
            if (grid[r][c] != 0 &&
                    grid[r][c] == grid[r - 1][c + 1] &&
                    grid[r - 1][c + 1] == grid[r - 2][c + 2] &&
                    grid[r - 2][c + 2] == grid[r - 3][c + 3])
            {
                display.DisplayWinningMessage();
                isConnectFour = true;
            }
        }
    }
}

