package edu.tucn.aut.isp.lab4.exercise5;

import java.time.LocalTime;

public class Exercise5 {
    public static void main(String[] args) {
        FishFeeder fishFeeder=new FishFeeder("JBL", "PRONOVO AUTOFOOD");
        fishFeeder.fillUp();
        System.out.println(fishFeeder);
        TemperatureSensor temperatureSensor=new TemperatureSensor("BOSCH", "A1", 25);
        LevelSensor levelSensor=new LevelSensor("BOSCH", "C1", 25);
        Heater heater=new Heater("BOSCH", "D1");
        Alarm alarm=new Alarm("BOSCH", "E1");
        AquariumController aquariumController=new AquariumController("BOSCH", "B1", fishFeeder, levelSensor, temperatureSensor, heater, alarm);
        aquariumController.setCurrentTime(LocalTime.of(9,0,0));
        aquariumController.checkTemperature();
        aquariumController.checkWaterLevel();

        System.out.println(aquariumController);
        System.out.println(heater);
        System.out.println(alarm);
    }
}
