package uber.kautilya.generics;

import java.util.ArrayList;
import java.util.List;

public class TypeErasureAtRuntimeExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        addNames(names, "Name 1");
        addNames(names, "Name 2");
        System.out.println(names);
        /*
        Parameterized type information is not available on the instance, only on the variable
        Within the incorrectAddToNames(), it uses a different variable
        */
        incorrectAddToNames(names, 100);
        System.out.println(names);
        //The int at ordinal 2 cannot be cast to a String: RuntimeException
        String intAdded = names.get(2);
        /*
        This also cannot be performed
        names.add(200);
        */

        //Adding an integer to an un-parameterized copy of this list
        List namesCopy = names;
        namesCopy.add(200);
        System.out.println(namesCopy);
    }

    private static void incorrectAddToNames(List namesCopy, int intVal) {
        /*
        The list instance doesn't hold information of the parameterized type.
        It is available only on the original variable
        */
        namesCopy.add(intVal);
    }

    private static void addNames(List<String> names, String str) {
        names.add(str);
    }

}
