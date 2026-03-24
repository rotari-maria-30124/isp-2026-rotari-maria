package edu.tucn.aut.isp.lab4.exercise4;


import java.time.LocalTime;

public class Exercise4 {
    public static void main(String[] args) {
        FishFeeder fishFeeder=new FishFeeder("JBL", "PRONOVO AUTOFOOD");
        fishFeeder.fillUp();
        System.out.println(fishFeeder);
        Lights lights=new Lights();
        AquariumController aquariumController=new AquariumController("BOSCH", "B1", fishFeeder, lights);
        //aquariumController.setCurrentTime(LocalTime.of(13,0,0)); ORA DE HRANIRE
        aquariumController.setCurrentTime(LocalTime.of(9,0,0));
        aquariumController.setCurrentTime(LocalTime.of(15,0,0));
        aquariumController.setCurrentTime(LocalTime.of(17,0,0)); //Fals pentru ca au fost hraniti deja
        System.out.println(aquariumController);
    }
}
