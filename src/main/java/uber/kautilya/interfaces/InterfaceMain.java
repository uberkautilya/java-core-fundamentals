package uber.kautilya.interfaces;

public class InterfaceMain implements InterfaceA {

    public static void main(String[] args) {
        new InterfaceMain().methodB();
    }

    @Override
    public void methodB() {
        System.out.println("methodB overridden from InterfaceMain");
        /*
        * this.privateMethod();
        * The above method from InterfaceA has private access specifier in the interface. Cannot be accessed from here
        * */
        privateMethod(); //This can invoke the below method. Effectively hidden inheritance?
    }

    private void privateMethod() {
        System.out.println("privateMethod in InterfaceMain");
    }
}
