package com.matiusha.lectures.lecture_07;

import com.matiusha.lectures.lecture_06.Author;
import com.matiusha.lectures.lecture_06.Book;

import java.util.ArrayList;
import java.util.List;

public class BookCatalog {
    private ArrayList<Book> books;

    public BookCatalog(){
        books = new ArrayList<>();
    }
    public List<Book> getAllBooksAuthor(Author author){
        List<Book> result = new ArrayList<>();
        for (Book b:books) {
            if (b.getAuthor().equals(author)){
                result.add(b);
            }
        }
        return books;
    }
//    public void addBook(Book b){
//        books.add(b);
//    }
    public List<Book>getAll(){
        return books;
    }
}
