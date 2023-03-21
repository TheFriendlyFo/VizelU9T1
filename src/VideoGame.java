import java.util.ArrayList;

public class VideoGame extends Game{
    private final Screen screen;
    private final ArrayList<Enemy> enemies;
    private final int difficulty;

    public VideoGame(int numPlayers, String name, int difficulty) {
        super(numPlayers, name);
        this.difficulty = difficulty;
    }

    @Override
    public void play() {
        while (!isOver) {
            for (Player player : players) {
                player.move();
            }
            screen.update();
            isOver = checkOver();
            display();
        }
    }

    @Override
    public void display() {
        screen.display();
    }

    private boolean checkOver() {
        return player.hasWon || !player.isAlive();
    }
}
