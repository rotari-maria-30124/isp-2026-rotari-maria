package isp.lab3.exercise1;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TreeTest {
    @Test
    public void TreeTest(){
        Tree tree=new Tree();
        assertEquals(15, tree.getHeight());
    }
    @Test
    public void testGrow(){
        Tree tree=new Tree();
        tree.grow(5);
        assertEquals(20, tree.getHeight());
    }
    @Test
    public void testGrow1(){
        Tree tree=new Tree();
        tree.grow();
        assertEquals(16, tree.getHeight());
    }
}
