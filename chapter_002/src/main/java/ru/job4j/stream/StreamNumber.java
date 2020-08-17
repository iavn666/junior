package ru.job4j.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamNumber {
    private final Integer number;

    public StreamNumber(Integer number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "StreamNumber{" +
                "number=" + number +
                '}';
    }

    public static void main(String[] args) {
        List<StreamNumber> num = new ArrayList<>();
        num.add(new StreamNumber(4));
        num.add(new StreamNumber(-2));
        num.add(new StreamNumber(8));
        num.add(new StreamNumber(-7));
        System.out.println(num.stream().filter(streamNumber -> streamNumber.number > 0).collect(Collectors.toList()));

    }
}
