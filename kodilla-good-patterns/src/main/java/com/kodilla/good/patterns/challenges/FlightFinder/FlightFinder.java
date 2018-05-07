package com.kodilla.good.patterns.challenges.FlightFinder;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightFinder {

    private final List<Flight> flights = new ArrayList<>();

    public FlightFinder() {
        this.flights.add(new Flight("Warszawa", "Amsterdam"));
        this.flights.add(new Flight("Warszawa", "Barcelona"));
        this.flights.add(new Flight("Warszawa", "Londyn"));
        this.flights.add(new Flight("Warszawa", "Nowy York"));
        this.flights.add(new Flight("Nowy York", "Chicago"));
    }
}
