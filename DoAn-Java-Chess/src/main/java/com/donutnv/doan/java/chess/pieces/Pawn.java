package com.donutnv.doan.java.chess.pieces;

import com.donutnv.doan.java.chess.display.GameBoard;

public class Pawn extends AbstractPiece{
    public Pawn(int[] spot, String symbol, String color) {
        super("Pawn", spot, symbol, color);
    }

    @Override
    public boolean canMove(int[] from, int[] to) {
        if (super.isMovePossible(from, to)) return false;
        if (from[1] == to[1]) {
            if (super.getColor().equals("white") && to[0]-from[0] > -3 && to[0]-from[0] < 0) {
                if(to[0]-from[0] == -2 && from[0] == 6) {
                    if (GameBoard.btnsPiece[to[0]][to[1]].hasPiece()) {
                        return false;
                    }
                    return true;
                } else if (to[0]-from[0] == -1 && !GameBoard.btnsPiece[to[0]][to[1]].hasPiece()) {
                    return true;
                } else {
                    return false;
                }
            } else if (super.getColor().equals("black") && to[0]-from[0] < 3 && to[0]-from[0] > 0) {
                if(to[0]-from[0] == 2 && from[0] == 1) {
                    if (GameBoard.btnsPiece[to[0]][to[1]].hasPiece()) {
                        return false;
                    }
                    return true;
                } else if (to[0]-from[0] == 1 && !GameBoard.btnsPiece[to[0]][to[1]].hasPiece()) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else if (Math.abs(to[1]-from[1]) == 1 && GameBoard.btnsPiece[to[0]][to[1]].hasPiece()) {
            if (super.getColor().equals("white") && to[0]-from[0] == -1) {
                return true;
            } else if (super.getColor().equals("black") && to[0]-from[0] == 1) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
