package com.cs.springbootapp.repository;

import java.util.List;

import com.cs.springbootapp.model.Turf;

public interface TurfRepository {
    public Turf getTurf(int id);
    public Turf saveTurf(Turf turf);
    public boolean deleteTurf(int id);
    public List<Turf> getAllTurfs();
}
