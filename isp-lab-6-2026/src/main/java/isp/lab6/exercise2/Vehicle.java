package isp.lab6.exercise2;

public class Vehicle {
    private String VIN;
    private String LicensePlate;
    private String make;
    private String model;
    private Integer year;

    public Vehicle(String VIN, String make, String model, Integer year){
        this.VIN=VIN;
        this.make=make;
        this.model=model;
        this.year=year;
    }

    public String getVIN(){
        return VIN;
    }
    public void setVIN(String VIN) {}

    @Override
    public int hashCode(){
        return this.VIN.hashCode();
    }

    @Override
    public boolean equals(Object obj){ //asta trb suprascris ca sa stie HashSet pe baza a ce sa faca hash si comparatie
        return this.VIN.hashCode()==(((Vehicle) obj).VIN.hashCode());
    }

    @Override
    public String toString(){
        return "VEHICLE:\n" + "VIN= " + VIN + "\nmake= " + make + "\nmodel= " + model + "\nyear= " + year;
    }
}
