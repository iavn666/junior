package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Numbers {
    private String name;
    private int size;

    public Numbers(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Numbers{" +
                "name='" + name + '\'' +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        List<Numbers> name = new ArrayList<>();
        name.add(new Numbers("ivan", 3));
        name.add(new Numbers("Petya", 6));
        name.add(new Numbers("Sementya", 9));
        Comparator<Numbers> nameCompar = (left, right) -> {
            System.out.println(name);
            return right.getSize() - left.getSize();
        };
        Comparator<Numbers> nameLength = (left, right) -> {
            System.out.println(name);
            return left.getName().length() - right.getName().length();
        };

        Collections.sort(name, nameCompar);
        System.out.println(name);
        Collections.sort(name,nameLength);
        System.out.println(name);




    }
}
