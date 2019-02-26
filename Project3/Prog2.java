// Author: Ocean Lu
// Assignment: Project #3
// Task #2
// Completed: 05/11/2017

import java.util.Scanner;
import java.util.Random;
public class Prog2 {
    public static void main(String[] args) {
        int comp = computerGeneratedNumber();
        int user = getUserChoice();
        displayComputerChoice(comp);
        int winner = selectWinner(comp, user);
        displayWinnerOrMsg(winner);
    }

    public static int computerGeneratedNumber() {
        Random rand = new Random();
        int num = rand.nextInt(3) + 1;
        return num;
    }

    public static int getUserChoice() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("1. Rock");
        System.out.println("2. Paper");
        System.out.println("3. Sissor");
        System.out.print("Enter your choice (int): ");
        int choice = keyboard.nextInt();
        return choice;
    }

    public static void displayComputerChoice(int num) {
        if (num== 1) {
            System.out.println("The computer has chosen Rock!");
        } else if (num == 2) {
            System.out.println("The computer has chosen Paper!");
        } else if (num == 3) {
            System.out.println("The computer has chosen Sissor!");
        }
    }

    public static int selectWinner(int computer, int user) { // 0 = ties, 1 == loses, 2 == wins
        if (computer == user) {
            return 0;
        } else if ((computer == 2 && user == 1) || (computer == 3 && user == 2) || (computer == 1 && user == 3)) {
            return 1;
        } else {
            return 2;
        }
    }

    public static void displayWinnerOrMsg(int winner) {
        if (winner == 0) {
            System.out.println("You have tied!");
        } else if (winner == 1) {
            System.out.println("You have lost!");
        } else if (winner == 2) {
            System.out.println("You have won!");
        }
    }
}

//test runs
/*
0;oslu@costello:~ javac Prog2.java
0;oslu@costello:~ java Prog2
1. Rock
2. Paper
3. Sissor
Enter your choice (int): 1
The computer has chosen Sissor!
You have won!
0;oslu@costello:~ java Prog2
1. Rock
2. Paper
3. Sissor
Enter your choice (int): 2
The computer has chosen Sissor!
You have lost!
0;oslu@costello:~ java Prog2
1. Rock
2. Paper
3. Sissor
Enter your choice (int): 3
The computer has chosen Sissor!
You have tied!
0;oslu@costello:~ java Prog2
1. Rock
2. Paper
3. Sissor
Enter your choice (int): 1
The computer has chosen Paper!
You have lost!
*/
