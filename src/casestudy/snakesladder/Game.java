package casestudy.snakesladder;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private Board board;
    private List<Player> players = new ArrayList<>();
    private List<Snake> snakes;
    private List<Ladder> ladders;

    public Game(int boardSize, List<String> playerNames, List<Snake> snakes, List<Ladder> ladders) {
        for (String name : playerNames) {
            players.add(new Player(name));
        }
        this.board = new Board(boardSize);
        this.snakes = snakes;
        this.ladders = ladders;
        initializeBoard();
    }

    public void initializeBoard() {
        for (int i = 0 ; i < snakes.size() ; i++) {
            board.getSnakesPosition().add(snakes.get(i).getHead());
            board.getSnakesPosition().add(snakes.get(i).getTail());
        }

        for (int i = 0 ; i < ladders.size() ; i++) {
            board.getLadderPosition().add(ladders.get(i).getStart());
            board.getLadderPosition().add(ladders.get(i).getEnd());
        }
    }

    void play() {
        while (true) {
            for (int i = 0 ; i < players.size() ; i++) {
                Player player = players.get(i);
                int roll = player.rollDice();
                board.movePlayer(player, roll);
                if (board.checkWinner(player)) {
                    return;
                }
            }
        }
    }
}
