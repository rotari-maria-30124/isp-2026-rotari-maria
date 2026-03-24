package edu.tucn.aut.isp.lab4.exercise5;


import java.time.LocalTime;

public class AquariumController {
    private String manufacturer;
    private String model;
    private LocalTime currentTime;
    private LocalTime feedingTime;
    private int presetTemperature;
    private float presetLevel;

    private FishFeeder fishFeeder;
    private LevelSensor levelSensor;
    private TemperatureSensor temperatureSensor;
    private Heater heater;
    private Alarm alarm;

    private boolean feedFlag;

    public AquariumController(String manufacturer, String model, FishFeeder fishFeeder, LevelSensor levelSensor, TemperatureSensor temperatureSensor, Heater heater, Alarm alarm){
        this.manufacturer=manufacturer;
        this.model=model;
        this.fishFeeder=fishFeeder;
        this.levelSensor=levelSensor;
        this.temperatureSensor=temperatureSensor;
        this.heater=heater;
        this.alarm=alarm;
        currentTime=LocalTime.now();
        feedingTime=LocalTime.of(12,0,0);
        presetTemperature=25;
        presetLevel=50;
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

    public void setFeedingTime(LocalTime feedingTime) {
        this.feedingTime = feedingTime;
    }
    public void checkTemperature(){
        if(temperatureSensor.getValue()<presetTemperature){
            heater.turnOn();
        }
        else{
            if(temperatureSensor.getValue()==presetTemperature){
                heater.turnOff();
            }
        }
    }
    public void checkWaterLevel(){
        if(levelSensor.getValue()<presetLevel){
            alarm.turnOn();
        }
        else{
            alarm.turnOff();
        }
    }
    public void resetFlag(){
        feedFlag=false;
    }
    @Override
    public String toString(){
        return "AquariumController{" +
                "manufacturer= " + manufacturer + '\'' +
                ", model= " + model + '\'' +
                ", currentTime= " + currentTime +
                ", feedingTime= " + feedingTime +
                ", presetTemperature= " + presetTemperature +
                ", presetLevel= " + presetLevel +
                '}';
    }
}
