package com.company;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class Library {

    public final Menu menu;

    private List<String> Games = new ArrayList<String>();
    private List<String> checkedOutGames = new ArrayList<String>();
    private Scanner input = new Scanner(System.in);
    private String firstGame;
    private String firstGame2;
    private String secondGame;
    private String secondGame2;
    private String option;
    private String add;
    Calendar calendar = Calendar.getInstance();
    private SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yy HH:mm:ss");

    public Library(Menu menu) {
        this.menu = menu;
    }

    public void addGame () {

        System.out.println("What is the name of the game you would like to add?");
        firstGame = input.nextLine();


        Games.add(firstGame);

        System.out.println("you added " + firstGame + " to your library");

        System.out.println("Do you want to add another game? y / n");
        add = input.nextLine();

        if (add.equalsIgnoreCase("y")) {
            System.out.println("What is the name of the game you would like to add?");
            secondGame = input.nextLine();
            Games.add(secondGame);
            System.out.println("you added " + secondGame + " to your library");
            System.out.println();
            menu.startMenu();

        } else if (add.equalsIgnoreCase("n")){
            System.out.println();
            menu.startMenu();
        }
        }

        public void Gamelist () {

            System.out.println("Here are the games that you've saved on your library: ");
            Gamelist2();
            System.out.println();
        }
        public void multipleOption () {

            System.out.println("what would you like to do? \n1. delete game\n2. Check in game\n3. Check out game\n4. go to the main menu");
            option = input.nextLine();
        if (option.equalsIgnoreCase("1")){
            System.out.println();
            deleteGame();
        }else if (option.equalsIgnoreCase("2")){
            System.out.println();
            checkedInGames();
        }else if (option.equalsIgnoreCase("3")){
            System.out.println();
            checkOut();
        }else if (option.equalsIgnoreCase("4")){
            System.out.println();
            menu.startMenu();
        }
    }
        public void deleteGame() {

            System.out.println("which game would you like to delete");
            int uno = 1;
            String gamesOnTheLibrary[] = new String[2];
            gamesOnTheLibrary[0] = firstGame;
            gamesOnTheLibrary[1] = secondGame;
            for (int i = 0; i <gamesOnTheLibrary.length; i++) {
                System.out.println(uno + ". " + gamesOnTheLibrary[i]);
                uno++;
            }
            input.nextInt();
            Games.remove(gamesOnTheLibrary);
            System.out.println("Game deleted.");
            System.out.println();
            menu.startMenu();
        }
        public void checkOut() {

            System.out.println("Which game would you like to check out: ");
            int uno = 1;
            String gamesOnTheLibrary[] = new String[2];
            gamesOnTheLibrary[0] = firstGame;
            gamesOnTheLibrary[1] = secondGame;
            for (int i = 0; i <gamesOnTheLibrary.length; i++) {
                System.out.println(uno + ". " + gamesOnTheLibrary[i]);
                uno++;
            }
            System.out.println("(to select, please enter the name of the game)");
            firstGame2 = input.nextLine();
            checkedOutGames.add(firstGame2);
            Date();
        }
        public void Gamelist2 (){

            int uno = 1;
            String gamesOnTheLibrary[] = new String[2];
            gamesOnTheLibrary[0] = firstGame;
            gamesOnTheLibrary[1] = secondGame;
            for (int i = 0; i <gamesOnTheLibrary.length; i++) {
                System.out.println(uno + ". " + gamesOnTheLibrary[i]);
                uno++;
            }
            multipleOption();

        }
        public void Date() {

            System.out.println("your game was checked out on: " + dateFormat.format(calendar.getTime()));

            calendar.add(Calendar.DAY_OF_YEAR,3);
            System.out.println("and it is due on: " + dateFormat.format(calendar.getTime()));
            System.out.println();
            menu.startMenu();
        }
        public void checkedInGames() {

            System.out.println("What is the name of the game you would like to check in?");
            firstGame = input.nextLine();
            Games.add(firstGame);
            System.out.println("you checked in: " + firstGame + " on " + dateFormat.format(calendar.getTime()));
            System.out.println();
            System.out.println("would you like to check in another game? y/n");
            add = input.nextLine();

            if (add.equalsIgnoreCase("y")){
                System.out.println("What is the name of the game you would like to check in?");
                secondGame = input.nextLine();
                Games.add(secondGame);
                System.out.println("you checked in " + secondGame + " on " + dateFormat.format(calendar.getTime()));
                System.out.println();
                menu.startMenu();

            }else if (add.equalsIgnoreCase("n"));
                menu.startMenu();
        }
        public void CheckedOutList () {

            System.out.println("Here are the list of the games you have checked out: ");
            int uno = 1;
            String gamesCheckedOut[] = new String[2];
            gamesCheckedOut[0] = firstGame2;
            gamesCheckedOut[1] = secondGame2;
            for (int i = 0; i <gamesCheckedOut.length; i++){
                System.out.println(uno + ". " + gamesCheckedOut[i]);
                uno++;
            }
            System.out.println();
            System.out.println("1. Check in a game\n2. go to main menu");
            option = input.nextLine();

            if(option.equalsIgnoreCase("1")){
                checkedInGames();
            }else if (option.equalsIgnoreCase("2")){
                menu.startMenu();
            }
        }


        //code goes here to add game to wherever we are saving game things to


    }


