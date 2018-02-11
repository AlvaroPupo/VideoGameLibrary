package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {

    public void addGame () {


//        Scanner input = new Scanner(System.in);
//        System.out.println("What is the name of the game you would like to add?");
//        String gameName = input.nextLine();
//        System.out.println("you added " + gameName + " to your library.");
//        System.out.println();
//        Menu menu = new Menu();
//        menu.startMenu();

        Scanner input = new Scanner(System.in);

        System.out.println("What is the name of the game you would like to add?");
        String firstGame = input.nextLine();

        List<String> Games = new ArrayList<>();
        Games.add(firstGame);

        System.out.println("you added " + firstGame + " to your library");

        System.out.println("Do you want to add another game? y / n");
        String add = input.nextLine();

        if (add.equalsIgnoreCase("y")) {
            System.out.println("What is the name of the game you would like to add?");
            String secondGame = input.nextLine();
            Games.add(secondGame);
            System.out.println();
            System.out.println("you added " + secondGame + " to your library");
            System.out.println();
            Menu menu = new Menu();
            menu.startMenu();

        } else if (add.equalsIgnoreCase("n")){
            System.out.println();
            Menu menu = new Menu();
            menu.startMenu();
        }
        }

        public void Gamelist () {

        Scanner input2 = new Scanner(System.in);
        System.out.println("Here are the games that you've saved on your library: ");
//            Games.get(0);
//            Games.get(1);
        System.out.println();
        System.out.println("what would you like to do? \n1. delete game\n2. Check in game\n3. Check out game");


    }


        //code goes here to add game to wherever we are saving game things to


    }


