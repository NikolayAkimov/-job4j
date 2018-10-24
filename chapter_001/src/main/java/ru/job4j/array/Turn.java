package ru.job4j.array;

public class Turn {
    public int[] back(int[] array) {
        for (int index = 1 ; index <= array.length/ 2; index++) {
        int temp = array[index - 1];
        array[index - 1] = array[array.length - index];
        array[array.length - index] = temp;
        }
        return array;
    }
}