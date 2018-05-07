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

    public List<Flight> findFlightTo(String to) {
        return flights.stream()
                .filter(f -> f.getArrivalAirport().equals(to))
                .collect(Collectors.toList());
    }

    public List<Flight> findFlightFrom(String from) {
        return flights.stream()
                .filter(f -> f.getDepartureAirport().equals(from))
                .collect(Collectors.toList());
    }

    public List<Flight> findFlightVia(String from, String via, String to) {

        List<Flight> fromList = flights.stream()
                .filter(f -> f.getDepartureAirport().equals(from))
                .filter(f -> f.getArrivalAirport().equals(via))
                .collect(Collectors.toList());

        List<Flight> toList = flights.stream()
                .filter(f -> f.getDepartureAirport().equals(via))
                .filter(f -> f.getArrivalAirport().equals(to))
                .collect(Collectors.toList());
        fromList.addAll(toList);
        return fromList;

    }
}
