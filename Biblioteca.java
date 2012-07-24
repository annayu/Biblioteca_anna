package com.twu28.biblioteca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created with IntelliJ IDEA.
 * User: 123
 * Date: 12-7-19
 * Time: 下午2:59
 * To change this template use File | Settings | File Templates.
 */
public class Biblioteca {

    public static void main(String [] args)
    {
        char option;
        int book;
        boolean quit = false;
        char end;
        Message message = new Message();
        // Show welcome Message at the beginning
        System.out.println(message.showWelcome());

        // System can return to main menu if not quit
        while(!quit)
        {
            System.out.println(message.showMenu());
            option = getUserInput().charAt(0);
            System.out.println(message.showOptionSelected(option));

            if( option == 'B')
            {
                book = Integer.parseInt(getUserInput());
                System.out.println( message.bookSelected(book));
            }

            System.out.println(message.showEnding());
            end = getUserInput().charAt(0);
            // quit if user enters 'q'
            if (end == 'q') quit=true;
        }
    }

    public static String getUserInput()
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

}