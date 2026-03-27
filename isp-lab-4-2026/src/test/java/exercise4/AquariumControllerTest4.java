package exercise4;

import edu.tucn.aut.isp.lab4.exercise4.AquariumController;
import edu.tucn.aut.isp.lab4.exercise4.FishFeeder;
import edu.tucn.aut.isp.lab4.exercise4.Lights;
import org.junit.jupiter.api.Test;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AquariumControllerTest4 {
    @Test
    void test1(){
        FishFeeder fishFeeder=new FishFeeder("JBL", "PRONOVO AUTOFOOD");
        fishFeeder.fillUp();
        Lights lights=new Lights();
        AquariumController aquariumController=new AquariumController("BOSCH", "B1", fishFeeder, lights);
        aquariumController.setCurrentTime(LocalTime.of(10,0,0));
        assertEquals(14, fishFeeder.getMeals());
    }

    @Test
    void test2(){
        FishFeeder fishFeeder=new FishFeeder("JBL", "PRONOVO AUTOFOOD");
        fishFeeder.fillUp();
        Lights lights=new Lights();
        AquariumController aquariumController=new AquariumController("BOSCH", "B1", fishFeeder, lights);
        aquariumController.setCurrentTime(LocalTime.of(16,0,0));
        assertEquals(13, fishFeeder.getMeals());
    }
}
