package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;


public class FI {
    public static void main(String[] args) {
        String [] ab = {
                "petya",
                "ivan",
                "semen"
        };
        Comparator<String> cmpDescSize = (left, right) -> {
            System.out.println("compare - " + left.length() + ":" + right.length());
            return Integer.compare(right.length(),left.length());
        };
        Arrays.sort(ab, cmpDescSize);

    }









}