/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TripMenu;

import java.util.*;

/**
 *
 * @author james
 */
public class Trips {

    private static List<Trip> trips = new ArrayList<>();

    public void addTrip(Trip trip) {
        this.trips.add(trip);
    }

    public List<Trip> getTrip() {
        return this.trips;
    }

    public void removeTrip(Trip trip) {
        if (trips.contains(trip)) {
            trips.remove(trip);
        }
    }

}
