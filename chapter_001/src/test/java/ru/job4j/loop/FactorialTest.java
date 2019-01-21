package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * @author Ivan Dvoeglazov (dvoeglazovcom@gmail.com)
 * @version $Id$
 * @since 0.1
 */

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        Factorial a = new Factorial();
        int result = a.calc(5);
        int expected = 120;
        assertThat(result, is(expected));
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        Factorial a = new Factorial();
        int result = a.calc(0);
        int expected = 1;
        assertThat(result, is(expected));
    }
}