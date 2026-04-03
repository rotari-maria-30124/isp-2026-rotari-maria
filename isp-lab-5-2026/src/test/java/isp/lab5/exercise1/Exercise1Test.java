package isp.lab5.exercise1;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * @author Radu Miron
 * @version 1
 */
public class Exercise1Test {
    @Test
    public void testEx1(){
        Address address=new Address("Strada Soporului 8", "Cluj");
        Customer customer=new Customer("C1", "Alexia", "0765478365", address);
        customer.address=address;
        Product product1=new Product("P1", "iPad", 5000, ProductCategory.ELECTRONICS);
        Product product2=new Product("P2", "Chair", 300, ProductCategory.HOME_AND_GARDEN);
        Product product3=new Product("P3", "Monopoly", 60, ProductCategory.TOYS);
        Product product4=new Product("P4", "Skirt", 100, ProductCategory.FASHION);
        Product product5=new Product("P5", "Mascara", 56, ProductCategory.BEAUTY);
        Product product6=new Product("P6", "Phone", 4500, ProductCategory.ELECTRONICS);
        Product product7=new Product("P7", "Flowers", 20, ProductCategory.HOME_AND_GARDEN);
        Product product8=new Product("P8", "Toy car", 500, ProductCategory.TOYS);
        Product product9=new Product("P9", "Desk", 550, ProductCategory.HOME_AND_GARDEN);
        Product product10=new Product("P10", "Jacket", 150, ProductCategory.FASHION);
        ArrayList<Product> products=new ArrayList<>();
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);
        products.add(product6);
        products.add(product7);
        products.add(product8);
        products.add(product9);
        products.add(product10);
        Order order=new Order(products, customer);
        double totalExpected= 5000+300+60+100+56+4500+20+500+550+150;
        assertEquals(totalExpected, order.getTotalPrice(), 0.1);
    }
}
