package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {
    @Test
    public void testPizzaOrderWithAllIngredientsGetPrice() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheese(theOrder);
        theOrder = new Ham(theOrder);
        theOrder = new Mushrooms(theOrder);
        theOrder = new Onion(theOrder);
        System.out.println(theOrder.getPrice());
        //When
        BigDecimal thePrice = theOrder.getPrice();
        //Then
        assertEquals(new BigDecimal(26), thePrice);
    }
    @Test
    public void testPizzaOrderWithAllIngredientsGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheese(theOrder);
        theOrder = new Ham(theOrder);
        theOrder = new Mushrooms(theOrder);
        theOrder = new Onion(theOrder);
        System.out.println(theOrder.getDescription());
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Pizza with cheese and tomato sauce + extra cheese + ham + mushrooms + onion", description);
    }
}
