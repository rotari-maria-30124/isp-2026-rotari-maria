package isp.lab5.exercise3;

import java.util.ArrayList;

public class MonitoringService {
    private ArrayList<Sensor> sensors;

    public MonitoringService(ArrayList<Sensor> sensors) {
        if (sensors.size() != 10) {
            throw new IllegalArgumentException("Must have 10 sensors");
        } else {
            this.sensors = sensors;
        }

    }

    public double getAverageTemperatureSensors(){
        double sum=0;
        int count=0;

        for(Sensor sensors: sensors){
            if(sensors instanceof TemperatureSensor){
                sum+=sensors.measureValue();
                count++;
            }
        }
        if(count==0){
            return 0;
        }
        return sum/count;
    }

    public double getAverageAllSensors(){
        double sum=0;

        for(Sensor sensors: sensors){
            sum+=sensors.measureValue();
        }
        if(sensors.size()==0) {
            return 0;
        }
        return sum/sensors.size();
    }

    @Override
    public String toString(){
        return "Monitoring service: \n" +
                "sensors="+ sensors +
                '}';
    }
}
