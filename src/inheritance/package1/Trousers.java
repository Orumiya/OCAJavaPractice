package inheritance.package1;

public class Trousers extends Cloth {

    private String fit;
    public Trousers(String name) {
        super(name);
    }
    @Override
    public void display() {
        System.out.println("childclass println");
        super.display();
    }

    public String getFit() {
        return fit;
    }

    public void setFit(String newFit) {
        fit = newFit;
    }
}
