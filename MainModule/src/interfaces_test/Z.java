package interfaces_test;

public class Z extends W implements Y, X {
    public void a() {
        System.out.println("void a() is abstract and has to be implemented");
    }

    public void b() {
        System.out.println("b() is a default method " +
                "but in 2 interfaces with the same signature, it behaves as an abstract method and needs to be implemented");
    }
}
