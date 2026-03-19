package isp.lab3.exercise5;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VendingMachineTest {
    @Test
    public void testInsertCoin(){
        VendingMachine v= new VendingMachine();
        v.insertCoin(15);
        assertEquals(15, v.getCredit());
    }
    public void testSelectProduct(){
        VendingMachine v= new VendingMachine();
        v.insertCoin(15);
        String product=v.selectProduct(3);
        assertEquals("Protein Bar", product);
        assertEquals(9, v.getCredit());
    }
}
