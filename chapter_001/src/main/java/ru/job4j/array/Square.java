package ru.job4j.array;
/**
 * Class Square
 * @author dvoeglazov
 * @since 28.01.2019
 */
public class Square {
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
         for (int index = 0; index != rst.length; index++) {
         rst[index] = (index + 1) * (index + 1);
    }
        return rst;
    }
}