package ru.job4j.pseudo;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

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
            // получаем ссылку на стандартный вывод в консоль.
            PrintStream stdout = System.out;
            // Создаем буфур для хранения вывода.
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            //Заменяем стандартный вывод на вывод в пямять для тестирования.
            System.setOut(new PrintStream(out));
            // выполняем действия пишушиее в консоль.
            new Paint().draw(new Square());
            Square square = new Square();
            assertThat(
                    square.draw(),
                    is(
                            new StringBuilder()
                                    .append("++++++\r\n")
                                    .append("++++++\r\n")
                                    .append("++++++")
                                    .toString()
                    )
            );
        }
    }

