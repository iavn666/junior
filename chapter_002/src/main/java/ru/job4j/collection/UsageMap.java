package ru.job4j.collection;

import ru.job4j.bank.Account;
import ru.job4j.bank.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        //map.put("ivan.vanya.2012@inox.ru", "Двоеглазов Иван Николаевич");
        //map.put("ian.vanya.2012@inox.ru", "Двоеглаов Иван Николаевич");
        for (String key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
            System.out.println(map.get(key));
            System.out.println(map.containsKey(key));
            System.out.println(map.keySet());
        }




    }
}
