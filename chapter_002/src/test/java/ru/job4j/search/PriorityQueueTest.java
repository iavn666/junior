package ru.job4j.search;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PriorityQueueTest {
    @Test
    public void whenHigherPriority() {
        PriorityQueues queue = new PriorityQueues();
        queue.put(new Tasks("low", 5));
        queue.put(new Tasks("urgent", 1));
        queue.put(new Tasks("middle", 3));
        Tasks result = queue.take();
        assertThat(result.getDesc(), is("urgent"));
    }
}
