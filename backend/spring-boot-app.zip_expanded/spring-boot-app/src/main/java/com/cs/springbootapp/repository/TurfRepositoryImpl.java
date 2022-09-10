package com.cs.springbootapp.repository;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import java.util.Map;

import javax.annotation.PostConstruct;


import org.springframework.stereotype.Repository;

import com.cs.springbootapp.model.Turf;
@Repository
public class TurfRepositoryImpl implements TurfRepository{
    private Map<Integer,Turf> turf_db;
    
    @PostConstruct
	public void init() {
        turf_db=new HashMap<>();
        Boolean arr[] = {true,true,true,true,true,true,true,true,true,true};
        Turf t1 = new Turf(501,"TurfUp","Kharadi",arr);
        Turf t2 = new Turf(502,"TurfUp","Kharadi",arr);
        Turf t3 = new Turf(503,"TurfUp","Kharadi",arr);
        turf_db.put(t1.getTurf_id(), t1);
        turf_db.put(t2.getTurf_id(),t2);
        turf_db.put(t3.getTurf_id(),t3);
    }

    @Override
    public Turf getTurf(int id) {
      
        return turf_db.get(id);
    }

    @Override
    public Turf saveTurf(Turf turf) {
        
        return turf_db.put(turf.getTurf_id(), turf);
    }

    @Override
    public boolean deleteTurf(int id) {
       turf_db.remove(id);
        return !turf_db.containsKey(id);
    }

    @Override
    public List<Turf> getAllTurfs() {
       List<Turf> turfList = new ArrayList<>(turf_db.values());
        return turfList;
    }
    
}
