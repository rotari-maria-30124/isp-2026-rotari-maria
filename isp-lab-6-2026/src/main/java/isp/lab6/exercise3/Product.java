package isp.lab6.exercise3;

public class Product {
    public String name;
    public double price;

    public Product(String name, double price){
        this.name=name;
        this.price=price;
    }
    public String getName() {
        return name;
    }
    @Override
    public int hashCode() {
        return this.name.hashCode();
    }
    @Override
    public boolean equals(Object obj) {
        return this.name.hashCode()==(((Product) obj).name.hashCode());
    }
    @Override
    public String toString() {
        return "PRODUCT" + "\n" + "Name: " + name + "\nPrice: " + price;
    }
}
