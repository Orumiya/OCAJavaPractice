package interfaces3;

public class Shirt extends Clothing implements Returnable{
    String instanceField;
    public Shirt() {
        this.instanceField = "this is an instance field";
    }
    @Override
    void display() {
        System.out.println("this is a shirt");
    }

    @Override
    public void doReturn() {
        System.out.println("this shirt is returnable");
    }
}
