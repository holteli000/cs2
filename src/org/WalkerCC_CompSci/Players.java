package org.WalkerCC_CompSci;

public class Players {
    private Space space;
    private int playOrder;

    public Players (Space space, int playOrder) {
        this.space = space;
        this.playOrder = playOrder;
    }

    public Space getPiece(){
        return this.space;
    }
}

