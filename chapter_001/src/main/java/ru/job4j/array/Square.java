package ru.job4j.array;
/**
 * Class Square
 * @author dvoeglazov
 * @since 28.01.2019
 */
public class Square {
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        rst[0] = 1;
        rst[1] = 2;
        rst[2] = 3;
        rst[3] = 4;
    for (int index = 0; index != rst.length; index++) {
           rst[index] *= rst[index];

    }
        return rst;
    }
}