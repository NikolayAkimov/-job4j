package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.collection.IsArrayContainingInAnyOrder.arrayContainingInAnyOrder;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import java.util.Arrays;

public class ArrayDuplicateTest {
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        String[]input = {"1","1","2","3","3","4"};
        String[]expect ={"1","2","3","4"};
        ArrayDuplicate duplicate = new ArrayDuplicate();
        String [] result = duplicate.remove(input);
        assertThat(result, arrayContainingInAnyOrder(expect));
    }
}