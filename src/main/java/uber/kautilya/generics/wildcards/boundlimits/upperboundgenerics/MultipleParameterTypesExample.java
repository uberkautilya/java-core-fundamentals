package uber.kautilya.generics.wildcards.boundlimits.upperboundgenerics;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Two types of parameter in Maps - Key Value generics
 */
public class MultipleParameterTypesExample {
    public static void main(String[] args) {
        //If values were getting added at time of instantiation, we need to provide the type in the <>
        Map<String, Date> map = new HashMap<>();
        Date value = map.get("key");
        //Compiler knows the variable types
    }
}
