package com.example.travelbuddy.api;

import com.example.travelbuddy.model.Trip;
import com.example.travelbuddy.service.TripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

@RequestMapping("api/v1/trip")
@RestController
public class TripController {

    private final TripService tripService;

    @Autowired
    public TripController(TripService tripService) {
        this.tripService = tripService;
    }

    @PostMapping
    public void addTrip(@Valid @NonNull @RequestBody Trip trip) {
        tripService.addTrip(trip);
    }

    @GetMapping
    public List<Trip> getAllTrips() {
        return tripService.getAllTrips();
    }

    @GetMapping(path = "{id}")
    public Trip getTripById(@PathVariable("id") UUID id) {
        return tripService.getTripById(id).orElse(null);
    }

    @DeleteMapping(path = "{id}")
    public void deleteTripByID(@PathVariable("id") UUID id) {
        tripService.deleteTrip(id);
    }

    @PutMapping(path = "{id}")
    public void updateTrip(@PathVariable("id") UUID id, @Valid @NonNull @RequestBody Trip tripToUpdate) {
        tripService.updateTrip(id, tripToUpdate);
    }

}
