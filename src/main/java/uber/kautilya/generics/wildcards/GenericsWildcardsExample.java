package uber.kautilya.generics.wildcards;

import java.util.ArrayList;
import java.util.List;

public class GenericsWildcardsExample {
    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>();
        nameList.add("Name 1");
        nameList.add("Name 2");
        printList(nameList);

        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        printList(intList);

    }

    /**
     * '?' is a wildcard which signifies a single fixed type
     * Cannot add any type into a wildcard genericList since it only known at invocation
     * @param genericList
     */
    private static void printList(List<?> genericList) {
        genericList.forEach(System.out::println);
        //Can read from the object, but can't add into the list
        Object object = genericList.get(0);
    }
}
