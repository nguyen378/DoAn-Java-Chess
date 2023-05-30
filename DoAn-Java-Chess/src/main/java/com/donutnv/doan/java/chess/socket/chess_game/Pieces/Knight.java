/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.donutnv.doan.java.chess.socket.chess_game.Pieces;

import com.donutnv.doan.java.chess.socket.chess_game.Move.Move;
import com.donutnv.doan.java.chess.socket.chess_game.Boards.Board;
import com.donutnv.doan.java.chess.socket.chess_game.Boards.Tile;
import java.util.ArrayList;
import java.util.List;
import com.donutnv.doan.java.chess.socket.chess_game.Resources.PIECE_Configurations;
import com.donutnv.doan.java.chess.socket.chess_game.Resources.BOARD_Configurations;
import com.donutnv.doan.java.chess.socket.chess_game.Utilities.BoardUtilities;

/**
 *
 * @author Enes Kızılcın <nazifenes.kizilcin@stu.fsm.edu.tr>
 */
public class Knight extends Piece {

    public Knight(Team team) {
        super(team, PieceTypes.KNIGHT);
    }
    
    @Override
    public List<Move> availableMoves(Board board, Coordinate currentCoord) {

        List<Move> possibleMoves = new ArrayList<Move>();

        Tile destinationTile;

        for (Coordinate coord : PIECE_Configurations.KNIGHT_MOVES) {
 
            if (!BoardUtilities.isValidCoordinate(currentCoord.plus(coord))) {
                continue; // chech if the coord outside of board.
            }
            destinationTile = board.getTile(currentCoord.plus(coord));

            if (!destinationTile.hasPiece()) {
                possibleMoves.add(new Move(board,board.getTile(currentCoord),destinationTile));
            } else {
                if (destinationTile.getPiece().getTeam() != this.getTeam()) {
                    possibleMoves.add(new Move(board,board.getTile(currentCoord),destinationTile));
                }
            }
        }
        return possibleMoves;
    }
}
