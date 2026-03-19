package isp.lab3.exercise4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyPointTest {
    @Test
    public void testToString(){
        MyPoint p=new MyPoint(3,5,9);
        assertEquals("(3,5,9)", p.toString());
    }
    @Test
    public void testDistance(){
        MyPoint p=new MyPoint(0,0,0);
        assertEquals(Math.sqrt(115), p.Distance(3,5,9), 0.01);
    }

}
