package org.example;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class User extends Person {
    private List<Book> booksLoaned = new ArrayList<>();

    public User(String name, String gender,List<Book> booksLoaned) {
        super(name, gender);
        this.booksLoaned = booksLoaned;
    }

    public List<Book> getBooksLoaned() {
        return booksLoaned;
    }

    public void setBooksLoaned(List<Book> booksLoaned) {
        this.booksLoaned = booksLoaned;
    }


    public void loanBook(){
        System.out.println("You`re in loaning menu :  ");
        System.out.println("   Please enter book`s title ");

        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();

    }

public void userMenu(){
    Scanner UserInput  = new Scanner(System.in);
    String option = UserInput.next();


    }

}
