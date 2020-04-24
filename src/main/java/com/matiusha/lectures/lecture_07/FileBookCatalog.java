package com.matiusha.lectures.lecture_07;

import com.matiusha.lectures.lecture_06.Author;
import com.matiusha.lectures.lecture_06.Book;

import java.util.ArrayList;
import java.util.List;

public class FileBookCatalog extends BookCatalog {

    @Override
    public List<Book> getAllBooksAuthor(Author author) {
        List<Book> books = new ArrayList<>();
        Author a = new Author("Роджер", "Желязный");

        books.add(new Book(a, "Хроники Амбера т1"));
        books.add(new Book(a, "Хроники Амбера т2"));
        books.add(new Book(a, "Хроники Амбера т3"));
        books.add(new Book(a, "Хроники Амбера т4"));
        books.add(new Book(a, "Хроники Амбера т5"));

        List<Book> result = new ArrayList<>();
        for (Book b:books) {
            if (b.getAuthor().equals(author)){
                result.add(b);
            }
        }
        return books;
    }
    public void addBook(Book b){

    }
}
