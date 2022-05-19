package org.WalkerCC_CompSci;


import java.util.Scanner;

public class Game {
    private ConnectBoard connectBoard;
    private Players player1;
    private Players player2;
    private boolean isComplete = false;

    public Game(){
        connectBoard = new ConnectBoard();
        player1 = new Players(Space.X, 1);
        player2 = new Players(Space.O, 2);
    }


    public void Play() {


        Scanner myScan = new Scanner(System.in);
        connectBoard.Draw();

        while(true) {
            System.out.println("Player 1:  Enter a location number.");
            int location = myScan.nextInt();

            connectBoard.PlaceOnBoard(player1.getPiece(), location);
            boolean ifWon = CheckForWin();
            if (ifWon) {
                System.out.println("Player 1 Wins");
                connectBoard.Draw();
                return;
            }
            if (IsFilled()) {
                System.out.println("Draw:  All Spaces Filled");
                connectBoard.Draw();
                return;
            }
            connectBoard.Draw();

            System.out.println("Player 2:  Enter a location number.");
            location = myScan.nextInt();

            connectBoard.PlaceOnBoard(player2.getPiece(), location);
            ifWon = CheckForWin();
            if (ifWon) {
                System.out.println("Player 2 Wins");
                connectBoard.Draw();
                return;
            }
            if (IsFilled()) {
                System.out.println("Draw:  All Spaces Filled");
                connectBoard.Draw();
                return;
            }
            connectBoard.Draw();
        }




    }

    private boolean CheckForWin() {

        return false;
    }

    private boolean IsFilled(){

        return false;
    }

}
