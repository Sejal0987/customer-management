package com.cs.springbootapp.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.cs.springbootapp.model.*;
import com.cs.springbootapp.service.TurfService;



@RestController
@CrossOrigin(origins ={"http://localhost:4200/turf/501","http://localhost:4200"} )

public class TurfController{

    @Autowired
    private TurfService turfService;

    @GetMapping("/turf/id")
    public Turf getTurf(@PathVariable int id){

        return turfService.getTurf(id);
    }

     @GetMapping("/turf/")
    public List<Turf> getAllTurfs(){
        return turfService.getAllTurfs();
    }

     @PostMapping("/turf/")
    public Turf getTurf(@RequestBody Turf turf){
        return turfService.saveTurf(turf);
    }

    @DeleteMapping("/turf/id")
    public boolean deleteTurf(@PathVariable int id){
        return turfService.deleteTurf(id);
    }

    @PostMapping("/turfs/")
    public Map<Integer,Turf> updateAllTurfs(@RequestBody List<Turf>turfs){
      return turfService.updateAllTurfs(turfs);
    }

    @PutMapping("/turf/{turf_id}")
    public void updateTurf(@RequestBody int time, @RequestParam int turf_id){
       Turf newturf= turfService.getTurf(turf_id);
       newturf.getTimeSlotsOfSport()[time]=false;
       turfService.saveTurf(newturf);

    }



}
