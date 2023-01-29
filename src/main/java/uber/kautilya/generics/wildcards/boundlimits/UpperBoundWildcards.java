package uber.kautilya.generics.wildcards.boundlimits;

import java.util.ArrayList;
import java.util.List;

public class UpperBoundWildcards {
    public static void main(String[] args) {

        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        List<Double> doubleList = new ArrayList<>();
        doubleList.add(1.00);
        doubleList.add(2.00);
        printNumbers(doubleList);
    }

    /**
     * List<Number> numberList as parameter will not permit Integer lists -
     * inheritance of generics works differently
     * '? extends Number' ensures will take in only list of types which extends Number type
     * Number is the upper bound type for the variable
     * @param numberList - the list to be printed
     */
    private static void printNumbers(List<? extends Number> numberList) {
        numberList.forEach(System.out::println);
        //Can read from the object, but can't add into the list
        Number number = numberList.get(0);
        /*
        Still can't add any value to it though, as still the compiler cannot determine the exact type
        If it allows an Integer in, what if the original type passed is a Double
        */
    }
}
