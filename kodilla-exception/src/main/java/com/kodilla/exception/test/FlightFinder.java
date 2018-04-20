package com.kodilla.exception.test;

import java.util.HashMap;

public class FlightFinder {
    private HashMap<String, Boolean> airports = new HashMap<>();

    public FlightFinder(HashMap<String, Boolean> airports) {
        this.airports = airports;

        airports.put("Amsterdam", true);
        airports.put("Barcelona", true);
        airports.put("Dublin", false);
        airports.put("Londyn", false);
        airports.put("Nicea", true);
    }
    Boolean findFlight(Flight flight){
        return airports.get(flight.getArrivalAirport());
    }
}
