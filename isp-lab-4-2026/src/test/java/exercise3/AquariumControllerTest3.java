package exercise3;

import edu.tucn.aut.isp.lab4.exercise3.FishFeeder;
import edu.tucn.aut.isp.lab4.exercise3.AquariumController;
import org.junit.jupiter.api.Test;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AquariumControllerTest3 {
    @Test
    void test1(){
        FishFeeder fishFeeder=new FishFeeder("JBL","PRONOVO AUTOFOOD");
        fishFeeder.fillUp();
        AquariumController aquariumController=new AquariumController("BOSCH","B1", fishFeeder);
        aquariumController.setCurrentTime(LocalTime.of(10,0,0));
        assertEquals(14, fishFeeder.getMeals());
    }

    @Test
    void test2(){
        FishFeeder fishFeeder=new FishFeeder("JBL","PRONOVO AUTOFOOD");
        fishFeeder.fillUp();
        AquariumController aquariumController=new AquariumController("BOSCH","B1", fishFeeder);
        aquariumController.setCurrentTime(LocalTime.of(14,0,0));
        assertEquals(13, fishFeeder.getMeals());
    }

    @Test
    void test3(){
        FishFeeder fishFeeder=new FishFeeder("JBL","PRONOVO AUTOFOOD");
        fishFeeder.fillUp();
        AquariumController aquariumController=new AquariumController("BOSCH","B1", fishFeeder);
        aquariumController.setCurrentTime(LocalTime.of(13,0,0));
        aquariumController.setCurrentTime(LocalTime.of(14,0,0));
        assertEquals(13, fishFeeder.getMeals());
    }
}
