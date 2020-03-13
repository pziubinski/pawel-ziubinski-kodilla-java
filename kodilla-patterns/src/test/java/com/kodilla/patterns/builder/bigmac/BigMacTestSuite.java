package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigMacTestSuite {
    @Test
    public void testBigmacNew() {
        //Given
        BigMac bigmac = new BigMac.BigmacBuilder()
                .bun("")
                .burgers(2)
                .sauce(SauceSelection.BARBECUE)
                .ingredients(IngredientsSelection.CHEESE)
                .ingredients(IngredientsSelection.BACON)
                .ingredients(IngredientsSelection.ONIONS)
                .build();
        System.out.println(bigmac);

        //When
        int howManyIngredients = bigmac.getIngredients().size();
        int howManyBurgers = bigmac.getBurgers();

        //Then
        Assert.assertEquals(3, howManyIngredients);
        Assert.assertEquals(2, howManyBurgers);
    }
}
