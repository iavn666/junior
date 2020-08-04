package ru.job4j.collection;

import java.util.HashSet;
import java.util.List;

public class NotifyAccounts {
    public static HashSet<Accounts> sent(List<Accounts> accounts) {
        HashSet<Accounts> rsl = new HashSet<>();
        for (Accounts num : accounts) {
            rsl.add(num);
        }
        // for-each accounts to HashSet;
        return rsl;
    }
}