package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.List;

public final class World {
    private final List<Continent> continentsList;

    public World(final List<Continent> continentsList) {
        this.continentsList = continentsList;
    }

    public List<Continent> getContinentsList() {
        return continentsList;
    }
    public BigDecimal getPeopleQuantity() {
        BigDecimal population = continentsList.stream()
                .flatMap(continentsList -> continentsList.getCountriesList().stream())
                .map(country -> country.getPeopleQuantity())
                .reduce(BigDecimal.ZERO, (sum, current)-> sum = sum.add(current));
        return population;
    }
}
