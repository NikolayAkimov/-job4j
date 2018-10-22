package ru.job4j.loop;

public class Factorial {
    public int calc(int n) {
        int sum = 1;
        for(int index = 1;index<=n; index++) {
            sum = sum * index;

        }
        return  sum;
    }
}
