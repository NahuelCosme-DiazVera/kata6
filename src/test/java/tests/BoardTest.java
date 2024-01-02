package tests;

import org.junit.Test;
import software.ulpgc.kata6.Board;

import static org.assertj.core.api.Assertions.assertThat;

public class BoardTest {
    @Test
    public void should_return_no_winner_given_empty_board_3x3() {
        Board board = new Board("");
        board.checkWinner();
        String winner = board.winner();
        assertThat(winner).isEqualTo("");
    }
}
