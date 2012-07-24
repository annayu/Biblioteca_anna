package com.twu28.biblioteca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: 123
 * Date: 12-7-21
 * Time: 下午1:59
 * To change this template use File | Settings | File Templates.
 */

//input/output messages for the user system
public class Message {

    public String getUserInput()
    {
        String input = null;
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            input = reader.readLine();
            if (input.length() == 0) return null;
        } catch (IOException e) {
            System.out.println("IOException: " + e);
        }
        return input;
    }

    public ArrayList<String> showWelcome()
    {
        ArrayList<String> welcomeDisplay = new ArrayList<String>();
        welcomeDisplay.add( "Welcome to Biblioteca!");
        return welcomeDisplay;
    }

    //display menu
    public ArrayList<String> showMenu()
    {
        ArrayList<String> menuDisplay = new ArrayList<String>();
        menuDisplay.add("MENU");
        menuDisplay.add( "A. View all books in the library.");
        menuDisplay.add( "B. Reserve a book for collection.");
        menuDisplay.add( "C. Check your library number.");
        menuDisplay.add( "D. View all movies in the library. ");
        menuDisplay.add( "Select an option by its index letter and press 'enter'.");
        return menuDisplay;
    }

    //display the menu option selected
    public ArrayList<String> showOptionSelected(char option)
    {
        ArrayList<String> optionDisplay = new ArrayList<String>();
        // A.View all books
        if( option == 'A')  optionDisplay = showBooks();
        // B.Reserve a book
        if( option == 'B')   {
            optionDisplay = showBooks();
            optionDisplay.add("Select a book by its number and press 'enter'.");
        }
        // C.Check library number
        if( option == 'C')   {
            optionDisplay.add("Please talk to Librarian. Thank you.");
        }
        // D. View movies
        if( option == 'D')   {
            optionDisplay = showMovies();
        }
        // error Message on invalid options
        if( option != 'A' && option !='B' && option != 'C'&& option!= 'D')  {
            optionDisplay.add("Select a valid option!!");
        }

        return optionDisplay;
    }

    //check availability of the book selected and return corresponding messages
    public ArrayList<String> bookSelected(int book)
    {
        // book 1.& 2. are available
        ArrayList<String> bookReserveDisplay = new ArrayList<String>();
        if( book == 1 || book ==2 )   {
            bookReserveDisplay.add("Thank you! Enjoy the book.");
        }
        // book 3. is unavailable
        if( book == 3 )  {
            bookReserveDisplay.add("Sorry we don't have that book yet.");
        }
        // book numbers other than 1,2,3 will be warned as invalid number
        if(book!=1&&book!=2&&book!=3)   {
            bookReserveDisplay.add("Select a valid book number!!");
        }
        return bookReserveDisplay;
    }

    //return the list of all books
    public ArrayList<String> showBooks()
    {
        ArrayList<String> books = new ArrayList<String>();
        books.add("1.Head First Java");
        books.add("2.Agile Development");
        books.add("3.Eloquent JavaScrip");
        return books;
    }

    //return the list of movies
    public ArrayList<String> showMovies()
    {
        ArrayList<String> movies = new ArrayList<String>();
        movies.add("MovieName1 Director1 10");
        movies.add("MovieName2 Director2 9");
        movies.add("MovieName3 Director3 8");
        movies.add("MovieName4 Director4 7");
        movies.add("MovieName5 Director5 6");
        movies.add("MovieName6 Director6 5");
        movies.add("MovieName7 Director7 6");
        movies.add("MovieName8 Director8 7");
        movies.add("MovieName9 Director9 8");
        movies.add("MovieName10 Director10 9");
        movies.add("MovieName11 Director11 10");
        movies.add("MovieName12 Director12 N/A");
        movies.add("MovieName13 Director13 N/A");
        movies.add("MovieName14 Director14 N/A");
        movies.add("MovieName15 Director15 N/A");
        return movies;
    }

    public ArrayList<String> showEnding()
    {
        ArrayList<String> ending = new ArrayList<String>();
        ending.add("To exit the system, press 'q'.");
        ending.add("To return to the main menu, press 'm'.");
        return ending;
    }

}
