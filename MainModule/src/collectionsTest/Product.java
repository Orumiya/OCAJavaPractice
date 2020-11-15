package collectionsTest;
enum ProductType{
    DRINK,
    FOOD
}

public abstract class Product implements Vendible {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    private ProductType productType;


}
