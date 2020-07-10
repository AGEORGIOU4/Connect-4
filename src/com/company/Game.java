package com.company;
import java.util.Scanner;

public class Game
{
    public int getUserInput()
    {
        Scanner myScanner = new Scanner(System.in);
        System.out.println();

        int userInput = myScanner.nextInt();

        return userInput;
    }

    public boolean isUserInputValid(int userInput)
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

    public boolean isHeightValid(int heightInput)
    {
        boolean heightValid;

        if(heightInput >= 0 && heightInput < 8)
        {
            heightValid = true;
        }
        else
        {
            heightValid = false;
        }
        return heightValid;
    }

    public boolean gameIsFinished(int counter, int maxCounter, Grid grid)
    {
        boolean gameIsFinished = false;
        if(counter == maxCounter)
        {
            System.out.println("Game is Finished!");
            gameIsFinished = true;
        }
        return gameIsFinished;
    }

    public void restartGame()
    {

    }
}
