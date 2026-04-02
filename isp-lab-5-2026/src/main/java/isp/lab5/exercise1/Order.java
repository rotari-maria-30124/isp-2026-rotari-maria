package isp.lab5.exercise1;
import java.util.ArrayList;
import java.time.LocalDateTime;

public class Order {
    private ArrayList<Product> products;
    private String orderId;
    private LocalDateTime orderDate;
    private double totalPrice;
    private Customer customer;

    public Order(ArrayList<Product> products, Customer customer){
        if(products.size()!=10){
            throw new IllegalArgumentException("Product list must have 10 products");
        }
        else {
            this.products=products;
        }
        this.totalPrice=0;
        calculateTotalPrice();
        this.customer=customer;
    }
    private void calculateTotalPrice(){
        for(Product product:products){
            this.totalPrice+=product.getPrice();
        }
    }
    @Override
    public String toString(){
        return "Order: \n" +
                "product='" + products + '\n' +
                "customer='" + customer + '\n' +
                "Total price= " + totalPrice +
                '}';
    }
}
