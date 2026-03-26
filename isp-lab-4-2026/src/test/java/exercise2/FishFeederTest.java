package exercise2;

import edu.tucn.aut.isp.lab4.exercise2.FishFeeder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FishFeederTest {
    @Test
    void testTime(){
        FishFeeder fishFeeder=new FishFeeder("JBL", "PRONOVO AUTOFOOD");
        fishFeeder.fillUp();
        fishFeeder.feed();
        assertEquals(13, fishFeeder.getMeals());
    }
}
