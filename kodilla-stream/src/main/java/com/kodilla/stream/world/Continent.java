package com.kodilla.stream.world;

import java.util.List;

public final class Continent {
    private final String continentName;
    private final List<Country> countriesList;

    public Continent(final String continentName, final List<Country> countriesList) {
        this.continentName = continentName;
        this.countriesList = countriesList;
    }

    public String getContinentName() {
        return continentName;
    }

    public List<Country> getCountriesList() {
        return countriesList;
    }
}
