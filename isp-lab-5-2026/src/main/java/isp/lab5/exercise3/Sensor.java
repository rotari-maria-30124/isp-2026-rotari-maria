package isp.lab5.exercise3;

public abstract class Sensor {
    private String installation;
    private String name;

    public Sensor (String installation, String name){
        this.installation=installation;
        this.name=name;
    }
    public abstract double measureValue();
}
