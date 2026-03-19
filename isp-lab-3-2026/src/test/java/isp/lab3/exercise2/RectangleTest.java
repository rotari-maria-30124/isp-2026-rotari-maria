package isp.lab3.exercise2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectangleTest {
    @Test
    public void RectangleTest(){
        Rectangle rectangle=new Rectangle();
        assertEquals(2, rectangle.getLength());
        assertEquals(1, rectangle.getWidth());
    }
    @Test
    public void testGetArea(){
        Rectangle r=new Rectangle(4,5);
        assertEquals(20, r.getArea());
    }
    @Test
    public void testGetPerimeter(){
        Rectangle r=new Rectangle(4,5);
        assertEquals(18, r.getPerimeter());
    }
}
