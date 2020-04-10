package ru.job4j.collection;


import java.util.Objects;

public class User implements Comparable<User> {
    private String name;
    private int priority;


    public User(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return priority == user.priority
                && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, priority);
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "User{" + name + ", " + priority + '}';
    }

    @Override
    public int compareTo(User another) {
        return Integer.compare(priority, another.priority);
    }

}
