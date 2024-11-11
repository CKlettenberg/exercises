package DayFive.objectcreation;

import java.sql.SQLOutput;

public class Book {
    public static void main(String[] args) {
        Bookinfo bookinfo = new Bookinfo();
        System.out.println("Book info : ");
        System.out.println("Title: " + bookinfo.title);
        System.out.println("Author: " + bookinfo.author);
        System.out.println("Year: " + bookinfo.yearPublished);


        Bookinfo bookInOtherClass = new Bookinfo("UDUPEA", "PEETER UDUPEA", 2050);
        System.out.println(" ");

        System.out.println("PEALKIRI :  \" " + bookInOtherClass.title + " \" ");
        System.out.println("AUTOR: " + bookInOtherClass.author);
        System.out.println("AASTA: " + bookInOtherClass.yearPublished);

    }
}
