package ru.job4j.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class OrderConvertsTest {
    @Test
    public void whenSingleOrder() {
        List<Orders> orders = new ArrayList<>();
        orders.add(new Orders("3sfe", "Dress"));
        HashMap<String, Orders> map = OrderConverts.process(orders);
        assertThat(map.get("3sfe"), is(new Orders("3sfe", "Dress")));
    }
}