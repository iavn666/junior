package ru.job4j.collection;

import java.util.HashMap;
import java.util.List;

public class OrderConverts {
    public static HashMap<String, Orders> process(List<Orders> orders) {
        HashMap<String, Orders> map = new HashMap<>();
        for (Orders num : orders) {
            String value = num.getNumber();
            map.put(value, num);
        }
        return map;
    }
}