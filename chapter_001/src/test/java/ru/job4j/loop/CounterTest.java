package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * @author Ivan Dvoeglazov (dvoeglazovcom@gmail.com)
 * @version $Id$
 * @since 0.1
 */

public class CounterTest {
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        Counter a = new Counter();
        double result = a.add(1, 10);
        double expected = 30;
        assertThat(result, is(expected));

        //напишите здесь тест, проверяющий, что сумма чётных чисел от 1 до 10 при вызове метода counter.add будет равна 30.
    }
}