package edu.tucn.aut.isp.lab4.exercise3;

import java.time.LocalTime;

public class Exercise3 {
    public static void main(String[] args) {
        FishFeeder fishFeeder=new FishFeeder("JBL", "PRONOVO AUTOFOOD");
        fishFeeder.fillUp();
        System.out.println(fishFeeder);
        AquariumController aquariumController=new AquariumController("BOSCH", "B1", fishFeeder);
        //aquariumController.setCurrentTime(LocalTime.of(13,0,0)); ORA DE HRANIRE
        aquariumController.setCurrentTime(LocalTime.of(9,0,0));
        System.out.println(aquariumController);
    }
}
