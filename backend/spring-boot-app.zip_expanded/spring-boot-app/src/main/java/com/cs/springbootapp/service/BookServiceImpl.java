package com.cs.springbootapp.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cs.springbootapp.model.Book;
import com.cs.springbootapp.model.Customer;
import com.cs.springbootapp.model.Turf;
import com.cs.springbootapp.repository.BookRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class BookServiceImpl implements BookService{
    @Autowired
    private BookRepository bookrepo;
    @Override
    public Book toBook(Turf turfSelected, Customer customerSelected) {
       
        return bookrepo.toBook(turfSelected, customerSelected);
    }
    
}
