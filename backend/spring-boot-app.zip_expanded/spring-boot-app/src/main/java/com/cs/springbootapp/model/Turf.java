package com.cs.springbootapp.model;


import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import nonapi.io.github.classgraph.json.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Turf {
    @JsonProperty("turf_id")@Id
    private int turf_id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("location")
    private String location;
    @JsonProperty("timeSlotsOfSport")
    private Boolean []timeSlotsOfSport;


}
