
import java.util.Scanner;

public class ChaoticRealm {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mohammad welcomes you to Epic Quest: The Chaotic Realm!");
        System.out.println("You find yourself awakening in a foggy and bewildering realm, filled with mythical creatures and mysterious challenges.");
        System.out.println("Your noble mission is to uncover the scattered lost artifacts hidden throughout this realm and seek out the legendary Treasure of the Ancients.");

        int steps = 0;
        int playerHealth = 100; 
        int treasureLocation = (int) (Math.random() * 81) + 1;
        boolean foundTreasure = false;

        while (!foundTreasure && playerHealth > 0) {
            System.out.print("\nChoose your next step (1-81): ");
            int chosenStep = scanner.nextInt();
            steps++;

            if (chosenStep == treasureLocation) {
                foundTreasure = true;
                break;
            }

            if (chosenStep % 5 == 0) {
                System.out.println("Oh no! You triggered a mystical portal that whisked you away to an unknown location.");
                int randomTeleport = (int) (Math.random() * 81) + 1;
                if (randomTeleport == chosenStep) {
                    System.out.println("Miraculously, the portal brought you back to where you started!");
                } else {
                    chosenStep = randomTeleport;
                    System.out.println("You find yourself at a completely new location: " + chosenStep);
                }
            }

           
            if (chosenStep == 25 || chosenStep == 50 || chosenStep == 75) {
                System.out.println("You encountered a fearsome and menacing beast!");
                int damage = (int) (Math.random() * 30) + 20;
                playerHealth -= damage;
                System.out.println("The creature lunged at you, inflicting " + damage + " damage. Your health now stands at " + playerHealth);
            } else if (chosenStep % 10 == 0) {
                System.out.println("You stumbled upon a treacherous swamp, sapping some of your strength.");
                int damage = (int) (Math.random() * 15) + 10;
                playerHealth -= damage;
                System.out.println("You lost " + damage + " health. Your health now stands at " + playerHealth);
            }

          
            if (chosenStep == 10 || chosenStep == 40 || chosenStep == 70) {
                int healthBoost = (int) (Math.random() * 30) + 10;
                playerHealth = Math.min(playerHealth + healthBoost, 100);
                System.out.println("You found a mystical potion! Your health has now been restored to " + playerHealth);
            } else if (chosenStep % 7 == 0) {
                System.out.println("You stumbled upon an ancient relic! It bestowed you with mysterious power.");
                int damageBoost = (int) (Math.random() * 20) + 10;
                playerHealth -= damageBoost;
                System.out.println("The relic surged with energy and empowered you, but it drained " + damageBoost + " health. Your health now stands at " + playerHealth);
            }

            System.out.println("With determination, you take a step and find yourself at location: " + chosenStep);
            System.out.println("Your quest is riddled with chaos. Continue onward, stay vigilant, and brace for what lies ahead!");
        }

        if (foundTreasure) {
            System.out.println("\nCongrats for winning, sent by Mohammad Alhammad!");
            System.out.println("Against all odds, you have unearthed the legendary Treasure of the Ancients in " + steps + " steps!");
            System.out.println("Your valor amidst the chaos has triumphed, and you have emerged as a true legend!");
        } else {
            System.out.println("\nGame Over! Your strength has been sapped, and you succumbed to the chaotic realm after surviving " + steps + " steps.");
            System.out.println("The Treasure of the Ancients remains veiled, awaiting a new adventurer bold enough to embrace the chaos!");
        }

        System.out.println("\n// Thanks for playing Epic Quest: The Chaotic Realm!");
        // Created by Mohammad Alhammad//
    }
}

