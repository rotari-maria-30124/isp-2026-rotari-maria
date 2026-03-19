package isp.lab3.exercise3;

public class MainOfExercise3 {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Dacia", "Logan", 150, 'B');
        Vehicle v2 = new Vehicle("Volkswagen", "UP", 130, 'D');
        Vehicle v3 = new Vehicle("Dacia", "Logan", 150, 'B');
        System.out.println(v1.equals(v3));
        System.out.println(v2.getModel());
        System.out.println("Instances of ");
        System.out.println(Vehicle.getInstance());
    }
}
