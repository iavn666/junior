package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ItemSort {
    public static void main(String[] args) {
        List<Item> list = Arrays.asList(
                new Item("2", "home",1),
                new Item("3", "doom",2),
                new Item("1", "red",2)
        );
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }

}
