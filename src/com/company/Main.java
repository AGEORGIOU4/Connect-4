package com.company;

public class Main
{
    public static void main(String[] args)
    {
        // Classes
        Game game = new Game();
        Player player = new Player();
        Grid grid = new Grid();
        Display display = new Display();

        // Variables
        int counter = 0;
        int random = 1;
        int currentPlayer = 1;
        int userInput;
        int maxCounter = 42;
        boolean valid;

        // Things that happen only once
        grid.CreateGrid();
        grid.ControlHeight();

        //=======================================Game Runtime=======================================//

        while (counter < maxCounter)
        {
            // 1) Select Player
            player.SelectPlayer(random);

            // 2) Display the Grid
            grid.DisplayGrid();
            display.DisplayNumbers();

            // 3) Start the game
            userInput = game.getInput();
            valid = game.isHeightValid(grid.height[userInput]);

            // 4a) Update the Grid if user input is valid
            if (valid)
            {
                grid.UpdateGrid(currentPlayer, userInput);

                // 5) Switch Players
                random *= -1;

                if (random > 0)
                {
                    currentPlayer = 1;
                }
                else if (random < 0)
                {
                    currentPlayer = 2;
                }

                //New frame
                counter++;
            }
            // 4b) Display a warning message if the number is not valid
            else
            {
                System.out.print("Please enter a valid number!");
            }
            // 6) Game is Finished
            game.gameIsFinished(counter, maxCounter);
        }
    }
}
