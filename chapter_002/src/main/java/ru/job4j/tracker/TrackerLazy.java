package ru.job4j.tracker;


import java.util.Arrays;
import java.util.Random;

public class TrackerLazy {
    private TrackerLazy() {
    }

    public static TrackerLazy getInstance() {
        return Holder.INSTANCE;
    }

    public Item add(Item model) {
        return model;
    }

    private static final class Holder {
        private static final TrackerLazy INSTANCE = new TrackerLazy();
    }

    public static void main(String[] args) {
        TrackerLazy tracker = TrackerLazy.getInstance();
    }
}
