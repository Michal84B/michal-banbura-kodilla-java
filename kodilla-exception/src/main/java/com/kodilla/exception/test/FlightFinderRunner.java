package com.kodilla.exception.test;

public class FlightFinderRunner {
    public static void main(String[] args){
        FlightFinder flightFinder = new FlightFinder();

        try {
            flightFinder.getFlight("Londyn");
        } catch(RouteNotFoundException e) {
            System.out.println("Airport not found, try another airport");
        }
    }
}
