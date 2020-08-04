package ru.job4j.collection;

import java.util.HashMap;

public class UsageMaps {

    public static void main(String[] args) {
        HashMap<String, String> name = new HashMap<>();
        name.put("ivan.vanya.2012@inbox.ru", "Dvoeglazov Ivan");
        for (String num : name.keySet()) {
            String value = name.get(num);
            System.out.println(value);
            System.out.println(num);
        }
    }
}
