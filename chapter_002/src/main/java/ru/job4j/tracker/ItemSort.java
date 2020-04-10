package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ItemSort implements Comparator<Item> {

    @Override
    public int compare(Item a, Item b) {
        return b.getName().compareTo(a.getName());
    }
}


