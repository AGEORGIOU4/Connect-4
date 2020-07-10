package com.company;

public class Player
{
    public void SelectPlayer(int random)
    {
        if (random > 0)
        {
            System.out.println("\nPlayer 1 it's your turn!");
        }
        if (random < 0)
        {
            System.out.println("\nPlayer 2 it's your turn!");
        }
    }

    public int SwitchRandom(int random)
    {
        random *= -1;

        return random;
    }

    public int SwitchPlayer(int currentPlayer, int random)
    {
        if (random > 0)
        {
            currentPlayer = 1;
        }
        else if (random < 0)
        {
            currentPlayer = 2;
        }
        return currentPlayer;
    }
}
