package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankServices {
    private Map<Users, List<Accounts>> users = new HashMap<>();

    public void addUser(Users user) {
        if (!users.containsKey(user))
            users.put(user, new ArrayList<Accounts>());
    }

    public void addAccount(String passport, Accounts account) {
        Users num = findByPassport(passport);
        List<Accounts> value = users.get(num);
        if (!value.contains(account))
            value.add(account);
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
        Users user = findByPassport(srcPassport);
        Accounts num = findByRequisite(srcPassport, srcRequisite);
        Accounts nums = findByRequisite(destPassport, dеstRequisite);
        if ((!num.getRequisite().equals(srcRequisite)) || (num.getBalance() == nums.getBalance())) {
            rsl = false;
        } else {
            //nums = findByRequisite(destPassport, dеstRequisite);
            amount = num.getBalance() + nums.getBalance();
            nums.setBalance(amount);
            rsl = true;

        }
        return rsl;
    }
}