package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;


public class FI {

     public String[] res(String[] arg) {

        Comparator<String> cmpDescSize = (left, right) -> {
            System.out.println("compare - " + left.length() + ":" + right.length());
            return Integer.compare(right.length(),left.length());
        };
        Arrays.sort(arg, cmpDescSize);

         return arg;
    }






}