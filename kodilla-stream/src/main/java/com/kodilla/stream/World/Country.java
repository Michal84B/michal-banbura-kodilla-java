package com.kodilla.stream.World;

import java.math.BigDecimal;
import java.util.Objects;

public final class Country {
    private final String country;
    private final BigDecimal peopleQuantity;

    public Country(String country, BigDecimal peopleQuantity) {
        this.country = country;
        this.peopleQuantity = peopleQuantity;
    }

    public String getCountry() {
        return country;
    }

    public BigDecimal getPeopleQuantity() {
        return peopleQuantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country1 = (Country) o;
        return Objects.equals(country, country1.country);
    }

    @Override
    public int hashCode() {

        return Objects.hash(country);
    }
}