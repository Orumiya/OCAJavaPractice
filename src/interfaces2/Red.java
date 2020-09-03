package interfaces2;

public interface Red {
    default void display() {
        System.out.println("It is red.");
    }
}
