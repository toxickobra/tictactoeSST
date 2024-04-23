package com.sst.tictactoe.tictactoe.models;

import java.util.List;

public class Game {
    Board board;
    List<Player> players;
    GameState gameState;
    Player nextPlayerMoveIndex;
    String winner;
    List<Move> moves;
}
