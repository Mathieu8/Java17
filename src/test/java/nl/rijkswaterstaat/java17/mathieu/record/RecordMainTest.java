package nl.rijkswaterstaat.java17.mathieu.record;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RecordMainTest {

    @Test
    void record(){
        Costomer costomer = new Costomer(1L, "test", "Darth@vader.empire");
        Product product1 = new Product(1L ,"Lightsaber", "delightfully evil");
        Product product2 = new Product(2L, "Deathstar", "obvious not evil");
        Product product3 = new Product(3L, "breathing mask");

        OrderLine orderLine1 = new OrderLine(product1, 1L, new BigDecimal(100.00));
        OrderLine orderLine2 = new OrderLine(product2, 2L, new BigDecimal(10000000000000.99));
        OrderLine orderLine3 = new OrderLine(product3,1L,new BigDecimal(1.0));

        Order order = new Order(1l, costomer, LocalDateTime.now(), List.of(orderLine1,orderLine2, orderLine3));

//        order.lines().add(orderLine1);//
        assertEquals(3, order.lines().size());
    }
}