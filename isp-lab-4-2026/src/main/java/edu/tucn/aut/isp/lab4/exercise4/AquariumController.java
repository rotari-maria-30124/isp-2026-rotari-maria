package edu.tucn.aut.isp.lab4.exercise4;

import edu.tucn.aut.isp.lab4.exercise3.FishFeeder;

import java.time.LocalTime;

public class AquariumController {
    private String manufacturer;
    private String model;
    private LocalTime currentTime;
    private LocalTime feedingTime;
    private edu.tucn.aut.isp.lab4.exercise3.FishFeeder fishFeeder;
    private LocalTime lightsOnTime;
    private LocalTime lightsOffTime;
    private Lights lights;

    private boolean feedFlag;

    public AquariumController(String manufacturer, String model, FishFeeder fishFeeder){
        this.manufacturer=manufacturer;
        this.model=model;
        currentTime=LocalTime.now();
        feedingTime=LocalTime.of(12,0,0);
        this.fishFeeder=fishFeeder;
        feedFlag=false;
        this.lights=lights;
        this.lightsOnTime=LocalTime.of(15,0,0);
        this.lightsOffTime=LocalTime.of(22,0,0);
    }
    public void setCurrentTime(LocalTime currentTime){
        this.currentTime=currentTime;
        if(!currentTime.isBefore(feedingTime) && !feedFlag){
            fishFeeder.feed();
            feedFlag=true;
        }
        if(!currentTime.isBefore(lightsOnTime) && lightsOnTime.isBefore(lightsOffTime)){
            this.lights.turnOn();
        }
        else{
            this.lights.turnOff();
        }
    }
    public void resetFlag(){
        feedFlag=false;
    }
    @Override
    public String toString(){
        return "AquariumController{" + "manufacturer= " + manufacturer + '\'' + ", model= " + '\'' + ", currentTime= " + currentTime + '}';
    }
    //attributs
    //constructors
    //methods
}
