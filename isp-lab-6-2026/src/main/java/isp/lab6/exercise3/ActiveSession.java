package isp.lab6.exercise3;

import java.util.HashMap;

public class ActiveSession {
    private String username;
    private HashMap<Product, Integer> shoppingCart;

    public ActiveSession(String username){
        this.username=username;
        this.shoppingCart=new HashMap<>();
    }
    public void addToCart(Product product, Integer quantity){this.shoppingCart.put(product, quantity);}
    public void removeToCart(String product){
        this.shoppingCart.remove(product);
    }
    public void clearToCart(){
        this.shoppingCart.clear();
    }

    public String getShoppingCartString() {
        StringBuilder sb = new StringBuilder();
        for (Product product : this.shoppingCart.keySet()) {
            Integer quantity = this.shoppingCart.get(product);
            sb.append(product.getName());
            sb.append(": ");
            sb.append(quantity);
            sb.append("\n");
        }
        return sb.toString();
    }
    public HashMap<Product, Integer> getShoppingCart() {
        return shoppingCart;
    }
}
