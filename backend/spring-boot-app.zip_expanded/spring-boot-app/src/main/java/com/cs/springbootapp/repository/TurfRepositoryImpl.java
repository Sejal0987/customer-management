package com.cs.springbootapp.repository;
s
import java.util.*;
import org.springframework.stereotype.Repository;

import com.cs.springbootapp.model.Turf;

@Repository
public class TurfRepositoryImpl implements TurfRepository {
    
   
       
        Turf turf1 = new Turf("turf1","Kharadi",null, new ArrayList<>(Arrays.asList("Football","Cricket", "Badminton")));
        Turf turf3 = new Turf("turf3","",null, new ArrayList<>(Arrays.asList("Football","Cricket", "Badminton")));
        Turf turf2 = new Turf("turf2","Kharadi",null, new ArrayList<>(Arrays.asList("Football","Cricket", "Badminton")));
    

    @Override
    public List<Turf> getAllTurfs(String sportName) {
        // TODO Auto-generated method stu
        return null;
    }}