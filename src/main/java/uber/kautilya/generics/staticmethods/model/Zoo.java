package uber.kautilya.generics.staticmethods.model;

public class Zoo {
    public static void main(String[] args) {

        Monkey monkey1 = new Monkey();
        monkey1.setType("Small");
        Monkey monkey2 = new Monkey();
        monkey2.setType("Small");

        /*
        The below static referencing is possible when the method definition has its own type information
        Here, what type needs to be allotted to E in the method is not available on the class, but the method
        */
        boolean isCompatible = Cage.isCompatible(monkey1, monkey2);

    }
}
