package com.company;

import java.util.Scanner;

public class Game
{

    boolean isGameFinished = false;

    public int GetUserInput()
    {
        Scanner myScanner = new Scanner(System.in);
        System.out.println();

        return myScanner.nextInt();
    }

    public boolean IsUserInputValid(int userInput)
    {
        boolean userInputValid;
        if (userInput > -1 && userInput < 7)
        {
            userInputValid = true;
        }
        else
        {
            System.out.println("Enter a column between 0-6!");
            userInputValid = false;
        }
        return userInputValid;
    }

    public boolean IsHeightValid(int heightInput)
    {
        boolean heightValid;

        heightValid = heightInput >= 0 && heightInput < 8;
        return heightValid;
    }

    public boolean GameIsFinished(int counter, int maxCounter, Grid grid, Display display)
    {
        if (counter == maxCounter)
        {
            System.out.println("Game is Finished!");
            isGameFinished = true;
        }
        return isGameFinished;
    }
}
