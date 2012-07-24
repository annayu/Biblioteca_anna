package com.twu28.biblioteca;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: 123
 * Date: 12-7-19
 * Time: 下午4:14
 * To change this template use File | Settings | File Templates.
 */
public class BibliotecaTest {
        Message m = new Message();
    @Test
    public void userSeesWelcomeTest() throws Exception{
        ArrayList<String> welcomeMsg = new ArrayList<String>();
        welcomeMsg.add("Welcome to Biblioteca!");
        Assert.assertEquals(welcomeMsg, m.showWelcome());
    }

    @Test
    public void userSeesMenuOptionsTest() throws Exception{
        ArrayList<String> menuMsg = new ArrayList<String>();
        menuMsg.add("MENU");
        menuMsg.add("A. View all books in the library.");
        menuMsg.add("B. Reserve a book for collection.");
        menuMsg.add("C. Check your library number.");
        menuMsg.add( "D. View all movies in the library. ");
        menuMsg.add("Select an option by its index letter and press 'enter'.");
        Assert.assertEquals(menuMsg, m.showMenu());
    }

    @Test
    public void userSelectViewAllBooksUpperATest() throws Exception{
        char testOption = 'A';
        ArrayList<String> bookMsg = new ArrayList<String>();
        bookMsg.add("1.Head First Java");
        bookMsg.add("2.Agile Development");
        bookMsg.add("3.Eloquent JavaScrip");
        Assert.assertEquals(bookMsg,m.showOptionSelected(testOption));
    }

    @Test
    public void userSelectReserveBookUpperBTest() throws Exception{
        char testOption = 'B';
        ArrayList<String> bookMsg = new ArrayList<String>();
        bookMsg.add("1.Head First Java");
        bookMsg.add("2.Agile Development");
        bookMsg.add("3.Eloquent JavaScrip");
        bookMsg.add("Select a book by its number and press 'enter'.");
        Assert.assertEquals(bookMsg,m.showOptionSelected(testOption));
    }

    @Test
    public void userSelectCheckNumberUpperCTest() throws Exception{
        char testOption = 'C';
        ArrayList<String> cMessage = new ArrayList<String>();
        cMessage.add("Please talk to Librarian. Thank you.");
        Assert.assertEquals(cMessage,m.showOptionSelected(testOption));
    }

    @Test
    public void userViewMoviesTest() throws Exception{
        char testOption = 'D';
        ArrayList<String> movieList = new ArrayList<String>();
        movieList.add("MovieName1 Director1 10");
        movieList.add("MovieName2 Director2 9");
        movieList.add("MovieName3 Director3 8");
        movieList.add("MovieName4 Director4 7");
        movieList.add("MovieName5 Director5 6");
        movieList.add("MovieName6 Director6 5");
        movieList.add("MovieName7 Director7 6");
        movieList.add("MovieName8 Director8 7");
        movieList.add("MovieName9 Director9 8");
        movieList.add("MovieName10 Director10 9");
        movieList.add("MovieName11 Director11 10");
        movieList.add("MovieName12 Director12 N/A");
        movieList.add("MovieName13 Director13 N/A");
        movieList.add("MovieName14 Director14 N/A");
        movieList.add("MovieName15 Director15 N/A");
        Assert.assertEquals(movieList,m.showOptionSelected(testOption));
    }

    @Test
    public void userSelectInvalidMenuOptionTest() throws Exception{
        char testOption = '0';
        ArrayList<String> errorMessage = new ArrayList<String>();
        errorMessage.add("Select a valid option!!");
        Assert.assertEquals(errorMessage,m.showOptionSelected(testOption));
    }

    @Test
    public void userReserveBookAvailableTest() throws Exception {
        int testBook = 1;
        ArrayList<String> Message = new ArrayList<String>();
        Message.add("Thank you! Enjoy the book.");
        Assert.assertEquals(Message,m.bookSelected(testBook));
    }

    @Test
    public void userReserveBookUnavailableTest() throws Exception {
        int testBook = 3;
        ArrayList<String> Message = new ArrayList<String>();
        Message.add("Sorry we don't have that book yet.");
        Assert.assertEquals(Message,m.bookSelected(testBook));
    }

    @Test
    public void userReserveInvalidBookTest() throws Exception {
        int testBook = 5;
        ArrayList<String> Message = new ArrayList<String>();
        Message.add("Select a valid book number!!");
        Assert.assertEquals(Message,m.bookSelected(testBook));
    }

}
