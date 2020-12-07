package com.example.travelbuddy.dao;

import com.example.travelbuddy.model.Trip;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;


public class TripDataAccessService implements TripDao {

    @Override
    public int insertPerson(UUID id, Trip trip) {
        return 0;
    }

    @Override
    public List<Trip> selectAllTrips() {
        return null;
    }

    @Override
    public Optional<Trip> selectTripById(UUID id) {
        return Optional.empty();
    }

    @Override
    public int deleteTripById(UUID id) {
        return 0;
    }

    @Override
    public int updateTripById(UUID id, Trip trip) {
        return 0;
    }
}
