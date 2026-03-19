package isp.lab3.exercise3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class VehicleTest {
    @Test
    public void testToString(){
        Vehicle v1=new Vehicle("Volkswagen", "UP", 130, 'D');
        assertEquals("Volkswagen (UP) speed 130 fuelType D", v1.toString());
    }
    @Test
    public void testEquals(){
        Vehicle v1 = new Vehicle("Dacia", "Logan", 150, 'B');
        Vehicle v2 = new Vehicle("Dacia", "Logan", 150, 'B');
        assertEquals(true, v1.equals(v2));
    }
    @Test
    public void testeGetModel(){
        Vehicle v=new Vehicle("Audi", "rs7", 250, 'B');
        assertEquals("Audi", v.getModel());
    }
}
