package com.example.travelbuddy.dao;

import com.example.travelbuddy.model.Trip;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface TripDao {

    int insertPerson(UUID id, Trip trip);

    default int insertPerson(Trip trip) {
        UUID id = UUID.randomUUID();
        return insertPerson(id, trip);
    }

    List<Trip> selectAllTrips();

    Optional<Trip> selectTripById(UUID id);

    int deleteTripById(UUID id);

    int updateTripById(UUID id, Trip trip);
}
