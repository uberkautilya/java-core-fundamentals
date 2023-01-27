package uber.kautilya.generics.userdefined;

public class Cage<E> {
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

    /*
    Generics above ensures both animals are of the same class
    private Object animal1;
    private Object animal2;

    public Object getAnimal1() {
        return animal1;
    }

    public void setAnimal1(Object animal1) {
        this.animal1 = animal1;
    }

    public Object getAnimal2() {
        return animal2;
    }

    public void setAnimal2(Object animal2) {
        this.animal2 = animal2;
    }*/
}
