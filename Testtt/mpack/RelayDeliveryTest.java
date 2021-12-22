package mpack;

import main.java.mpack.Delivery;
import main.java.mpack.RelayDelivery;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RelayDeliveryTest {

    @Test
    public void getPrice1 () {
        Delivery delivery=new RelayDelivery(5);
        assertEquals(0.0,delivery.getPrice(),0.01);

    }
    @Test
    public void getPrice2 (){
        Delivery delivery1=new RelayDelivery(27);
        assertEquals(2.99,delivery1.getPrice(),0.01);
    }
    @Test
    public void getPrice3(){
        Delivery delivery2=new RelayDelivery(52);
        assertEquals(4.99,delivery2.getPrice(),0.01);
    }
}