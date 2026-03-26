package edu.tucn.aut.isp.lab4.exercise1;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.time.LocalTime;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AquariumControllerTest {
    //implement minimal tests
    @Test
    void dummyTestNPE() {
        Assertions.assertThrows(
                NullPointerException.class, () -> {Integer nullInt = null; nullInt.toString();});
    }
    @Test
    void testTime(){
        AquariumController ac= new AquariumController("BOSCH", "B1");
        ac.setCurrentTime(LocalTime.of(10, 0, 0));
        assertEquals("AquariumController{manufacturer= BOSCH', model= B1', currentTime= 10:00}", ac.toString());
    }
}

