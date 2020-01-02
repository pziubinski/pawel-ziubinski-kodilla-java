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
        Continent europe = new Continent("Europe");
        europe.addCountry(new Country("Poland", new BigDecimal("38000000")));
        europe.addCountry(new Country("Germany", new BigDecimal("78000000")));
        europe.addCountry(new Country("Spain", new BigDecimal("50000000")));

        Continent asia = new Continent("Asia");
        asia.addCountry(new Country("China", new BigDecimal("1300000000")));
        asia.addCountry(new Country("India", new BigDecimal("1100000000")));
        asia.addCountry(new Country("Indonesia", new BigDecimal("230000000")));

        //When
        World w = new World();
        w.addContinent(europe);
        w.addContinent(asia);
        BigDecimal totalInEurope = w.getPeopleQuantity();

        //Then
        BigDecimal expectedInEurope = new BigDecimal("2796000000");
        Assert.assertEquals(expectedInEurope, totalInEurope);
    }

}
