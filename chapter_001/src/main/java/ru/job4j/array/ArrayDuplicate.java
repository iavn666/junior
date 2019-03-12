package ru.job4j.array;


import java.util.Arrays;

public class ArrayDuplicate {

    public String[] remove(String[] array) {
        int dublicate = array.length;
        for (int out = 0; out < dublicate; out++) {
            for (int in = out + 1; in < dublicate; in++) {
                if (array[out].equals(array[in])) {
                    array[out + 1] = array[dublicate - 1];
                    in--;
                    dublicate--;
                }
            }
        }
        return Arrays.copyOf(array, dublicate);
    }
}