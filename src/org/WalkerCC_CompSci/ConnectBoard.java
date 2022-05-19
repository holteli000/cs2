package org.WalkerCC_CompSci;

public class ConnectBoard  {

    Space spaces[];
    String spacesText[];

    public ConnectBoard(){
        spaces = new Space[25];


        for(int i = 0; i < spaces.length; i++){
            spaces[i] = Space.EMPTY;
        }

        spacesText = new String[25];

        for(int i = 0; i < spacesText.length; i++){
            spacesText[i] = String.valueOf(i);
        }



    }

    public void PlaceOnBoard(Space pieceToPlace, int locationToPlace){
        if(spaces[locationToPlace] == Space.EMPTY){
            spaces[locationToPlace] = pieceToPlace;
            if(pieceToPlace == Space.X){
                spacesText[locationToPlace] = "X";
            }
            else{
                spacesText[locationToPlace] = "O";
            }

        }
    }
    public void Draw(){
        System.out.println("");
        System.out.println(" " + spacesText[0] + "   | " + spacesText[1] + "   | " + spacesText[2] + "  | "  + spacesText[3] + " | " + spacesText[4]);
        System.out.println("--- --- --- --- ---");
        System.out.println(" " + spacesText[5] + "   | " + spacesText[6] + "   | " + spacesText[7] + "  | "  + spacesText[8] + " | "  + spacesText[9]);
        System.out.println("--- --- --- --- ---");
        System.out.println(" " + spacesText[10] + "  | " +spacesText[11] + "  |" +  spacesText[12] + "  |" + spacesText[13] + " |"   + spacesText[14] );
        System.out.println("--- --- --- --- ---");
        System.out.println(" " + spacesText[15] +"  | " + spacesText[16] +"  |" + spacesText[17] + "  | "  + spacesText[18] + "| "  + spacesText[19]);
        System.out.println("--- --- --- --- ---");
        System.out.println(" " + spacesText[20] + "  | " + spacesText[21] + "  | " + spacesText[22] + " | "  + spacesText[23] + "| " + spacesText[24]);



        System.out.println("");

    }
}


