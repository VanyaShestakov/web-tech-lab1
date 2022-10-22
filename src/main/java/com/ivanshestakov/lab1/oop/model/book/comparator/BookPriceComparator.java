package com.ivanshestakov.lab1.oop.model.book.comparator;

import com.ivanshestakov.lab1.oop.model.book.Book;

import java.util.Comparator;

public class BookPriceComparator implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        return Integer.compare(o1.getPrice(), o2.getPrice());
    }

}
