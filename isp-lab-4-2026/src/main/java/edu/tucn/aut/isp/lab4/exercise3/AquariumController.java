package edu.tucn.aut.isp.lab4.exercise3;

import java.time.LocalTime;

public class AquariumController {
    private String manufacturer;
    private String model;
    private LocalTime currentTime;
    private LocalTime feedingTime;
    private FishFeeder fishFeeder;

    private boolean feedFlag;

    public AquariumController(String manufacturer, String model, FishFeeder fishFeeder){
        this.manufacturer=manufacturer;
        this.model=model;
        currentTime=LocalTime.now();
        feedingTime=LocalTime.of(12,0,0);
        this.fishFeeder=fishFeeder;
        feedFlag=false;
    }
    public void setCurrentTime(LocalTime currentTime){
        this.currentTime=currentTime;
        if(!currentTime.isBefore(feedingTime) && !feedFlag){
            fishFeeder.feed();
            feedFlag=true;
        }
        else{
            System.out.println("Nu e ora de hranire");
        }
    }
    public void resetFlag(){
        feedFlag=false;
    }
    @Override
    public String toString(){
        return "AquariumController{" + "manufacturer= " + manufacturer + '\'' + ", model= " + model + '\'' + ", currentTime= " + currentTime + '}';
    }
    //attributs
    //constructors
    //methods
}
