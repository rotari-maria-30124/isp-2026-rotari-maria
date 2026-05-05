import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Menu {
    private String name;
    public List<Drink> drinks=new ArrayList<>();
    public Set<Dish> dishes=new HashSet<>();

    public Menu(String name){
        this.name=name;
    }
    public void addDish(Dish dish){
         dishes.add(dish);
    }
    public void addDrink(Drink drink){
        drinks.add(drink);
    }
    public void showMenu(){

    }
    public void removeDish(Dish dish){
        dishes.remove(dish);
    }
    public String getDishInfo(Dish dish){
        return dish.getInfo();
    }
}
