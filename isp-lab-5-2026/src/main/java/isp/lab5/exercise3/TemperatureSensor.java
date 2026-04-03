package isp.lab5.exercise3;

public class TemperatureSensor extends Sensor{
    private double temperature;

    public TemperatureSensor(String installation, String name, double temperature) {
        super(installation, name);
        this.temperature = temperature;
    }

    @Override
    public double measureValue() {
        return temperature;
    }
}
