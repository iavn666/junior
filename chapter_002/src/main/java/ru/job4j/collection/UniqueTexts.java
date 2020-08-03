package ru.job4j.collection;

import java.util.HashSet;

public class UniqueTexts {
    public static boolean isEquals(String originText, String duplicateText) {
        boolean rsl = true;
        String[] origin = originText.split(" ");
        String[] text = duplicateText.split(" ");
        HashSet<String> check = new HashSet<>();
        for (String num : origin) {
            check.add(num);
        }
        for (String num : text) {
            return check.contains(num);
        }
        /* for-each origin -> new HashSet. */
        /* for-each text -> hashSet.contains */
        return rsl;
    }
}