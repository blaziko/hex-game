package org.hexgame.core;

import org.hexgame.core.PieceType;

public class Player {
  PieceType pieceType;

  public Player(PieceType _pieceType) {
    pieceType = _pieceType;
  }

  public PieceType getPieceType() {
    return pieceType;
  }

  public String toString() {
    return pieceType.toString() + " [ HUMAN ]";
  }

  public Boolean isHuman() {
    return true;
  }

  public Move getMove(Board board) { return null; }
}
