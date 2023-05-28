/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.donutnv.doan.java.chess.pieces;

/**
 *
 * @author nguye
 */
public interface Piece {
    String getName();
    int[] getSpot();
    String getSymbol();
    String getColor();
    boolean canMove(int[] from, int[] to);
    boolean willJump(int[] from, int[] to);
    String getChessSpot();
    String getAbbreviation();
    boolean isMovePossible(int[] from, int[] to);
}
