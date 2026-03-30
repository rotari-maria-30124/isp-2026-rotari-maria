package isp.lab5.exercise1;

public class Product {
    private String productId;
    private String name;
    private double price;
    private ProductCategory productCategory;

    public Product(String name, double price, ProductCategory productCategory){
        this.name=name;
        this.price=price;
        this.productCategory=productCategory;
    }

    public double getPrice() {
        return price;
    }
}
