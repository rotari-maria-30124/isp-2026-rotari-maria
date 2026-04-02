package isp.lab5.exercise3;

public class TemperatureSensor extends Sensor{
    private double temperature;

    public TemperatureSensor(double temperature){
        this.temperature=temperature;
    }
    @Override
    public double measureValue(){
        return temperature;
    }
}
