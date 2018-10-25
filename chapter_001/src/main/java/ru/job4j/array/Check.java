package ru.job4j.array;

public class Check {
    public boolean mono(boolean[] data) {
        boolean result = false;
        boolean x1;
        boolean x2;
        for(int index = 0; index < data.length - 1;index++){
           if (data[index] == data[index +1]){
               result = true;
               }else break;
        }
        return result;
    }
}