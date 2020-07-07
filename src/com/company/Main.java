package com.company;

public class Main {

    public static void main(String[] args)
    {
        System.out.println();

        // Import Classes
        Player p = new Player();
        Display d = new Display();
        Board b = new Board();

        // Select Player
        p.SelectPlayer();

        // Create and display board
        b.CreateBoard();
        b.DisplayBoard();

        // Game Runtime
        while(b.counter < 7) {
            d.DisplayNumbers();
            b.EnterNumber();
            b.UpdateBoard();
            b.DisplayBoard();
        }
    }
}
