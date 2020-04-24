package com.matiusha.lectures.lecture_07;

import com.matiusha.lectures.lecture_06.Author;

public class LectureApp07 {
    public static void main(String[] args) {
        Author a = new Author("Роджер", "Желязный");

//        BookCatalog catalog= new BookCatalog();
//        System.out.println(catalog.getAllBooksAuthor(a));

//        BookCatalog fileBookCatalog= new FileBookCatalog();
//        System.out.println(fileBookCatalog.getAllBooksAuthor(a));

        BookCatalog catalog= getCatalog(System.getenv("bookSource"));
       System.out.println(catalog.getAllBooksAuthor(a));

//       FileBookCatalog fcatalog = new FileBookCatalog();
//       fcatalog.addBook();

    }
    private static BookCatalog getCatalog(String type){
        switch (type) {
            case "Memory":
                return new BookCatalog();
            case "File":
                return new FileBookCatalog();
            case "DB":
                return new DataBaseCatalog();
            default:
                return null;
        }

    }

}
