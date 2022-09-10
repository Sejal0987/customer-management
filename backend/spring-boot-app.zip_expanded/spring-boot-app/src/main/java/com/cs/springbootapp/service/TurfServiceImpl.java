package com.cs.springbootapp.service;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cs.springbootapp.model.*;
import com.cs.springbootapp.repository.TurfRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class TurfServiceImpl implements TurfService {
	
	@Autowired
	private TurfRepository repo;
	
	@PostConstruct
	public void init() {
		log.info("Service Instance Created");
	}

	@Override
	public List<Turf> getAllTurfs(String sportName) {
		return repo.getAllTurfs(sportName);
	}

}
