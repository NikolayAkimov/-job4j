package ru.job4j.array;

public class Matrix {
    int[][] multiple(int size){
        int [][] multiples = new int [size][size];
        for (int i = 0; i < multiples.length;i++){
            for(int j = 0; j < multiples[i].length; j++){
                multiples[i][j] = (i + 1) * (j + 1);
                System.out.print(multiples[i][j] + " ");
            }
            System.out.println();
        }
        return multiples;
    }
}