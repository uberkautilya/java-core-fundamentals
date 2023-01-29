package uber.kautilya.generics.wildcards.boundlimits.userdefined;

public class Zoo {
    public static void main(String[] args) {

        Cage<Monkey> cage = new Cage(new Monkey(), new Lion());

        Cage<Monkey> cage2 = new Cage<Monkey>(new Monkey(), new Monkey());
        cage2.setAnimal1(new Monkey());
        cage2.setAnimal2(new Monkey());

        Monkey monkey = cage2.getAnimal1();

    }
}
