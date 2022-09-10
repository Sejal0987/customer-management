package com.cs.springbootapp.service;

import com.cs.springbootapp.model.Book;
import com.cs.springbootapp.model.Customer;
import com.cs.springbootapp.model.Turf;

public interface BookService {
    public Book toBook(Turf turfSelected, Customer customerSelected);
}
