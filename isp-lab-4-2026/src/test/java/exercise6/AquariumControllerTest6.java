package exercise6;

import edu.tucn.aut.isp.lab4.exercise6.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AquariumControllerTest6 {
    @Test
    void test1(){
        FishFeeder fishFeeder=new FishFeeder("JBL", "PRONOVO AUTOFOOD");
        fishFeeder.fillUp();
        TemperatureSensor temperatureSensor=new TemperatureSensor("BOSCH", "A1", 25);
        LevelSensor levelSensor=new LevelSensor("BOSCH", "C1", 25);
        Heater heater=new Heater("BOSCH", "D1");
        Alarm alarm=new Alarm("BOSCH", "E1");
        PhSensor phSensor=new PhSensor("BOSCH", "F1", 6.5f);
        AquariumController aquariumController=new AquariumController("BOSCH", "B1", fishFeeder, levelSensor, temperatureSensor, heater, alarm, phSensor);
        aquariumController.checkPH();
        assertEquals(true, alarm.isOn());
    }
    @Test
    void test2(){
        FishFeeder fishFeeder=new FishFeeder("JBL", "PRONOVO AUTOFOOD");
        fishFeeder.fillUp();
        TemperatureSensor temperatureSensor=new TemperatureSensor("BOSCH", "A1", 25);
        LevelSensor levelSensor=new LevelSensor("BOSCH", "C1", 25);
        Heater heater=new Heater("BOSCH", "D1");
        Alarm alarm=new Alarm("BOSCH", "E1");
        PhSensor phSensor=new PhSensor("BOSCH", "F1", 7.5f);
        AquariumController aquariumController=new AquariumController("BOSCH", "B1", fishFeeder, levelSensor, temperatureSensor, heater, alarm, phSensor);
        aquariumController.checkPH();
        assertEquals(false, alarm.isOn());
    }
}
