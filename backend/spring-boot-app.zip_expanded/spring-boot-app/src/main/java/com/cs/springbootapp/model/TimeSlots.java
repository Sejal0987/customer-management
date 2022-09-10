package com.cs.springbootapp.model;

import java.util.HashMap;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class TimeSlots {
    private HashMap<String, Boolean> timers = new HashMap<String, Boolean>();
    TimeSlots(String time, Boolean isAvailable){
        this.timers.put(time, isAvailable);
    }
    
}
