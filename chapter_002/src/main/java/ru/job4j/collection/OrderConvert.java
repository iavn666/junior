package ru.job4j.collection;

import java.util.HashMap;
import java.util.List;

public class OrderConvert {
    public static HashMap<String, Order> process(List<Order> orders) {
        HashMap<String, Order> map = new HashMap<>();
        for (Order a : orders) {
            Order value = a;
            map.put(a.getNumber(), value);
        }
        return map;
    }
}