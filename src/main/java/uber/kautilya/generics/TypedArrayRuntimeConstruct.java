package uber.kautilya.generics;

import java.util.ArrayList;
import java.util.List;

public class TypedArrayRuntimeConstruct {
    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>();
        addNames(nameList, "Name 1");
        addNames(nameList, "Name 2");
        incorrectAddToNames(nameList, 200);
        //Retrieving blocked: TypeCastException
        String retrievedVal = nameList.get(2);

        String[] nameArray = new String[5];
        addToArray(nameArray, "Name 3");
        //Cannot add itself: The type information is on the instance, not the variable
        incorrectAddtoArray(nameArray, 10);
    }

    private static void incorrectAddtoArray(Object[] nameArray, int i) {
        //The type information is on the instance passed in ass argument.
        //Hence, cannot add an integer to this array: ArrayStoreException
        nameArray[0] = i;
    }

    private static void addToArray(String[] nameArray, String name) {
        nameArray[0] = name;
    }

    private static void incorrectAddToNames(List namesCopy, int intVal) {
        //The list instance doesn't hold information of the parameterized type.
        //It is available only on the original variable
        namesCopy.add(intVal);
    }

    private static void addNames(List<String> names, String str) {
        names.add(str);
    }
}
