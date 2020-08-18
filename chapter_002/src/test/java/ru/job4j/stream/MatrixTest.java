package ru.job4j.stream;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MatrixTest {
    @Test
    public void matrisToList() {
        List<Integer> expected = List.of(1,2,3,4);
        List<List<Integer>> matrix = List.of(
                List.of(1, 2),
                List.of(3, 4)
        );
        Matrix one = new Matrix();
        List<Integer> res = one.numlist(matrix);
        assertThat(res, is(expected));
    }
}
