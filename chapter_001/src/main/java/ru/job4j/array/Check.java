package ru.job4j.array;

public class Check {
    public boolean mono(boolean[] data) {
        boolean result = false;
        int a = 0;
        for (int index = 0; index < data.length; index++) {
            if (data[0] == data[index]) {
               result = true;
               } else {
                result = false;
                break;
            }
            }
        return result;
        }

}
