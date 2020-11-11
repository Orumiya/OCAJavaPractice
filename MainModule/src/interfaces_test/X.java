package interfaces_test;

public interface X {
    void a();
    public default void b() { }
    private void c() {}
    public static void d() {}
}
