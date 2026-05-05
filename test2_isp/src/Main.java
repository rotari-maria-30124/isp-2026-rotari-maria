public class Main {
    public static void main(String[] args) {

        Menu menu = new Menu("My Menu");

        Dish pasta = new Dish("Pasta", 25);
        pasta.addIngredient("Tomato", 2.0);
        pasta.addIngredient("Mozzarella", 1.5);

        Drink wine = new Drink("Wine", 15, 0.5);

        menu.addDish(pasta);
        menu.addDrink(wine);

        menu.showMenu();
    }
}