package interfaces_test;

public class InterfaceTestMain {
    public static void main(String[] args) {

        Z testZ = new Z();
        testZ.a();
        testZ.b();
        // this comes from the parent class
        testZ.e();
        // static methods have to be invoked by classname.method, no conflict here
        Y.d();
        X.d();
    }
}
