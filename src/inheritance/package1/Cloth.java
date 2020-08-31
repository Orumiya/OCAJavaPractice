package inheritance.package1;

public class Cloth {
    private String name = "default name";
    private int size = 0;
    private char colorCode = 'D';
    static int itemIdPool = 1;
    private int itemId;

    public Cloth(String name) {
        this.name = name;
        System.out.println("super constructor");
        setId();
        itemIdPool++;

    }
    public void display() {
        System.out.println("superclass method: itemName: " + name + ", itemColor: " + colorCode+ ", itemSize: " + size);
    }

    protected void setColorCode(char newColorCode) {
        this.colorCode = newColorCode;
    }

    public char getColorCode() {
        return this.colorCode;
    }

    protected void setName(String newName) {
        this.name = newName;
    }

    public String getName() {
        return this.name;
    }

    protected void setSize(int newSize) {
        this.size = newSize;
    }

    public int getSize() {
        return this.size;
    }

    private void setId() {
        this.itemId = Cloth.itemIdPool;
    }

    public int getId() {
        return itemId;
    }
}
