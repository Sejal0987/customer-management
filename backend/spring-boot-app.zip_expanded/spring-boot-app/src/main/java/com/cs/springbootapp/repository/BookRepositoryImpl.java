package com.cs.springbootapp.repository;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import com.cs.springbootapp.model.Book;
import com.cs.springbootapp.model.Customer;
import com.cs.springbootapp.model.Turf;
@Repository
public class BookRepositoryImpl implements BookRepository {

    private Map<Integer,Book> book_db; 
    @PostConstruct
	public void init(){
        book_db=new HashMap<>();
    }
    

    @Override
    public Book toBook(Turf turfSelected, Customer customerSelected) {
        Book book_obj = new Book(turfSelected, customerSelected);
        book_db.put(turfSelected.getTurf_id(),book_obj);
        return book_obj;
        
    }
    
}
