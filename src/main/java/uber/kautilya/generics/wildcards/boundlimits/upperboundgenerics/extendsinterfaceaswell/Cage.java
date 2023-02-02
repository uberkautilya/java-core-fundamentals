package uber.kautilya.generics.wildcards.boundlimits.upperboundgenerics.extendsinterfaceaswell;

/**
 * E can be any type which extends Animal type. Can longer be String
 * Can be Lion or Monkey as both extends Animal type
 * Even if Animal were an interface, still syntax is 'extends Animal'
 * E extends Animal & Eats => E extends Animal and implements Eats simultaneously
 * Class names followed with Interfaces that are implemented
 * @param <E>
 */
public class Cage<E extends Animal & Eats & Runs> {
    private E animal1;
    private E animal2;

    public Cage() {
    }

    public Cage(E animal1, E animal2) {
        this.animal1 = animal1;
        this.animal2 = animal2;
    }

    public E getAnimal1() {
        return animal1;
    }

    public void setAnimal1(E animal1) {
        this.animal1 = animal1;
    }

    public E getAnimal2() {
        return animal2;
    }

    public void setAnimal2(E animal2) {
        this.animal2 = animal2;
    }

    /**
     * animal1.getType() is possible because we know E extends Animal
     * All methods of the Animal class are available here
     * @return true if both animals are of type - small, medium or large
     */
    public boolean isCompatible() {
        return animal1.getType().equals(animal2.getType());
    }

    /**
     * These calls -> i.e., animal1.eat() can be made because of E extends Animal & Eats & Runs
     */
    public void feedAnimal() {
        animal1.eat();
        animal2.eat();
    }
}
