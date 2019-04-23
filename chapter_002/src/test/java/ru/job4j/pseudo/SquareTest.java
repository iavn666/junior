package ru.job4j.pseudo;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SquareTest {
     /**
     * @author ivan
     * @version $Id$
     * @since 0.1
     */
        @Test
        public void whenDrawSquare() {
            Square square = new Square();
            assertThat(
                    square.draw(),
                    is(
                            new StringBuilder()
                                    .append("++++")
                                    .append("++\r\n")
                                    .append("++++++\r\n")
                                    .append("++++++")
                                    .toString()
                    )
            );
        }
    }

