package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){
        //Given
        List<Country> europeCounties = new ArrayList<>();
        Country poland = new Country("poland", new BigDecimal("123456789"));
        Country spain = new Country("spain", new BigDecimal("456789123"));
        Country croatia = new Country("croatia", new BigDecimal("789654321"));
        europeCounties.add(poland);
        europeCounties.add(spain);
        europeCounties.add(croatia);

        List<Country> asiaCountries = new ArrayList<>();
        Country japan = new Country("japan", new BigDecimal("321654987"));
        Country china = new Country("china", new BigDecimal("987654987"));
        asiaCountries.add(japan);
        asiaCountries.add(china);

        List<Continent> continents = new ArrayList<>();
        Continent europe = new Continent("europe", europeCounties);
        Continent asia = new Continent("asia", asiaCountries);
        continents.add(europe);
        continents.add(asia);

        //When
        World population = new World(continents);
        BigDecimal result = new BigDecimal("2679210207");

        //Then
        Assert.assertEquals(population.getPeopleQuantity(), result);
    }

}
