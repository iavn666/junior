package ru.job4j.we;

import java.util.ArrayList;
import java.util.List;

public class Gas {

    private List<Signal> up = new ArrayList<>();

    public void add(Signal ups) {
        up.add(ups);
    }

    public void gasOn() {
        System.out.println("Нажал на газ");
        for (Signal a : up) {
            a.signal();
        }
    }
}
