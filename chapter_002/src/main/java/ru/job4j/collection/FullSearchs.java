package ru.job4j.collection;

import java.util.HashSet;
import java.util.List;

public class FullSearchs {
    public static HashSet<String> extractNumber(List<Tasks> list) {
        HashSet<String> numbers = new HashSet<>();
        for (Tasks num : list) {
            numbers.add(num.getNumber());
        }
        return numbers;
    }
}