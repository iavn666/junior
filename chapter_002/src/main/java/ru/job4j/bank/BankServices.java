package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BankServices {
    private Map<Users, List<Accounts>> users = new HashMap<>();

    public void addUser(Users user) {
        users.keySet().contains(user);
    }

    public void addAccount(String passport, Accounts account) {
        Users num = findByPassport(passport);
        List<Accounts> value = users.get(num);
        value.stream().filter(accounts -> account.equals(num) != true)
                .collect(Collectors.toList());


    }

    public Users findByPassport(String passport) {
        Users res = users.keySet()
                .stream()
                .filter(x -> x.getPassport()
                .equals(passport))
                .findFirst()
                .get();
        return res;

    }

    public Accounts findByRequisite(String passport, String requisite) {
            Users user = findByPassport(passport);
            users.values().stream().filter(x -> x.equals(requisite)).findFirst().get();
      //  if (user != null) {
      //      for (Accounts num : users.get(user)) {
        //        if (num.getRequisite().equals(requisite)) {
         //           res = num;
        //        }

         //   }
      //  }
        return null;
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