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
            return;
        }
        horizontalLineWinner();

    }

    private void horizontalLineWinner() {
        boolean settedWinner = false;
        for (String s : state) {
            char mark = s.charAt(0);
            if (s.charAt(1) == mark && s.charAt(2) == mark) {
                this.winner = String.valueOf(mark);
                settedWinner = true;
                break;
            }
        }
    }
}
