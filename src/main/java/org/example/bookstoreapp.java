package org.example;

public class bookstoreapp {
    public static void main (String[] args){
        Book book1 = new Book ();
        book1.title = "The Book";
        book1.author = "Rahul";
        book1.pubdate = 1980;
        book1.price = 20.12;

        Book book2 = new Book ();
        book2.title = "The second book";
        book2.author = "Soumik";
        book2.pubdate = 1950;
        book2.price = 30.20;

        book1.displayinfo();
        book2.displayinfo();



    }

}
