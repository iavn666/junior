package ru.job4j.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Matrix {

    public List<Integer> numlist(List<List<Integer>> matrix) {
        List<Integer> result = matrix.stream().
                flatMap(x -> x.stream()).
                collect(Collectors.toList());
        return result;
    }



}
