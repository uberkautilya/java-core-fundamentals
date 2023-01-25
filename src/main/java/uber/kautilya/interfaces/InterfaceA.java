package uber.kautilya.interfaces;

public interface InterfaceA {
    /**
     * private int a=3;
     * The private access specifier is NOT allowed in interfaces
     * Implicitly, members are public static final in an interface
    */
    public static final int a = 3;

    /**
     * static methods in an interface needs a body
     */
    public static void methodA() {
        //body
    }

    /**
     * Methods are public abstract implicitly in an interface
     */
    public void methodB();

    /**
     * default methods in interfaces need to have an implementation
     */
    default public void defaultMethod() {
    }

    private void privateMethod() {
        System.out.println("InterfaceA: private methods are allowed in interfaces");
    }

}
