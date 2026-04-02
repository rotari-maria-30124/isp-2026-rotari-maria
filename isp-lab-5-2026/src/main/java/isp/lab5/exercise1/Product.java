package isp.lab5.exercise1;

public class Product {
    private String productId;
    private String name;
    private double price;
    private ProductCategory productCategory;

    public Product(String productId, String name, double price, ProductCategory productCategory){
        this.productId=productId;
        this.name=name;
        this.price=price;
        this.productCategory=productCategory;
    }
    public double getPrice() {
        return price;
    }
    @Override
    public String toString(){
        return "Product: \n" +
                "product ID='" + productId + '\n' +
                ", name='" + name + '\n' +
                ", price='" + price + '\n' +
                ", product category='" + productCategory +
                '}';
    }
}
