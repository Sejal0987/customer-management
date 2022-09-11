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
        Boolean arr[] = {true,true,true,true,true,true,true,true,true};
        Boolean arr1[]={true,false,false,false,true,false,false,true,true};
        Boolean arr2[]={true,false,true,false,true,false,true,true,true};
        Turf t1 = new Turf(501,"Four Lions Academy and Turf","New airport road Near dorabjee mall, behind elite tennis academy, Viman Nagar, Pune, Maharashtra 411032",arr);
        Turf t2 = new Turf(502,"Mundhwa Turf Ground","BG Shirke Rd, Somnath Nagar, Kirtane Baug, Mundhwa Industrial Area, Mundhwa, Pune, Maharashtra 411036",arr1);
        Turf t3 = new Turf(503,"TurfUp","Sr No.38/C NIBM Annex Opp Raheja Vista Phase 3, Cloud 9 Road, Pune, Maharashtra 411048",arr2);
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
    @Override
    public Map<Integer,Turf> updateAllTurfs(List<Turf>turfs){
      turf_db.clear();

          return turf_db;
    }

}
