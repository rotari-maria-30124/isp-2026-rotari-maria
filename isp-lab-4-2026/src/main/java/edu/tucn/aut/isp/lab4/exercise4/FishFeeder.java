package edu.tucn.aut.isp.lab4.exercise4;

public class FishFeeder {
    private String manufacturer;
    private String model;
    private int meals;

    public FishFeeder(String manufacturer, String model){
        this.manufacturer=manufacturer;
        this.model=model;
        this.meals=0;
    }

    public void setMeals(int meals){
        this.meals=meals;
    }

    public void feed(){
        if(this.meals>0){
            System.out.println("Fish are being feeded...");
            this.meals--;
        }
        else{
            System.out.println("Fish are not being feeded...");
            System.out.println("Please reloas meals, container is empty.");
        }
    }
    public void fillUp(){
        meals=14;
        System.out.println("FishFeeder food tank is filled up. Meals= " + this.meals);
    }
     public int getMeals(){
        return this.meals;
     }
     @Override
    public String toString(){
        return "FishFeeder{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", meals='" + meals +
                '}';
    }
}
