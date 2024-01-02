package software.ulpgc.kata6;

public class Board {
    private final String[] state;
    private String winner;

    public Board(String state) {
        this(state.split("\n"));
    }

    public Board(String[] state) {
        this.state = state;
    }

    public String winner() {
        return this.winner;
    }

    public void checkWinner() {
        if (this.state.length != 3) {
            this.winner = "";
        }
    }
}
