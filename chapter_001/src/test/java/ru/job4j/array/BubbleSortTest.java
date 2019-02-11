package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class BubbleSortTest {

    @Test
    public void whenStartWithPrefixThenTrue() {
        BubbleSort word = new BubbleSort();
        int [] arrya =  {5, 1, 2, 7, 3};
        int [] rst = word.sort(arrya);
        int [] expe = {1, 2, 3, 5, 7};
        assertThat(rst, is(expe));
}

}

