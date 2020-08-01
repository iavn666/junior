package ru.job4j.search;

public class Tasks {

    private String desc;
    private int priority;

    public Tasks(String desc, int priority) {
        this.desc = desc;
        this.priority = priority;
    }

    public String getDesc() {
        return desc;
    }

    public int getPriority() {
        return priority;
    }
}
