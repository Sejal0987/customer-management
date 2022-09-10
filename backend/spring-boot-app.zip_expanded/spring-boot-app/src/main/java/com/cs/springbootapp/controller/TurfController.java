package com.cs.springbootapp.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.cs.springbootapp.model.*;
import com.cs.springbootapp.service.TurfService;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class TurfController{

    @Autowired
    private TurfService turfService;

    @GetMapping("/turfs/{sportName}")
    public List<Turf> showTurfs(@PathVariable String sportName){

        return turfService.getAllTurfs(sportName);

    }

}