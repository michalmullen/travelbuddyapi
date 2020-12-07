package com.example.travelbuddy.service;

import com.example.travelbuddy.dao.TripDao;
import com.example.travelbuddy.model.Trip;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class TripService {

    private final TripDao tripDao;

    @Autowired
    public TripService(@Qualifier("postgresTrip") TripDao tripDao) {
        this.tripDao = tripDao;
    }

    public int addTrip(Trip trip) {
        return tripDao.insertTrip(trip);
    }

    public List<Trip> getAllTrips() {
        return tripDao.selectAllTrips();
    }

    public Optional<Trip> getTripById(UUID id) {
        return tripDao.selectTripById(id);
    }

    public int deletePerson(UUID id) {
        return tripDao.deleteTripById(id);
    }

    public int updatePerson(UUID id, Trip newTrip) {
        return tripDao.updateTripById(id, newTrip);
    }
}

