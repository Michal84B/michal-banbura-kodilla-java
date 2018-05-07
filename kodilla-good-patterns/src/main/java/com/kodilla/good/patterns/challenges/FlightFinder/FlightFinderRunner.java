package com.kodilla.good.patterns.challenges.FlightFinder;

public class FlightFinderRunner {

    public static void main(String[] args) {

        FlightFinder flightFinder = new FlightFinder();

        System.out.println("Flights from Warszawa " + flightFinder.findFlightFrom("Warszawa"));
        System.out.println("Flights to Londyn " + flightFinder.findFlightTo("Londyn"));
        System.out.println("Flights from Warszawa to Chicago "
                + flightFinder.findFlightVia("Warszawa", "Nowy York", "Chicago"));
    }
}
