package ru.job4j.converter;

import org.junit.Test;
import ru.job4j.сonverter.Converter;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Ivan Dvoeglazov (dvoeglazovcom@gmail.com)
 * @version $Id$
 * @since 0.1
 */

public class ConverterTest {
    @Test
    public void when60RubleToDollarThen1() {
        Converter converter = new Converter();
        int result = converter.rubleToDollar(60);
        assertThat(result, is(1));
    }

    @Test
    public void when70RubleToEuroThen1() {
        Converter converter = new Converter();
        int result = converter.rubleToEuro(70);
        assertThat(result, is(1));
    }

    @Test
    public void wheneuroxcccccToRubleThen1() {
        Converter converter = new Converter();
        int result = converter.euroToRuble(1);
        assertThat(result, is(70));
    }

    @Test
    public void whenDollarToRubleThen1() {
        Converter converter = new Converter();
        int result = converter.euroToRuble(1);
        assertThat(result, is(70));
    }
}
