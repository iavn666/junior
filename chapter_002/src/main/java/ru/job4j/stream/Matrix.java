package ru.job4j.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Matrix {

    public List<Integer> toList (int[][] array) {
        List list = new ArrayList();
        for (int[] i : array) {
            for(int j : i){
                list.add(j);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[][] array = new int[2][2];
        array[0][0] = 1;
        array[0][1] = 2;
        array[1][0] = 3;
        array[1][1] = 4;
        Matrix an = new Matrix();
        System.out.println(an.toList(array));
        List<List<Integer>> matrix = List.of(
                List.of(1, 2),
                List.of(3, 4)
        );
        System.out.println(matrix.stream().flatMap(e -> e.stream()).collect(Collectors.toList()));

    }
}
