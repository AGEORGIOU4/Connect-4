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

}
