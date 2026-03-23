package edu.tucn.aut.isp.lab4.exercise1;

import java.time.LocalTime;

public class Exercise1 {

    public static void main(String[] args) {
        AquariumController aquariumController= new AquariumController("BOSCH", "B1");
        System.out.println(aquariumController);
        aquariumController.setCurrentTime(LocalTime.of(12,50,0));
        System.out.println(aquariumController);
        //create an object
    }
}
