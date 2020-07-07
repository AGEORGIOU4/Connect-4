package com.company;

public class Player {

    // Fields
    int random = (int) (Math.random() * 2 + 1);

    // Methods
    public void SelectPlayer()
    {
        if (random == 1)
        {
            System.out.println("Player 1 it's your turn! \n");
            random = 2;
        }
        else if (random == 2)
        {
            System.out.println("Player 2 it's your turn! \n");
            random = 1;
        }
    }
}
