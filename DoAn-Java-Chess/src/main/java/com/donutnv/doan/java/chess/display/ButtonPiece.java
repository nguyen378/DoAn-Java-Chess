package com.donutnv.doan.java.chess.display;

import com.donutnv.doan.java.chess.display.GameBoard;
import com.donutnv.doan.java.chess.pieces.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class ButtonPiece extends JButton implements ActionListener{
    public AbstractPiece piece = null;
    int[] spot;
    JLabel label;
    
    public ButtonPiece(int[] spot, Color color) {
        this.label = new JLabel("", JLabel.CENTER);
        this.label.setFont(GameBoard.BUTTON_FONT);
        this.add(label);
        this.setPreferredSize(new Dimension(10,10));
        this.spot = spot;
        this.setBackground(color);
        this.addActionListener(this);
    }

    public ButtonPiece(AbstractPiece piece, int[] spot, Color color) {
        this(spot, color);
        this.label.setText(piece.getSymbol());
        this.piece = piece;
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == this) {
            if (hasPiece() && GameBoard.from == null && this.piece.getColor().equals(GameBoard.Player)) {
                showMoves(this.piece, this.spot);
                GameBoard.from = this.spot;
                GameBoard.movingPiece = this.piece;
            } else if (GameBoard.from != null) {
                removeMoves();
                GameBoard.to = this.spot;
                if (GameBoard.from[0] == GameBoard.to[0] && GameBoard.from[1] == GameBoard.to[1]) {
                    GameBoard.from = null;
                    GameBoard.to = null;
                    return;
                };
                if (!hasPiece()) {
                    if (GameBoard.movingPiece.canMove(GameBoard.from, GameBoard.to)) {
                        GameBoard.btnsPiece[GameBoard.from[0]][GameBoard.from[1]].removePiece();
                        placePiece(GameBoard.movingPiece);
                        GameBoard.Player = GameBoard.Player.equals("white") ? "black" : "white";
                        //GameBoard.turnLabel.setText("Turn: " + GameBoard.Player);
                    }
                } else {
                    if (GameBoard.movingPiece.canMove(GameBoard.from, GameBoard.to)) {
                        String logMove = "\n" + GameBoard.movingPiece.getAbbreviation() + " takes " + this.piece.getAbbreviation() + "!";
                        if (this.piece.getName().equals("King")) {
                            GameBoard.btnsPiece[GameBoard.from[0]][GameBoard.from[1]].removePiece();
                            this.placePiece(GameBoard.movingPiece);
                            //GameBoard.turnLabel.setText(GameBoard.Player + " won!");
                            for (int i = 0; i < 8; i++) {
                                for (ButtonPiece btn : GameBoard.btnsPiece[i]) {
                                    btn.setEnabled(false);
                                }
                            }
                        } else {
                            GameBoard.btnsPiece[GameBoard.from[0]][GameBoard.from[1]].removePiece();
                            this.placePiece(GameBoard.movingPiece);
                            GameBoard.Player = GameBoard.Player.equals("white") ? "black" : "white";
                            //GameBoard.turnLabel.setText("Turn: " + GameBoard.Player);
                        }
                        //GameBoard.logText.setText(GameBoard.logText.getText() + logMove);
                    }
                }
                GameBoard.from = null;
                GameBoard.to = null;
            } else {
                GameBoard.from = null;
                GameBoard.to = null;
            }
        }
    }
    
    public boolean hasPiece() {
        if (this.piece == null) {
            return false;
        } else {
            return true;
        }
    }

    private void removePiece() {
        this.piece = null;
        this.label.setText("");
    }

    private void placePiece(AbstractPiece piece) {
        String logMove = "\n[" + piece.getAbbreviation() + "] " + piece.getChessSpot() + " to ";
        this.piece = piece;
        this.piece.spot = this.spot;
        logMove += this.piece.getChessSpot();
        //GameBoard.logText.setText(GameBoard.logText.getText() + logMove);
        this.label.setText(piece.getSymbol());
        
    }

    private void showMoves(AbstractPiece piece, int[] from) {
        for(int i = 0; i < 8; i++) {
            for(int j = 0; j < 8; j++) {
                if (piece.canMove(from, GameBoard.btnsPiece[i][j].spot)) {
                    GameBoard.btnsPiece[i][j].setBackground(GameBoard.MOVE_COLOR);
                    validate();
                    repaint();
                }
            }
        }
    }

    private void removeMoves() {
        for(int i = 0; i < 8; i++) {
            for(int j = 0; j < 8; j++) {
                if (GameBoard.btnsPiece[i][j].getBackground() == GameBoard.MOVE_COLOR) {
                    if (i % 2 == 1 && j % 2 == 0) {
                        GameBoard.btnsPiece[i][j].setBackground(GameBoard.DARK_COLOR);
                    } else if (i % 2 == 0 && j % 2 == 1) {
                        GameBoard.btnsPiece[i][j].setBackground(GameBoard.DARK_COLOR);
                    } else {
                        GameBoard.btnsPiece[i][j].setBackground(GameBoard.LIGHT_COLOR);
                    }
                    validate();
                    repaint();
                }
            }
        }
    }
}
