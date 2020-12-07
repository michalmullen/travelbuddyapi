package com.example.travelbuddy.dao;

import com.example.travelbuddy.model.Trip;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface TripDao {

    int insertTrip(UUID id, Trip trip);

    default int insertTrip(Trip trip) {
        UUID id = UUID.randomUUID();
        return insertTrip(id, trip);
    }

    List<Trip> selectAllTrips();

    Optional<Trip> selectTripById(UUID id);

    int deleteTripById(UUID id);

    int updateTripById(UUID id, Trip trip);
}
