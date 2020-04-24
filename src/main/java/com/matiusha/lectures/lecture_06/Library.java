package com.matiusha.lectures.lecture_06;

public class Library {
    public static void main(String[] args) {
        Author ws = new Author("William", "Shakespeare");
        Author reqAuthor = new Author("William", "Shakespeare");
        System.out.println(ws.equals(reqAuthor));

        Book b = new Book("1","Hamlet",ws,"1960","description","123");
        Book b2 = new Book("3","Hamlet",ws,"1960","description","123");
        Book b1 = new Book("2","Romeo and Juliette",ws,"1595","description","123");
        System.out.println(b.equals(b2));

        System.out.println(b);
        System.out.println(b1.equals(b));

    }

}
