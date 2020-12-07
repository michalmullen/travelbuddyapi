package com.example.travelbuddy.dao;

import com.example.travelbuddy.model.Trip;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("postgresTrip")
public class TripDataAccessService implements TripDao {

    private final JdbcTemplate jdbcTemplate;

    public TripDataAccessService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int insertTrip(UUID id, Trip trip) {
        final String sql = "INSERT INTO trip (id, host, description, long, lat, start, end, budget, currency)" +
                " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql, id, trip.getHost(), trip.getDescription(), trip.getLongitude(),
                trip.getLatitude(), trip.getStart(), trip.getEnd(), trip.getBudget(), trip.getCurrency());
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
