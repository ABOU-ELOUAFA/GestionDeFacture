package mpack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExpressDeliveryTest {

    @Test
    public void getPrice1() {
        Delivery delivery=new ExpressDelivery("Paris");
        assertEquals(6.99,delivery.getPrice(),0.01);
    }
    @Test
    public void getPrice2(){
        Delivery delivery1=new ExpressDelivery("Metz");
        assertEquals(9.99,delivery1.getPrice(),0.01);
    }
}