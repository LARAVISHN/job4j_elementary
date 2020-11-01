package ru.job4j.condition;
import static org.hamcrest.core.Is.is;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChessBoardTest {

    @Test
    public void wayIs5() {
        int way = ChessBoard.way(6, 7, 1, 2);
        assertThat(way, is(5));
    }

    @Test
    public void wayIs7() {
        int way = ChessBoard.way(6, 0, 4, 2);
        assertThat(way, is(2));
    }

    @Test
    public void wayIs0() {
        int way = ChessBoard.way(2, 6, 4, 1);
        assertThat(way, is(0));
    }
}