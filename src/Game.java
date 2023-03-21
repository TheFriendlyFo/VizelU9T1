import java.util.ArrayList;

public abstract class Game {
    protected final String name;
    protected final ArrayList<Player> players;
    protected int turn;
    protected boolean isOver;

    Game(int numPlayers, String name) {
        this.name = name;
        this.players = new ArrayList<>(numPlayers);
        this.turn = 0;
    }

    public abstract void play();

    public abstract void display();
}
