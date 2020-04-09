package ru.job4j.list;

import java.util.HashSet;

public class UsageHashSet {

    public static void main(String[] args) {
        HashSet<String> autos = new HashSet<String>();
        autos.add("Lada");
        autos.add("BMV");
        autos.add("Volvo");
        autos.add("Toyouta");
        for (String num: autos) {
             System.out.println(num);
        }
    }

}
