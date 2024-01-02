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
        if(horizontalLineWinner())return;
        if (verticalLineWinner())return;
        if (descendingDiagonalWinner())return;
        if (ascendingDiagonalWinner())return;
        this.winner = "draw";
    }

    private boolean ascendingDiagonalWinner() {
        boolean settedWinner = false;
        char mark = state[2].charAt(0);
        if (mark != '.') {
            if (state[1].charAt(1) == mark && state[0].charAt(2) == mark) {
                this.winner = String.valueOf(mark);
                settedWinner = true;
            }
        }
        return settedWinner;
    }

    private boolean descendingDiagonalWinner() {
        boolean settedWinner = false;
        char mark = state[0].charAt(0);
        if (mark != '.') {
            if (state[1].charAt(1) == mark && state[2].charAt(2) == mark) {
                this.winner = String.valueOf(mark);
                settedWinner = true;
            }
        }
        return settedWinner;
    }

    private boolean verticalLineWinner() {
        boolean settedWinner = false;
        for (int i = 0; i < this.state.length; i++) {
            char mark = state[0].charAt(i);
            if (mark != '.') {
                if (state[1].charAt(i) == mark && state[2].charAt(i) == mark) {
                    this.winner = String.valueOf(mark);
                    settedWinner = true;
                    break;
                }
            }
        }
        return settedWinner;
    }

    private boolean horizontalLineWinner() {
        boolean settedWinner = false;
        for (String s : state) {
            char mark = s.charAt(0);
            if (mark != '.') {
                if (s.charAt(1) == mark && s.charAt(2) == mark) {
                    this.winner = String.valueOf(mark);
                    settedWinner = true;
                    break;
                }
            }
        }
        return settedWinner;
    }
}
