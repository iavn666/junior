package ru.job4j.collection;

import javax.crypto.interfaces.PBEKey;
import java.util.*;


public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int size = Math.min(left.length(), right.length());
        int res = Integer.compare(left.length(), right.length());
        for (int num = 0; num < size; num++) {
            Character a = left.charAt(num);
            Character b = right.charAt(num);
            res = a.compareTo(b);
                if (res != 0) {
                    break;

                }
            }

        return res == 0 ? Integer.compare(left.length(), right.length()) : res;
    }
}

