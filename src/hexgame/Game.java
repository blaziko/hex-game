package org.hexgame.core;

import org.hexgame.core.Player;

public class Game {
  Board  board;
  Player playerA, playerB;

  public Game(int _size, Player _playerA, Player _playerB) {
    board = new Board(_size);
    playerA = _playerA;
    playerB = _playerB;
  }

  public Board getBoard() {
    return board;
  }

  public Player getPlayerA() {
    return playerA;
  }

  public Player getPlayerB() {
    return playerB;
  }

  public Boolean isFinished() {
    return false;
  }

  public Player getWinner() {
    return playerA;
  }

  public Player currentPlayer() {
    return playerA;
  }

  public void performMove(Move move) { }

  public void backMove() { }
}