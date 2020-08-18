package inheritance.package1;

public class Trousers extends Cloth {
    public Trousers(String name) {
        super(name);
    }
    @Override
    public void display() {
        System.out.println("childclass println");
        super.display();
    }
}
