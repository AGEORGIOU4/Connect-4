package com.company;

import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
        // Classes
        Checks checks = new Checks();
        Display display = new Display();
        Game game = new Game();
        Grid grid = new Grid();
        Player player = new Player();

        // Variables
        int counter = 0;
        Random n = new Random();
        int random = n.nextInt(2);
        random += 1;
        int currentPlayer = random;
        int maxCounter = 42;

        int userInput;
        int[] row;
        int column;

        boolean userInputValid;
        boolean heightValid;
        boolean isConnectFour = false;
        boolean gameIsFinished = false;


        // Things that happen only once
        grid.CreateGrid();
        grid.CreateRows();

        //=======================================Game Runtime=======================================//

        while (counter < maxCounter)
        {

            // 1) Select Player
            player.SelectPlayer(random);

            // 2) Display the Grid & the indication numbers
            grid.DisplayGrid();
            display.DisplayNumbers();

            // 3) Start the game (user enters a number, program checks if the number is valid)
            userInput = game.getUserInput();
            userInputValid = game.isUserInputValid(userInput);

            /* Set current row and column */
            column = userInput;
            row = grid.row;

            /* While the input is not valid, program asks from the user to input a valid number */
            while (!userInputValid)
            {
                userInput = game.getUserInput();
                userInputValid = game.isUserInputValid(userInput);

                column = userInput;
                row = grid.row;
            }

            heightValid = game.isHeightValid(grid.row[column]);

            // 4a) Update the Grid if user input is valid and height is between in the limit
            if (heightValid)
            {
                // 5) Update Grid
                grid.UpdateGrid(currentPlayer, row, column);

                // 5a) Display the row and column of the last move
                display.DisplayRowColumn(grid.grid, row, column);

                // 6) Program checks for horizontal, vertical, diagonal connect 4 (for better performance start checking after 7 moves)
                isConnectFour = checks.isConnectFour(grid.grid, display, row, column, counter);

                // 7) Switch Players
                random = player.SwitchRandom(random);
                currentPlayer = player.SwitchPlayer(currentPlayer, random);

                //New frame
                counter++;
            }

            // 4b) Return
            else
            {
                display.DisplayHeightWarningMessage();
            }

            // 8) Game is Finished when all the cells are full or a player wins!
           gameIsFinished = game.gameIsFinished(counter, maxCounter, grid, display);

            if(isConnectFour || gameIsFinished)
            {
                grid.DisplayGrid();
                break;
            }
        }
    }
}
