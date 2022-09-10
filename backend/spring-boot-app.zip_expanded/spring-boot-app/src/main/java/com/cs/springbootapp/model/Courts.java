package com.cs.springbootapp.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Courts {
    private String sportName;
    private Turf turf;
    private TimeSlots timeslot;
}