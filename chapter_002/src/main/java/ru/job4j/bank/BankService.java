package ru.job4j.bank;


import java.util.*;

import static javax.swing.UIManager.addPropertyChangeListener;
import static javax.swing.UIManager.get;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();
    private List<Account> accounts = new ArrayList<>();

    public void addUser(User user) {
        users.put(user, accounts);

    }


    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        List<Account> value = users.get(user);
        value.add(account);

    }

    public User findByPassport(String passport) {
        User a = null;
        for (User num : users.keySet()) {
            if (num.getPassport().equals(passport)) {
                a = num;
                break;
            }


        }

        return a;
    }

    public Account findByRequisite(String passport, String requisite) {
        Account a = null;
        User user = findByPassport(passport);
        if (user != null) {
            for (Account num : users.get(user)) {
                if (num.getRequisite().equals(requisite)) {
                    a = num;
                }

            }
        }
        return a;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String dstRequisite, double amount) {
        boolean rsl = false;
        User a = findByPassport(srcPassport);
        Account b = findByRequisite(srcPassport, srcRequisite);
        for (Account num : users.get(a)) {
            if ((!num.getRequisite().equals(srcRequisite)) || (num.getBalance() != b.getBalance())) {
                rsl = false;
            } else {
                //Account b = findByRequisite(destPassport, dstRequisite);
                //amount = b.getBalance() + c.getBalance();
               // c.setBalance(amount);
                rsl = true;

            }

        }


        return rsl;
    }
}