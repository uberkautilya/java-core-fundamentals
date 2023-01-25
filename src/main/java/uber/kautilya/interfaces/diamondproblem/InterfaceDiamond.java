package uber.kautilya.interfaces.diamondproblem;

public class InterfaceDiamond implements InterfaceB, InterfaceC{
    public static void main(String[] args) {
        new InterfaceDiamond().abstractMethod();
        new InterfaceDiamond().methodZ();
    }

   @Override
    public void methodZ() {
        InterfaceC.super.methodZ();
    }

    @Override
    public void abstractMethod() {
        System.out.println("abstractMethod() implementation in InterfaceDiamond");
    }
}
