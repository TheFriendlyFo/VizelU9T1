public class BoardGame extends Game{

    private final int[][] board;

    public BoardGame(int numPlayers, String name, int boardSize) {
        super(numPlayers, name);
        board = new int[boardSize][boardSize];
    }

    @Override
    public void play() {
        while (!isOver) {
            display();
            for (Player player : players) {
                player.move();
                if (player.hasWon()) {
                    isOver = true;
                    break;
                }
            }
        }
    }

    public void display() {
        System.out.println("Turn " + turn + ":\n");
        for (int[] row : board) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
