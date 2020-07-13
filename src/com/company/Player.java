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
