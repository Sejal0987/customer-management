package com.cs.springbootapp.controller;


import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.cs.springbootapp.model.*;
import com.cs.springbootapp.service.BookService;
import com.cs.springbootapp.service.TurfService;

import lombok.extern.slf4j.Slf4j;


@RestController
@Slf4j
@CrossOrigin(origins = "http://localhost:4200")

public class BookController {
    @Autowired
    BookService service;

    @PostMapping("/books")
	public Book toBook(@RequestBody Turf turfSelected, Customer customerSelected) {
		return service.toBook( turfSelected, customerSelected);

        
	}



   
	
}
