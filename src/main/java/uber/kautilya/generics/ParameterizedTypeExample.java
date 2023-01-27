package uber.kautilya.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ParameterizedTypeExample {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("One");
        stringList.add("Two");

        String returnValue = stringList.get(0);
        Iterator<String> stringIterator = stringList.iterator();
        System.out.println(stringIterator.next());
    }

}
