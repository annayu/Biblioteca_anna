package com.twu28.biblioteca;

/**
 * Created with IntelliJ IDEA.
 * User: 123
 * Date: 12-7-19
 * Time: 下午2:59
 * To change this template use File | Settings | File Templates.
 */
public class userSystem {

    public static void main(String [] args)
    {
        char option;
        int book;
        boolean quit = false;
        char end;
        message m = new message();
        // Show welcome message at the beginning
        System.out.println(m.showWelcome());

        // System can return to main menu if not quit
        while(!quit)
        {
            System.out.println(m.showMenu());
            option = m.getUserInput().charAt(0);
            System.out.println(m.showOptionSelected(option));

            if( option == 'b' || option == 'B')
            {
                book = Integer.parseInt(m.getUserInput());
                System.out.println( m.bookSelected(book));
            }

            System.out.println("To exit the system, press 'q'.");
            System.out.println("To return to the main menu, press 'm'.");
            end = m.getUserInput().charAt(0);
            // quit if user enters 'q'
            if (end == 'q') quit=true;
        }
    }

}