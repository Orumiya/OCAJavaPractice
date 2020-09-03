package interfaces2;

public interface Blue {
    // interface field must be static final !!! abstract class can have instance and static fields
    public static final char colorCode = 'B';
    // this method is implicitly abstract!!!!
    // has to be implemented in the class
    public void print();

    default void display() {
        System.out.println("It is blue.");
    }
}
