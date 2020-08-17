package ru.job4j.lambda;

import java.util.*;

public class Attachment  {
    private String name;
    private int size;

    public Attachment(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", size=" + size +
                '}';
    }




    //Comparator<String> cmpText = (left, right) -> left.compareTo(right);

    //Comparator<String> cmpDescSize = (left, right) -> left.length() - right.length(); тут поправил


}

