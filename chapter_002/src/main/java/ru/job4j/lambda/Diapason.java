package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Diapason {

    List<Double> diapason(int start, int end, UnaryOperator<Double> func) {
        List<Double> res = new ArrayList<>();
        for (double i = start; i < end; i++) {
            res.add(func.apply(i));
        }
        return res;
    }
}
