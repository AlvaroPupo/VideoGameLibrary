package com.company;

import java.util.InputMismatchException;

import java.util.List;
import java.util.Scanner;

public class Menu {

    private Scanner input = new Scanner(System.in);

    //menu to prompt user for library option
    public void startMenu () {

        System.out.println("Welcome to the Video Game Library, what would you like to do? \n" +
                "1. Add a game to the library\n" +
                "2. Remove a game from the library \n" +
                "3. View what is currently in the library \n" +
                "4. check a game out \n" +
                "5. check a game in \n" +
                "6. view checked out games \n" +
                "7. exit the program");
        try {

            switch (input.nextInt()) {
                case 1:
                    Library game = new Library();
                    game.addGame();
                    //add game
                    break;
                case 2:

                    //remove game
                    break;
                case 3:
                    Library list = new Library();
                    list.Gamelist();
                    //view library
                    break;
                case 4:
                    //check out the game
                    break;
                case 5:
                    //check in game
                    break;
                case 6:
                    //view the checked out games
                    break;
                case 7:
                    System.out.println("Goodbye!!");
                    System.exit(7);
                    //exit program
                    break;
                default:
                    // prompt the user to pick a correct number, loop back to menu
                    break;
            }
        } catch (InputMismatchException ime) {
            input.nextLine();
            System.out.println("select a number from 1 to 7");
            startMenu();

        }
    }
}
