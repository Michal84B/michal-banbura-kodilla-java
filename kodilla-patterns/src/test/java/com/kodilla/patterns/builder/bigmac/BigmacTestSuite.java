package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmacBuilder() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("with sesame")
                .burgers(1)
                .sauce("bbq")
                .ingredient("onion")
                .ingredient("bacon")
                .ingredient("tomato")
                .ingredient("cheese")
                .build();
        System.out.println(bigmac);

        //When
        int howManyIngredients = bigmac.getIngredients().size();
        String whatSauce = bigmac.getSauce();

        //Then
        Assert.assertEquals(4, howManyIngredients);
        Assert.assertEquals("bbq", whatSauce);
    }
}
