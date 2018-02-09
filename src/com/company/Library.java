package com.company;

import java.util.Scanner;

public class Library {

    public void addGame () {

        Scanner input = new Scanner(System.in);
        System.out.println("What is the name of the game you would like to add?");
        String gameName = input.nextLine();
        System.out.println("you added " + gameName + " to your library.");
        System.out.println();
        Menu menu = new Menu();
        menu.startMenu();


        //code goes here to add game to wherever we are saving game things to


    }

}
