package com.cs.springbootapp.repository;

import com.cs.springbootapp.model.Book;
import com.cs.springbootapp.model.Customer;
import com.cs.springbootapp.model.Turf;

public interface BookRepository {
    Book toBook(Turf turfSelected, Customer customerSelected);
}
