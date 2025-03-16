package casestudy.snakesladder;

import java.util.Random;

public class Player {
    private String name;
    private int position;
    private int numberOfMoves;

    public Player(String name) {
        this.name = name;
        this.position = 0;
        this.numberOfMoves = 0;
    }

    public String getName() {
        return name;
    }
    public int getPosition() {
        return position;
    }
    public void setPosition(int position) {
        this.position = position;
    }

    public int rollDice() {
        return new Random().nextInt(6) + 1;
    }

    public void move(int spaces) {
        position += spaces;
        numberOfMoves++;
    }
}
