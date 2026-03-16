package isp.lab3.exercise3;

public class MainOfExercise3 {
    public static void msin(String[] args) {
        Vehicle v1 = new Vehicle("Dacia", "Logan", 150, 'B');
        Vehicle v2 = new Vehicle("Volkswagen", "UP", 130, 'D');
        Vehicle v3 = new Vehicle("Dacia", "Logan", 150, 'B');
        System.out.println(v1.equals(v3));
    }
}
