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
    private String option;
    private String add;
    Calendar calendar = Calendar.getInstance();
    private SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yy HH:mm:ss");

    public Library(Menu menu) {
        this.menu = menu;
    }

    public void addGame() {

        System.out.println("What is the name of the game you would like to add?");
        firstGame = input.nextLine();

        Games.add(firstGame);

        System.out.println("you added " + firstGame + " to your library on: " + dateFormat.format(calendar.getTime()));
        System.out.println();
        System.out.println("would you like to add another game? y/n");
        add = input.nextLine();

        if (add.equalsIgnoreCase("y")){
            oneMoreGame();
        } else if (add.equalsIgnoreCase("n")){
        menu.startMenu();
    }
    }

    public void Gamelist() {

        if (Games.isEmpty()) {
            System.out.println("There are no games in your library");
            System.out.println();
            menu.startMenu();
        } else {
            System.out.println("Here are the games that you've saved on your library: ");
        }
        Gamelist2();
        System.out.println();
    }

    public void multipleOption() {

        System.out.println("what would you like to do? \n1. delete game\n2. Check in game\n3. Check out game\n4. go to the main menu");
        option = input.nextLine();
        if (option.equalsIgnoreCase("1")) {
            System.out.println();
            deleteGame();
        } else if (option.equalsIgnoreCase("2")) {
            System.out.println();
            checkedInGames();
        } else if (option.equalsIgnoreCase("3")) {
            System.out.println();
            checkOut();
        } else if (option.equalsIgnoreCase("4")) {
            System.out.println();
            menu.startMenu();
        }
    }
    public void deleteGame() {

        if (Games.isEmpty()) {
            System.out.println("There are no games to delete");
            System.out.println();
            menu.startMenu();
        } else {
            System.out.println("which game would you like to delete\nPress 1 to delete them all");
        }
        int index = 1;
        for (String game : Games) {

            System.out.println(index++ + ". " + game);
        }
        if (index == 1) {
        }
        firstGame = input.nextLine();

        if (firstGame.equalsIgnoreCase("1")){
            Games.removeAll(Games);
            System.out.println("All games removed.");
            System.out.println();
            menu.startMenu();
        } else {
            Games.remove(firstGame);
        }
        System.out.println(firstGame + " deleted.");
        System.out.println();
        menu.startMenu();
    }

    public void checkOut() {

        if (Games.isEmpty()) {
            System.out.println("There are no games in your library to check out");
            System.out.println();
            menu.startMenu();
        } else {
            System.out.println("Which game would you like to check out: ");
        }
        int index = 1;
        for (String game : Games) {

            System.out.println(index++ + ". " + game);
        }
        if (index == 1) {

        }
        System.out.println("(to select, please enter the name of the game)");
        firstGame2 = input.nextLine();
        checkedOutGames.add(firstGame2);
        Date();
    }

    public void Gamelist2() {

        int index = 1;
        for (String game : Games) {

            System.out.println(index++ + ". " + game);
        }
        if (index == 1) {

        }
        multipleOption();
    }

    public void Date() {

        System.out.println("your game was checked out on: " + dateFormat.format(calendar.getTime()));

        calendar.add(Calendar.DAY_OF_YEAR, 3);
        System.out.println("and it is due on: " + dateFormat.format(calendar.getTime()));
        System.out.println();
        menu.startMenu();
    }

    public void checkedInGames() {

        if (checkedOutGames.isEmpty()){
            System.out.println("First you need to add a game to your library!!");
            System.out.println();
            menu.startMenu();
        }else {
            System.out.println("What is the name of the game you would like to check in?");
        }
        firstGame = input.nextLine();
        Games.add(firstGame);
        System.out.println("you checked in: " + firstGame + " on " + dateFormat.format(calendar.getTime()));
        System.out.println();
        System.out.println("would you like to check in another game? y/n");
        add = input.nextLine();
        if (add.equalsIgnoreCase("y")) {
            oneMoreGame();
        } else if (add.equalsIgnoreCase("n")){
            menu.startMenu();
        }
    }
    public void oneMoreGame() {

        System.out.println("What is the name of the game you would like to add?");
        secondGame = input.nextLine();
        Games.add(secondGame);
        System.out.println("you checked in " + secondGame + " on " + dateFormat.format(calendar.getTime()));
        System.out.println();

    System.out.println("Would you like to add another game? y/n");
        add = input.nextLine();
        if (add.equalsIgnoreCase("y")){
            addGame();
        }else if (add.equalsIgnoreCase("n")){
            menu.startMenu();
        }
    }
        public void CheckedOutList () {

            if (checkedOutGames.isEmpty()){
                System.out.println("There are no checked out games in your library");
                System.out.println();
                menu.startMenu();
            }else {
                System.out.println("Here are the list of the games you have checked out: ");
            }
            int index = 1;
            for (String game : checkedOutGames) {

                System.out.println(index++ + ". " + game);
            }
            if (index == 1) {
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
    }


