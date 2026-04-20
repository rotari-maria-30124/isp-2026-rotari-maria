package isp.lab6.exercise2;

import java.util.HashSet;

public class VehicleRegistry {
    private HashSet<Vehicle> vehicles;

    public VehicleRegistry(){
        this.vehicles=new HashSet<>();
    }

    public void addVehicle(Vehicle vehicle) throws Exception{
        try {
            this.vehicles.add(vehicle);
        } catch (Exception ex){
            throw new Exception("Vehicle already exists");
        }
    }
    public void removeVehicle(Vehicle vehicle){
        this.vehicles.remove(vehicle);
    }

    public String getVehiclesString(){
        StringBuilder sb=new StringBuilder();
        for(Vehicle vehicle:this.vehicles){
            sb.append(vehicle.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
