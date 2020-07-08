package com.company;

public class Grid {

    // Fields
    int[][] grid = new int[6][7];

    //Methods
    public void CreateGrid()
    {
        for(int i = 0; i < grid.length; i++)
        {
            System.out.println();
            for(int j = 0; j < grid.length + 1; j++)
            {
                grid[i][j] = 0;
                System.out.print(grid[i][j] + " ");
            }
        }
    }
}
