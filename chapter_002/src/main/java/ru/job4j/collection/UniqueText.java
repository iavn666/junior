package ru.job4j.collection;

import java.util.HashMap;
import java.util.HashSet;

import static com.sun.jmx.snmp.ThreadContext.contains;

public class UniqueText {
    public static boolean isEquals(String originText, String duplicateText) {
        boolean rsl = true;
        String[] origin = originText.split(" ");
        String[] text = duplicateText.split(" ");
        HashSet<String> check = new HashSet<>();
        for (String a : origin) {
            check.add(a);
        }
        for (String b : text) {
            for (String c : origin) {
                rsl = c.contains(b);
                return rsl;
            }

           }
        return rsl;
    }
}