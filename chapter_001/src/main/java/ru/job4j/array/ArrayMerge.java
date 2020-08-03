package ru.job4j.array;

public class ArrayMerge {

    int[] merge(int[] left, int[] right) {
        int length = left.length + right.length;
        int[] result = new int[length];
        System.arraycopy(left, 0, result, 0, left.length);
        System.arraycopy(right, 0, result, left.length, right.length);
        for (int index = 0; index < result.length - 1; index++) {
            if (result[index] > result[index + 1]) {
                index = 1;

            }

        }
        return result;
    }
}
