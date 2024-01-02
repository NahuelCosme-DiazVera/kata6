package tests;

import org.junit.Test;
import software.ulpgc.kata6.Board;

import static org.assertj.core.api.Assertions.assertThat;
import static tests.BoardTest.Cases.*;

public class BoardTest {
    @Test
    public void should_return_no_winner_given_empty_board_3x3() {
        Board board = new Board("");
        board.checkWinner();
        String winner = board.winner();
        assertThat(winner).isEqualTo("");
    }

    @Test
    public void should_return_winner_given_board_3x3_horizontal_line() {
        Board board = new Board(board_3x3_horizontal_line);
        board.checkWinner();
        String winner = board.winner();
        assertThat(winner).isEqualTo("O");
    }

    @Test
    public void should_return_winner_given_board_3x3_vertical_line() {
        Board board = new Board(board_3x3_vertical_line);
        board.checkWinner();
        String winner = board.winner();
        assertThat(winner).isEqualTo("O");
    }

    @Test
    public void should_return_winner_given_board_3x3_descending_diagonal_line() {
        Board board = new Board(board_3x3_descending_diagonal_line);
        board.checkWinner();
        String winner = board.winner();
        assertThat(winner).isEqualTo("X");
    }

    @Test
    public void should_return_winner_given_board_3x3_ascending_diagonal_line() {
        Board board = new Board(board_3x3_ascending_diagonal_line);
        board.checkWinner();
        String winner = board.winner();
        assertThat(winner).isEqualTo("X");
    }

    @Test
    public void should_return_draw_given_board_3x3_draw() {
        Board board = new Board(board_3x3_draw);
        board.checkWinner();
        String winner = board.winner();
        assertThat(winner).isEqualTo("draw");
    }

    public static class Cases {
        public static String board_3x3_horizontal_line = """
                O.X
                OOO
                .XX
                """.trim();

        public static String board_3x3_vertical_line = """
                X.O
                .XO
                OXO
                """.trim();

        public static String board_3x3_descending_diagonal_line = """
                XOO
                OXO
                OOX
                """.trim();

        public static String board_3x3_ascending_diagonal_line = """
                OOX
                OXO
                XOO
                """.trim();

        public static String board_3x3_draw = """
                XOO
                OXX
                XOO
                """.trim();
    }

}
