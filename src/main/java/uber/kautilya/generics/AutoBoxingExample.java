package uber.kautilya.generics;

import java.util.Arrays;
import java.util.List;

public class AutoBoxingExample {

    public static void main(String[] args) {
        Integer x = Integer.valueOf(10);
        /* Unboxing from an Integer */
        int i = x;

        /* Auto boxing of int values - Parameterized types cannot be primitives */
        List<Integer> integerList = Arrays.asList(10, 20, 30);
        int firstValue = integerList.get(0);
    }

}
