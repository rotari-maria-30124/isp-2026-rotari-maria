package isp.lab6.exercise2;

public class Exercise2 {
    public static void main(String[] args) {
        VehicleRegistry r=new VehicleRegistry();

        Vehicle v1=new Vehicle("1", "BMW", "X3", 2019);
        Vehicle v2=new Vehicle("2", "Dacia", "Logan", 2020);
        Vehicle v3=new Vehicle("3", "Audi", "A4", 2023);

        try{
            r.addVehicle(v1);
            r.addVehicle(v2);
            r.addVehicle(v3);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("List:\n" + r.getVehiclesString());
        r.removeVehicle(v2);
        System.out.println("After removing v2:\n"+ r.getVehiclesString());
        System.out.println("v2 exists? " + r.getVehiclesString().contains("2"));
    }
}
