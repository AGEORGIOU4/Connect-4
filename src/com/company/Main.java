package com.company;

public class Main {

    public static void main(String[] args)
    {

//        // Variables
//        int random = 1;
//
//        // Import Classes
//        Board b = new Board();
//        Player p = new Player();
//        Display d = new Display();
//
//        // Select player
//        p.SelectPlayer(random);
//
//        // Create and display board
//        b.CreateBoard();
//        b.DisplayBoard();
//
//        // Game Runtime
//        while(b.counter < 42) {
//            d.DisplayNumbers();
//
//            //User selects column
//            b.EnterNumber();
//
//            //Board is updated
//            b.UpdateBoard(random);
//
//            //Switch players
//            if(random == 1)
//            {
//                random++;
//            }
//            else
//            {
//                random--;
//            }
//
//            //New frame
//            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
//            //Display current player
//            p.SelectPlayer(random);
//
//            //Display updated board
//            b.DisplayBoard();
//
//            System.out.println();
//
//        }

        Grid g = new Grid();
        g.CreateGrid();
    }
}
