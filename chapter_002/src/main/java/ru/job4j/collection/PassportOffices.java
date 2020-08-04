package ru.job4j.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class PassportOffices {

    private Map<String, Citizens> citizens = new HashMap<>();

    public boolean add(Citizens citizen) {
        boolean rsl = false;
        if (citizens.containsKey(citizen.getPassport())) {
            return rsl;
        } else {
            citizens.put(citizen.getPassport(), citizen);

        }
        return citizens.containsKey(citizen.getPassport());
    }


    public Citizens get(String passport) {
        return citizens.get(passport);
    }
}