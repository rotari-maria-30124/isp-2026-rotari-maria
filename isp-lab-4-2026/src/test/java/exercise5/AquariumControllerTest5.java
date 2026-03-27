package exercise5;

import edu.tucn.aut.isp.lab4.exercise5.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AquariumControllerTest5 {
    @Test
    void test1(){
        FishFeeder fishFeeder=new FishFeeder("JBL", "PRONOVO AUTOFOOD");
        fishFeeder.fillUp();
        TemperatureSensor temperatureSensor=new TemperatureSensor("BOSCH", "A1", 25);
        LevelSensor levelSensor=new LevelSensor("BOSCH", "C1", 25);
        Heater heater=new Heater("BOSCH", "D1");
        Alarm alarm=new Alarm("BOSCH", "E1");
        AquariumController aquariumController=new AquariumController("BOSCH", "B1", fishFeeder, levelSensor, temperatureSensor, heater, alarm);
        aquariumController.checkTemperature();
        assertEquals(false, heater.isOn());
    }
    @Test
    void test2(){
        FishFeeder fishFeeder=new FishFeeder("JBL", "PRONOVO AUTOFOOD");
        fishFeeder.fillUp();
        TemperatureSensor temperatureSensor=new TemperatureSensor("BOSCH", "A1", 20);
        LevelSensor levelSensor=new LevelSensor("BOSCH", "C1", 25);
        Heater heater=new Heater("BOSCH", "D1");
        Alarm alarm=new Alarm("BOSCH", "E1");
        AquariumController aquariumController=new AquariumController("BOSCH", "B1", fishFeeder, levelSensor, temperatureSensor, heater, alarm);
        aquariumController.checkTemperature();
        assertEquals(true, heater.isOn());
    }
    @Test
    void test3(){
        FishFeeder fishFeeder=new FishFeeder("JBL", "PRONOVO AUTOFOOD");
        fishFeeder.fillUp();
        TemperatureSensor temperatureSensor=new TemperatureSensor("BOSCH", "A1", 25);
        LevelSensor levelSensor=new LevelSensor("BOSCH", "C1", 25);
        Heater heater=new Heater("BOSCH", "D1");
        Alarm alarm=new Alarm("BOSCH", "E1");
        AquariumController aquariumController=new AquariumController("BOSCH", "B1", fishFeeder, levelSensor, temperatureSensor, heater, alarm);
        aquariumController.checkWaterLevel();
        assertEquals(true, alarm.isOn());
    }
    @Test
    void test4(){
        FishFeeder fishFeeder=new FishFeeder("JBL", "PRONOVO AUTOFOOD");
        fishFeeder.fillUp();
        TemperatureSensor temperatureSensor=new TemperatureSensor("BOSCH", "A1", 25);
        LevelSensor levelSensor=new LevelSensor("BOSCH", "C1", 65);
        Heater heater=new Heater("BOSCH", "D1");
        Alarm alarm=new Alarm("BOSCH", "E1");
        AquariumController aquariumController=new AquariumController("BOSCH", "B1", fishFeeder, levelSensor, temperatureSensor, heater, alarm);
        aquariumController.checkWaterLevel();
        assertEquals(false, alarm.isOn());
    }
}
