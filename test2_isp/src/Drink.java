public class Drink extends MenuItem {
    private double volume;

    public Drink(String name, double price, double volume){
        super(name, price);
        this.volume=volume;
    }

    public double getVolume() {
        return volume;
    }
    @Override
    public String getInfo(){
        return "Drink: " + name;
    }
}
