// Author: Ocean Lu
// Assignment: Lab #7 Bonus
// Task #2
// Completed: 05/11/2017

import java.util.Scanner;
import java.util.Random;
public class Prog2 {
    public static void main(String[] args) {
        System.out.println("Welcome to the guessing game.");
        Random rand = new Random();
        int num = rand.nextInt(19) + 1;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter your guess: ");
        for (int i = 0; i < 3; i++) {
            int guess = keyboard.nextInt();
            if (guess < num) {
                System.out.println("Too low, try again.");
            } else if (guess > num) {
                System.out.println("Too high, try again");
            }
            else if (guess == num) {
                System.out.println("Yes! The secret number is " +num);
                System.exit(0);
            }
        }
        System.out.println("Sorry! You lost. Buy.");
    }
}

//test runs
/*
0;oslu@costello:~ javac Prog2.java
0;oslu@costello:~ java Prog2
Welcome to the guessing game.
Please enter your guess: 11
Yes! The secret number is 11
0;oslu@costello:~ java Prog2
Welcome to the guessing game.
Please enter your guess: 10
Too high, try again
7
Too high, try again
6
Too high, try again
Sorry! You lost. Buy.
0'oslu@costello:~ java Prog2
Welcome to the guessing game.
Please enter your guess: 11
Too high, try again
6
Too high, try again
2
Too high, try again
Sorry! You lost. Buy.
*/
