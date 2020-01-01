package com.kodilla.stream.world;

import com.kodilla.stream.sand.Africa;
import com.kodilla.stream.sand.Asia;
import com.kodilla.stream.sand.Europe;
import com.kodilla.stream.sand.SandStorage;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        Country poland = new Country("Poland", new BigDecimal("38000000"));
        Country germany = new Country("Germany", new BigDecimal("78000000"));
        Country spain = new Country("Spain", new BigDecimal("50000000"));
        Continent europe = new Continent("Europe");
        europe.addCountry(poland);
        europe.addCountry(germany);
        europe.addCountry(spain);

        //When
        BigDecimal totalInEurope = BigDecimal.ZERO;
        World w = new World();
        w.addContinent(europe);
        totalInEurope = w.getPeopleQuantity();

        //Then
        BigDecimal expectedInEurope = new BigDecimal("166000000");
        Assert.assertEquals(expectedInEurope, totalInEurope);
    }

}
