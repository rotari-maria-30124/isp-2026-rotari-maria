import java.util.HashMap;
import java.util.Map;

public class Dish extends MenuItem {

    private Map<String, Double> ingredients = new HashMap<>();

    public Dish(String name, double price) {
        super(name, price);
    }
    public void addIngredient(String ingredient, Double quantity) {
        ingredients.put(ingredient, quantity);
    }
    public void showIngredients() {
        for (String key:ingredients.keySet()) {
            System.out.println(key + "-" + ingredients.get(key));
        }
    }
    public void removeIngredient(String ingredient) {
        ingredients.remove(ingredient);
    }
    @Override
    public String getInfo() {
        return name + " (dish)";
    }
}