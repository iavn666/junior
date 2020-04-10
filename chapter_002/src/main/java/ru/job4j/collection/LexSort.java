package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        char[] as = left.toCharArray();
        char[] bs = right.toCharArray();
        return Integer.compare(as.length, bs.length);
    }
}