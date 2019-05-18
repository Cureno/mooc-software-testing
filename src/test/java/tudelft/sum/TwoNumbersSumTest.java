package tudelft.sum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TwoNumbersSumTest {

    @Test
    void addsSingleDigitNumbers() {
        ArrayList<Integer> result = new TwoNumbersSum().addTwoNumbers(
                new ArrayList<>(Collections.singletonList(1)),
                new ArrayList<>(Collections.singletonList(1))
        );



        Assertions.assertArrayEquals(new Object[]{2}, result.toArray());
    }

    @Test
    void addsTwoNumbersWithManyNines() {
        ArrayList<Integer> result = new TwoNumbersSum().addTwoNumbers(
                new ArrayList<>(Arrays.asList(9,9,9,9,9)),
                new ArrayList<>(Arrays.asList(9,9,9,9,9))
        );


        Assertions.assertArrayEquals(new Object[]{1,9,9,9,9,8}, (result.toArray()));

    }

    @Test
    void addsTwoNines() {
        ArrayList<Integer> result = new TwoNumbersSum().addTwoNumbers(
                new ArrayList<>(Arrays.asList(9)),
                new ArrayList<>(Arrays.asList(9))
        );


        Assertions.assertArrayEquals(new Object[]{1, 8}, (result.toArray()));
    }
}
