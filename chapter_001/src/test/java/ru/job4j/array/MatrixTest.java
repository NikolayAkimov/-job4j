package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
public class MatrixTest {
    @Test
    public void RetrievingElementsByIndexMultiplication1() {
        Matrix matrix = new Matrix();
        int input = 3;
        int[][] expect = {{1, 2, 3},
                {2, 4, 6},
                {3, 6, 9}};

        int[][] result = matrix.multiple(input);
        assertThat(result, is(expect));
    }

    @Test
    public void RetrievingElementsByIndexMultiplication2() {
        Matrix matrix = new Matrix();
        int input = 5;
        int[][] expect = {{1, 2, 3, 4, 5},
                {2, 4, 6, 8, 10},
                {3, 6, 9, 12, 15},
                {4, 8, 12, 16, 20},
                {5, 10, 15, 20, 25}};
        int[][] result = matrix.multiple(input);
        assertThat(result, is(expect));
    }
}