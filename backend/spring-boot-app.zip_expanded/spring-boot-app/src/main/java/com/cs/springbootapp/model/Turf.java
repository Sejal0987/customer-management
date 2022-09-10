package com.cs.springbootapp.model;

import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Turf {

    private String t_name;
    private String t_location;
    private ArrayList<Courts> courts = new ArrayList<Courts>();
    private ArrayList<String> sports = new ArrayList<String>();


}
