package com.cs.springbootapp.model;
import org.springframework.web.servlet.FlashMapManager;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    private Turf turfSelected;
    private Customer customerSelected;

    Book toBook(Turf turfSelected, Customer customerSelected){
        if(turfSelected.getTimeSlotsOfSport()[0]==true)
            turfSelected.getTimeSlotsOfSport()[0]=false;
        
        return new Book(turfSelected, customerSelected);
        
    }
}
