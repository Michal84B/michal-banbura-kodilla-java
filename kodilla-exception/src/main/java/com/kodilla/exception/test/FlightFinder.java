package com.kodilla.exception.test;

import java.util.HashMap;

public class FlightFinder {
    private HashMap<String, Boolean> airports = new HashMap<>();

    public FlightFinder() {

        airports.put("Amsterdam", true);
        airports.put("Barcelona", true);
        airports.put("Dublin", false);
        airports.put("Londyn", false);
        airports.put("Nicea", true);
    }

    Boolean findFlight(Flight flight){
        return airports.get(flight.getArrivalAirport());
    }

    public Boolean getFlight(String key) throws RouteNotFoundException {
        if(airports.containsKey(key)) {
            return airports.get(key);
        }
        else {
            throw new RouteNotFoundException("Airport not found");
        }
    }
}
