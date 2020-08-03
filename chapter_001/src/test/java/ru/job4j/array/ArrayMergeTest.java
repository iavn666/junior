package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayMergeTest {

    @Test
    public void qwerty() {
        ArrayMerge array = new ArrayMerge();
        int[] left = {1, 3};
        int[] right = {2, 4};
        int[] result = array.merge(left, right);
        int[] expect = {1, 2, 3, 4};
        assertThat(result, is(expect));
    }


}
