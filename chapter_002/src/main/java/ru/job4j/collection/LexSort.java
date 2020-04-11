package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        String one = null;
        String two = null;
        String[] in = left.split(". ", 0);
        for (String a: in) {
            if (a != null) {
                one = a;
                break;
            }
        }
        Integer bek = Integer.valueOf(one);

        String[] out = right.split(". ", 0);
        for (String b: out) {
            if (b != null) {
                two = b;
                break;
            }
        }

        Integer bek2 = Integer.valueOf(two);

        return Integer.compare(bek,bek2);
    }


}