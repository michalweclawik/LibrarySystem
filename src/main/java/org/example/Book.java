package org.example;

public class Book {
    private String Number;
    private String Title;
    private String Author;
    private String Genre;
    private String SubGenre;
    private String Publisher;

    private boolean loaned;

    public Book(String Number, String Title, String Author, String Genre, String SubGenre, String Publisher){
        this.Number = Number;
        this.Title = Title;
        this.Author = Author;
        this.Genre = Genre;
        this.SubGenre = SubGenre;
        this.Publisher = Publisher;
        this.loaned = false;
    }

    public Book(){}

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }

    public String getSubGenre() {
        return SubGenre;
    }

    public void setSubGenre(String subGenre) {
        SubGenre = subGenre;
    }

    public String getPublisher() {
        return Publisher;
    }

    public void setPublisher(String publisher) {
        Publisher = publisher;
    }

    public boolean isLoaned() {
        return loaned;
    }

    public void setLoaned(boolean loaned) {
        this.loaned = loaned;
    }

    @Override
    public String toString() {
        return "Book{" +
                "Number='" + Number + '\'' +
                ", Title='" + Title + '\'' +
                ", Author='" + Author + '\'' +
                ", Genre='" + Genre + '\'' +
                ", SubGenre='" + SubGenre + '\'' +
                ", Publisher='" + Publisher + '\'' +
                ", loaned=" + loaned +
                '}';
    }
}
