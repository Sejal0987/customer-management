package com.cs.springbootapp.service;
import com.cs.springbootapp.model.Turf;
import com.cs.springbootapp.repository.TurfRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class TurfServiceImpl implements TurfService{

    @Autowired
    private TurfRepository turfrepo;

	@Override
	public Turf getTurf(int id) {
        return turfrepo.getTurf(id);
	}

	@Override
	public Turf saveTurf(Turf turf) {
		return turfrepo.saveTurf(turf);
	}

	@Override
	public boolean deleteTurf(int id) {
		return turfrepo.deleteTurf(id);
	}

	@Override
	public List<Turf> getAllTurfs() {
		return turfrepo.getAllTurfs();
	}

}