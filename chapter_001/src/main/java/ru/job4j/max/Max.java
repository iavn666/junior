package ru.job4j.max;
/**
 * Class Max
 * @author dvoeglazov
 * @since 17.01.2019
 */
public class Max {
    public int summation(int first, int second) {
        return first >= second ? first : second;
    }
    public int max(int first, int second, int third) {
       return Math.max(Math.max(first, second), third);
         }

    }



