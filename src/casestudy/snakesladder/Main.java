package casestudy.snakesladder;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> playerNames = List.of("BOB", "Yelena");
        List<Snake> snakes = List.of(new Snake(17,7), new Snake(54,34));
        List<Ladder> ladders = List.of(new Ladder(62, 81), new Ladder(87,96));
        Game game = new Game(100, playerNames, snakes, ladders);
        game.play();
    }
}
