package com.cs.springbootapp.model;


import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Turf {
    private int turf_id;
    private String name;
    private String location;
    private Boolean []timeSlotsOfSport;


}
