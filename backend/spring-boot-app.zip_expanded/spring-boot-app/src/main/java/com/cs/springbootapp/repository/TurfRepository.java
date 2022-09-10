package com.cs.springbootapp.repository;

import java.util.List;

import com.cs.springbootapp.model.*;

public interface TurfRepository {
	
	public List<Turf> getAllTurfs(String sportName);
	
}
