package Guess_The_Number_Game;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello! What is your name?");
        String name = input.nextLine();
        Random r = new Random();

        boolean playing = true;
        int numberOfGuesses = 1;

        while (playing ) {
            int answer = r.nextInt(20) + 1;

            System.out.println("Well " + name + " I am thinking of a number between 1 to 20.");
            System.out.print("Take a guess ");
            int guess = input.nextInt();


            while (guess != answer &&  numberOfGuesses < 6 ) {

                if (guess > answer) {
                    System.out.println("Your guess is too high.");
                } else if (guess < answer) {
                    System.out.println("Your guess is too low.");
                }
                numberOfGuesses++;
                System.out.print("Take a guess ? ");
                guess = input.nextInt();
            }
            
            System.out.println("Good job,  " + name + "! "
                    + " You guessed my number in " + numberOfGuesses + " guess!");
            System.out.print("Would you like to play again? (y or n)");


            playing = input.next().toLowerCase().startsWith("y");
        }

    }

}