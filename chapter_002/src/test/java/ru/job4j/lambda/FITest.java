package ru.job4j.lambda;

import org.junit.Test;
import ru.job4j.collection.ConvertList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FITest {
    @Test
    public void arrays() {
        String [] ab = {
                "petya",
                "ivan",
                "semen"
        };
        FI name = new FI();
        String[] a = name.res(ab);
        assertThat(a, is(ab));
    }

}
