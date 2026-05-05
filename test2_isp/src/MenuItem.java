public abstract class MenuItem {
    protected String name;
    private double price;

    public MenuItem(String name, double price){
        this.name=name;
        this.price=price;
    }
    public abstract String getInfo();
}
