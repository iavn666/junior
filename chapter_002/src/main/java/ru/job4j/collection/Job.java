package ru.job4j.collection;

import java.util.Comparator;

public class Job implements Comparator<Job> {
    private String name;

    private int priority;

    public Job(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "Job{" + name + ", " + priority + '}';
    }

    @Override
    public int compare(Job o1, Job o2) {
        return 0;
    }



}