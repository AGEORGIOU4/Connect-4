/**
 * Author: Andreas Georgiou
 * Email: ageorgiou4@uclan.ac.uk
 * Connect Four is a two player classic board game. To win this game,
 * the player must connect a line by four discs in a horizontal,
 * vertical or diagonal row (numbers in this case)
 * This program was assigned at UCLan as a Summer Hacker Challenge
 * I have tried to reduce as much as possible the checks for optimal performance
 */

package com.company;

public class Player
{
    public void SelectPlayer(int random)
    {
        if (random == 1)
        {
            System.out.println("\nPlayer 1 it's your turn!");
        }
        if (random == 2)
        {
            System.out.println("\nPlayer 2 it's your turn!");
        }
    }

    public int SwitchRandom(int random)
    {
        if (random == 1)
        {
            random = 2;
        }
        else
        {
            random = 1;
        }

        return random;
    }

    public int SwitchPlayer(int currentPlayer, int random)
    {
        if (random == 1)
        {
            currentPlayer = 1;
        }
        else if (random == 2)
        {
            currentPlayer = 2;
        }
        return currentPlayer;
    }
}
