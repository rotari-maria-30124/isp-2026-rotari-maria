package isp.lab5.exercise2;

public class SmartPhone implements Chargeable{
    private int batteryLevel;

    public SmartPhone(int batteryLevel){
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
