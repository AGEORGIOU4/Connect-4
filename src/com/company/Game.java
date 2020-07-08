package com.company;
import java.util.Scanner;

public class Game
{
    public int getInput()
    {
        Scanner myScanner = new Scanner(System.in);
        System.out.println();

        // Fields
        int userInput = myScanner.nextInt();

        if (userInput > 0 && userInput < 8)
        {
            return userInput;
        }
        else
        {
            System.out.println("Enter a column between 1-7!");
            getInput();
        }
        return userInput;
    }

    public boolean isHeightValid(int heightInput)
    {
        boolean heightValid;
        heightValid = heightInput >= 0;
        return heightValid;
    }

    public void gameIsFinished(int counter, int maxCounter)
    {
        if(counter == maxCounter)
        {
            System.out.println("Game is Finished!");
        }
    }

    public void restartGame()
    {

    }
}
