package isp.lab5.exercise2;

public class SmartWatch implements Chargeable {
    private int batteryLevel;

    public SmartWatch(int batteryLevel){
        this.batteryLevel=batteryLevel;
    }
    @Override
    public void charge(int duration){
        batteryLevel+=duration;
        if(batteryLevel>100) {
            batteryLevel=100;
        }
    }
    @Override
    public int getBatteryLevel(){
        return batteryLevel;
    }
}
