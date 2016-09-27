/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Matthew
 */
public class BlackJack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random r = new Random();
        Scanner input = new Scanner(System.in);

        int plyrDrw1 = r.nextInt(10) + 1;
        int plyrDrw2 = r.nextInt(10) + 1;
        int dlrDrw1 = r.nextInt(10) + 1;
        int dlrDrw2 = r.nextInt(10) + 1;

        System.out.println("Welcome to Matt's blackjack program!");
        System.out.println("You get a " + plyrDrw1 + " and a " + plyrDrw2 + ".");
        int plyrTotal = plyrDrw1 + plyrDrw2;
        System.out.println("Your total is " + plyrTotal + ".");

        System.out.println("The dealer has " + dlrDrw1 + " showing, and a hidden card.");
        int dlrTotal = dlrDrw1 + dlrDrw2;
        System.out.println("His total is hidden, too.");

        while (plyrTotal <= 21) {
            System.out.print("Would you like to \"hit\" or \"stay\"? ");
            String plyrChoice = input.nextLine();
            if (plyrChoice.equalsIgnoreCase("hit")) {
                int hit = (r.nextInt(10) + 1);
                System.out.println("You drew a " + hit);
                plyrTotal = plyrTotal + hit;
                System.out.println("Your total is " + plyrTotal);
            } else {
                System.out.println("Okay, dealers turn.");
                System.out.println("His hidden card was a " + dlrDrw2 + ".");
                System.out.println("His total was " + dlrTotal + ".");
                while (dlrTotal <= 16) {
                    System.out.println("Dealer Chooses to hit.");
                    int dlrHit = (r.nextInt(10) + 1);
                    System.out.println("He draws a " + dlrHit + ".");
                    dlrTotal = dlrTotal + dlrHit;
                    System.out.println("His total is " + dlrTotal + ".");
                    if (dlrTotal > 21){
                        System.out.println("The dealer busted.");
                    }
                }
                
            }
        }
        System.out.println("You Lose.");
       

        System.out.println("Dealer total is " + dlrTotal + ".");
        System.out.println("Your total is " + plyrTotal + ".");
    }

}
