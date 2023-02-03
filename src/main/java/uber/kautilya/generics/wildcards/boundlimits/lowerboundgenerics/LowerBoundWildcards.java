package uber.kautilya.generics.wildcards.boundlimits.lowerboundgenerics;

import java.util.ArrayList;
import java.util.List;


public class LowerBoundWildcards {
    public static void main(String[] args) {

        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);

        List<Double> doubleList = new ArrayList<>();
        doubleList.add(1.00);
        doubleList.add(2.00);
        printNumbers(doubleList);

        List<Number> numberList = new ArrayList<Number>();
        addToList(numberList, 10);
        addToList(numberList, 20.00);
        numberList.stream().forEach(System.out::println);
    }

    /**
     * This is the lower bound -> Any class which is the super class of Number
     * By this, we signal that we want to permit write operations
     * PECS -> Generic that is a Producer Extends, Consumer Super
     * @param numberList
     * @param value
     */
    private static void addToList(List<? super Number> numberList, Number value) {
        //Here consuming value -> Hence ? super Number
        numberList.add(value);
    }

    /**
     * List<Number> numberList as parameter will not permit Integer lists -
     * inheritance of generics works differently
     * '? extends Number' ensures will take in only list of types which extends Number type
     * Only allows reading from the generic list
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
