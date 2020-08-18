package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BankServices {
    public static Map<Users, List<Accounts>> users = new HashMap<>();

    public void addUser(Users user) {
        users.keySet().stream()
                .filter(x -> x.equals(user) != true)
                .collect(Collectors.toList());
    }

    public void addAccount(String passport, Accounts account) {
        Users num = findByPassport(passport);
        List<Accounts> value = users.get(num);
        value.stream().filter(accounts -> account.equals(num) != true)
                .collect(Collectors.toList());


    }

    public Users findByPassport(String passport) {
        Users a = null;
        for (Users num : users.keySet()) {
            if (num.getPassport().equals(passport)) {
                a = num;
            }
        }
        return a;
    }

    public Accounts findByRequisite(String passport, String requisite) {
        Accounts res = null;
        Users user = findByPassport(passport);
        if (user != null) {
            for (Accounts num : users.get(user)) {
                if (num.getRequisite().equals(requisite)) {
                    res = num;
                }

            }
        }
        return res;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String dеstRequisite, double amount) {
        boolean rsl = false;
        Accounts num = findByRequisite(srcPassport, srcRequisite);
        Accounts nums = findByRequisite(destPassport, dеstRequisite);
        if ((!num.getRequisite().equals(srcRequisite)) || (num.getBalance() == nums.getBalance())) {
            rsl = false;
        } else {
            amount = num.getBalance() + nums.getBalance();
            nums.setBalance(amount);
            rsl = true;

        }
        return rsl;
    }
}