package isp.lab5.exercise2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise2Test {
    @Test
    public void testEx2(){
        SmartPhone smartPhone=new SmartPhone(38);
        SmartWatch smartWatch=new SmartWatch(68);
        Laptop laptop=new Laptop(92);
        smartPhone.charge(50);
        smartWatch.charge(20);
        laptop.charge(5);
        assertEquals(88, smartPhone.getBatteryLevel());
        assertEquals(88, smartWatch.getBatteryLevel());
        assertEquals(97, laptop.getBatteryLevel());
    }
}
