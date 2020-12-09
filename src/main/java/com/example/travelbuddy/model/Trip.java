package com.example.travelbuddy.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotBlank;
import java.util.Date;
import java.util.UUID;

public class Trip {

    private final UUID id;

    @NotBlank
    private final UUID host;

    @NotBlank
    private final String description;

    @NotBlank
    private final double longitude;

    @NotBlank
    private final double latitude;

    @NotBlank
    private final Date start;

    @NotBlank
    private final Date end;

    @NotBlank
    private final int budget;

    @NotBlank
    private final String currency;

    public Trip(@JsonProperty("id") UUID id, @JsonProperty("host") UUID host, @NotBlank String description, @NotBlank double longitude,
                @NotBlank double latitude, @JsonFormat(pattern="yyyy-MM-dd") @NotBlank Date start, @JsonFormat(pattern="yyyy-MM-dd") @NotBlank Date end, @NotBlank int budget, @NotBlank String currency) {
        this.id = id;
        this.host = host;
        this.description = description;
        this.longitude = longitude;
        this.latitude = latitude;
        this.start = start;
        this.end = end;
        this.budget = budget;
        this.currency = currency;
    }

    public UUID getId() {
        return id;
    }

    public String getDescription() { return description; }

    public double getLongitude() { return longitude; }

    public double getLatitude() { return latitude; }

    public Date getStart() { return start; }

    public Date getEnd() { return end; }

    public int getBudget() { return budget; }

    public String getCurrency() { return currency; }

    public UUID getHost() { return host; }

}
