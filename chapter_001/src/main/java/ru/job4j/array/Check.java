package ru.job4j.array;

public class Check {
    public boolean mono(boolean[] data) {
        boolean result = false;
        int a = 0;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == false) {
                a++;
               }
            }
        if (a > 0){
            result = false;
        } else {
            result = true;
        }
        return result;
    }
}