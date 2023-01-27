package uber.kautilya.generics.userdefined;

public class Zoo {
    public static void main(String[] args) {
        /*
        Without <Monkey> on the right side, it would permit Lion instances as well
        This is because object creation takes place first
        */
        Cage<Monkey> cage = new Cage(new Monkey(), new Lion());

        //With <Monkey> parameterizing Cage on the right, will accept only Monkey objects
        Cage<Monkey> cage2 = new Cage<Monkey>(new Monkey(), new Monkey());
        cage.setAnimal1(new Monkey());
        cage.setAnimal2(new Monkey());

        Monkey monkey = cage.getAnimal1();

        /*
        Cage<Monkey> cage = new Cage<>();
        cage.setAnimal1(new Monkey());
        cage.setAnimal2(new Monkey());

        Monkey monkey = cage.getAnimal1();*/
    }
}
