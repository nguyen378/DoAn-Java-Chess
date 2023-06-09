package com.donutnv.doan.java.chess.pieces;

public class Bishop extends AbstractPiece{
    public Bishop(int[] spot, String symbol, String color) {
        super("Bishop", spot, symbol, color);
    }

    @Override
    public boolean canMove(int[] from, int[] to) {
        if (super.isMovePossible(from, to)) return false;
        if (Math.abs(to[0]-from[0]) == Math.abs(to[1]-from[1])) {
            return true;
        } else {
            return false;
        }
    }
}
