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
public class message {

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
        menuDisplay.add( "Select an option by its index letter and press 'enter'.");
        return menuDisplay;
    }

    //display the menu option selected
    public ArrayList<String> showOptionSelected(char option)
    {
        ArrayList<String> optionDisplay = new ArrayList<String>();
        // A/a.View all books
        if(option == 'a' || option == 'A')  optionDisplay = showBooks();
        // B/b.Reserve a book
        if(option == 'b' || option == 'B')   {
            optionDisplay = showBooks();
            optionDisplay.add("Select a book by its number and press 'enter'.");
        }
        // C/c.Check library number
        if(option == 'c' || option == 'C')   {
            optionDisplay.add("Please talk to Librarian. Thank you.");
        }
        // error message on invalid options
        if(option != 'a' && option != 'A' && option != 'b' && option !='B' && option != 'c' && option != 'C')  {
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
        ArrayList<String> bookDisplay = new ArrayList<String>();
        bookDisplay.add( "1.Head First Java");
        bookDisplay.add( "2.Agile Development");
        bookDisplay.add( "3.Eloquent JavaScrip");
        return bookDisplay;
    }

}
