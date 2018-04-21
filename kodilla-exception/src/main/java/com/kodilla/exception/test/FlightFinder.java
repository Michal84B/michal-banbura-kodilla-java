package com.kodilla.exception.test;

import java.util.HashMap;

public class FlightFinder {

    Boolean findFlight(Flight flight) throws RouteNotFoundException {
        HashMap<String, Boolean> airports = new HashMap<>();
        airports.put("Amsterdam", true);
        airports.put("Barcelona", true);
        airports.put("Dublin", false);
        airports.put("Londyn", false);
        airports.put("Nicea", true);

        if(airports.containsKey(flight.getArrivalAirport())) {
            return airports.get(flight);
        }
        else {
            throw new RouteNotFoundException("Airport not found");
        }
    }
}
