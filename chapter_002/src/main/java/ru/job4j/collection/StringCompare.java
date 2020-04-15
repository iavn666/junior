package ru.job4j.collection;

import javax.crypto.interfaces.PBEKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;



public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int res = 0;
        String oneLeft = left;
        String oneRight = right;
        char[] first = left.toCharArray();
        char[] second = right.toCharArray();
        int size = (first.length < second.length) ? first.length : second.length;
        if (first.length <= second.length) {
            for (char num = 0; num < size; num++) {
                Character a = oneLeft.charAt(num);
                Character b = oneRight.charAt(num);
                if (a.compareTo(b) != 0) {
                    res = a.compareTo(b);
                    break;
                }
            }
        } else if (second.length < first.length) {
            for (char num = 0; num < size; num++) {
                Character a = oneLeft.charAt(num);
                Character b = oneRight.charAt(num);
                if (a.compareTo(b) != 0) {
                    res = a.compareTo(b);
                    break;
                }

            }

        }
        return res;
    }
}

