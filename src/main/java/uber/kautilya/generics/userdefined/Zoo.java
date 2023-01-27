package uber.kautilya.generics.userdefined;

public class Zoo {
    public static void main(String[] args) {
        Cage<Monkey> cage = new Cage<>();
        cage.setAnimal1(new Monkey());
        cage.setAnimal2(new Monkey());

        Monkey monkey = cage.getAnimal1();
    }
}
