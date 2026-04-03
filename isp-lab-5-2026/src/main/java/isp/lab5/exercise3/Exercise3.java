package isp.lab5.exercise3;

import java.util.ArrayList;

public class Exercise3 {
    public static void main(String[] args){
       TemperatureSensor temperatureSensor1=new TemperatureSensor("R1", "T1", 20);
       TemperatureSensor temperatureSensor2=new TemperatureSensor("R2", "T2", 25);
       TemperatureSensor temperatureSensor3=new TemperatureSensor("R3", "T3", 30);
       TemperatureSensor temperatureSensor4=new TemperatureSensor("R4", "T4", 35);
       TemperatureSensor temperatureSensor5=new TemperatureSensor("R5", "T5", 26);
       PressureSensor pressureSensor1=new PressureSensor("R1", "P1", 110);
       PressureSensor pressureSensor2=new PressureSensor("R2", "P2", 115);
       PressureSensor pressureSensor3=new PressureSensor("R3", "P3", 120);
       PressureSensor pressureSensor4=new PressureSensor("R4", "P4", 125);
       PressureSensor pressureSensor5=new PressureSensor("R5", "P5", 130);

       ArrayList<Sensor> sensors=new ArrayList<>();
       sensors.add(temperatureSensor1);
       sensors.add(temperatureSensor2);
       sensors.add(temperatureSensor3);
       sensors.add(temperatureSensor4);
       sensors.add(temperatureSensor5);
       sensors.add(pressureSensor1);
       sensors.add(pressureSensor2);
       sensors.add(pressureSensor3);
       sensors.add(pressureSensor4);
       sensors.add(pressureSensor5);
       MonitoringService service=new MonitoringService(sensors);
        System.out.println("Average temperature sensors: " + service.getAverageTemperatureSensors());
        System.out.println("Average all sensors: " + service.getAverageAllSensors());
    }
}
