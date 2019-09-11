package ru.job4j.tracker;

public class TrackerEager {

    private static final TrackerEager INSTANCE = new TrackerEager();

    private TrackerEager() {
    }

    public static TrackerEager getInstance() {
        return INSTANCE;
    }



    public static void main(String[] args) {
        TrackerEager tracker = TrackerEager.getInstance();
    }
}
