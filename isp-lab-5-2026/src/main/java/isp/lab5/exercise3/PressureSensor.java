package isp.lab5.exercise3;

public class PressureSensor extends Sensor{
    private double pressure;

    public PressureSensor(String installation, String name, double pressure){
        super(installation, name);
        this.pressure=pressure;
    }
    @Override
    public double measureValue(){
        return pressure;
    }
}
