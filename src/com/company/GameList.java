package com.company;

import java.util.Scanner;

public class GameList extends Library{

    public void Gamelist() {

        Scanner input = new Scanner(System.in);
        System.out.println("Here are the games that you've saved on your library: ");
        System.out.println();
        
        System.out.println();
        System.out.println("what would you like to do? \n1. delete game\n2. Check in game\n3. Check out game");

    }
}
