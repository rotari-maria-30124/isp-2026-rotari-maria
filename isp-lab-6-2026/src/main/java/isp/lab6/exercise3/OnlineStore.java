package isp.lab6.exercise3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OnlineStore {
    private List<Product> products;
    private Map<String, ActiveSession> sessions;

    public OnlineStore(){
        products=new ArrayList<>();
        sessions=new HashMap<>();
    }
    public void addProduct(Product product){
        products.add(product);
    }

    public List<Product> getProducts() {
        return products;
    }
    public List<Product> getProductsSorted(){
        List<Product> sorted=new ArrayList<>(products);
        for(int i=0; i<sorted.size(); i++){
            for(int j=i+1; j<sorted.size(); j++){
                if(sorted.get(i).getPrice()>sorted.get(j).getPrice()){
                    Product temp=sorted.get(i);
                    sorted.set(i, sorted.get(j));
                    sorted.set(j, temp);
                }
            }
        }
        return sorted;
    }
    public void addSession(String username){
        sessions.put(username, new ActiveSession(username));
    }
    public void removeSession(String username){
        sessions.remove(username);
    }
    public void addToCart(String username, Product product, int quantity){
        ActiveSession session=sessions.get(username);
        if(session!=null){
            session.addToCart(product, quantity);
        }
    }
    public void checkout(String username){
        ActiveSession session=sessions.get(username);
        if(session!=null){
            System.out.println("Checkout for: " + username);
            System.out.println(session);
            session.clearToCart();
        }
    }

}
