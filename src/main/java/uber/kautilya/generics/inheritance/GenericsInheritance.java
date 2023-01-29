package uber.kautilya.generics.inheritance;

import java.util.ArrayList;
import java.util.List;

public class GenericsInheritance {
    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>();
        nameList.add("Name 1");
        nameList.add("Name 2");
//        printList(nameList);

        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
//        printList(intList);

    }

    private static void printList(List<Object> nameList) {
        nameList.forEach(System.out::println);
        //As Strings are objects, will allow the below code to be added.
        // However, if the List passed into this method was of type Integer -> Break
        nameList.add("Hello");
    }
}
