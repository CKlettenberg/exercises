package DayFive.objectcreation;

public class Bookinfo {
    //PROPERTIES OF THE BOOK CLASS
    String title;
    String author;
    int yearPublished;

    public Bookinfo() {
        //DEFAULT
        title = "unknown title";
        author = "unknown author";
        yearPublished = 1900;
    }

    public Bookinfo(String title, String author, int yearPublished) {
        //PARAMETRIZED
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;

    }
}



