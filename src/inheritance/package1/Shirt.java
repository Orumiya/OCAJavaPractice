package inheritance.package1;

public class Shirt extends Cloth {

    int neckSize;

    public Shirt(String name, char colorCode, int size, int neckSize) {
        this(name, colorCode, size);
        this.neckSize = neckSize;
        System.out.println("constructor 1");
    }

    public Shirt(String name, char colorCode) {
        super(name);
        setColorCode(colorCode);
        System.out.println("constructor 3");
    }

    public Shirt(String name, char colorCode, int size) {
        this(name, colorCode);
        setSize(size);
        System.out.println("constructor 2");
    }

    public int getNeckSize() {
        return this.neckSize;
    }

    public void setNeckSize(int newNeckSize) {
        this.neckSize = newNeckSize;
    }
    @Override
    public void display() {
        super.display();
        System.out.println("info from child class:");
        System.out.println("neckSize: " + getNeckSize());
        System.out.println("shirt name: " + getName());
        System.out.println("shirt color: " + getColorCode());
    }
}
