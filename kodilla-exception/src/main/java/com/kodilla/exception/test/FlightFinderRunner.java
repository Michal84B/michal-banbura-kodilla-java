package com.kodilla.exception.test;

public class FlightFinderRunner {
    public static void main(String[] args){
        FlightFinder flightFinder = new FlightFinder();
        Flight flight = new Flight("Warszawa", "Londyn");

        try {
            flightFinder.findFlight(flight);
        } catch(RouteNotFoundException e) {
            System.out.println("Airport not found, try another airport.");
        }
    }
}
