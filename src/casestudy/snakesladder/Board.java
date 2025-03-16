package casestudy.snakesladder;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private int size;
    private List<Integer> playerPosition = new ArrayList<>();
    private List<Integer> snakesPosition = new ArrayList<>(); // [head1, tail1, head2, tail2]

    private List<Integer> ladderPosition = new ArrayList<>(); // [start1, end1, start2, end2]

    public Board(int size) {
        this.size = size;
    }

    public List<Integer> getSnakesPosition() {
        return snakesPosition;
    }

    public List<Integer> getLadderPosition() {
        return ladderPosition;
    }

    public void movePlayer(Player player, int roll) {
        int newPosition = player.getPosition() + roll;
        if (newPosition > size) {
            return;
        }
        newPosition = getLadderPosition(newPosition);
        newPosition = getSnakePosition(newPosition);

        player.setPosition(newPosition);
    }

    public boolean checkWinner(Player player) {
        if (player.getPosition() == size) {
            System.out.println("Winner is " +player.getName());
            return true;
        }
        return false;
    }

    private int getSnakePosition(int newPosition) {
        for (int i = 0 ; i < snakesPosition.size() ; i += 2) {
            if (snakesPosition.get(i) == newPosition) {
                newPosition = snakesPosition.get(i+1);
                break;
            }
        }
        return newPosition;
    }

    private int getLadderPosition(int newPosition) {
        for (int i = 0 ; i < ladderPosition.size() ; i += 2) {
            if (ladderPosition.get(i) == newPosition) {
                newPosition = ladderPosition.get(i+1);
                break;
            }
        }
        return newPosition;
    }
}
