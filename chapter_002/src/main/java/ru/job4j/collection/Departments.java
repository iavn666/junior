package ru.job4j.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Departments {

    public static List<String> fillGaps(List<String> deps) {
        HashSet<String> tmp = new HashSet<>();
        for (String value : deps) {
            String start = "k1";
             for (String el : value.split("/")) {
                if (el.equals(start)) {
                    tmp.add(start);
                } else {
                    tmp.add(start + "/" + el);
                }

                }
        }
        List<String> res = new ArrayList<>(tmp);
        Collections.sort(res);

        return res;
    }

    public static void sortAsc(List<String> orgs) {
    }

    public static void sortDesc(List<String> orgs) {
    }
}