package interfaces_test;

public interface Y {

    // this method is public abstract by default
    void a();
    public default void b() { }

    // private methods will not be seen outside this class
    private void c() {}
    public static void d() {}
}
