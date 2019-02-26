// Author: Ocean Lu
// Assignment: Lab #5
// Task #2
//Completed: 04/28/2017
import java.util.Scanner;
public class Prog2 {
    public static void main(String[] args) {
        while (true) {
            System.out.print("Please enter n value: ");
            Scanner keyboard = new Scanner(System.in);
            int choice = keyboard.nextInt();
            int counter = 0;
            while (counter != choice) {
                int i = 0;
                while (i <= counter) {
                    System.out.print("*");
                    i++;
                }
                System.out.println();
                counter++;
            }
            System.out.print("Do you want to continue? Enter 'yes' or 'no': ");
            Scanner kbd = new Scanner(System.in);
            String looping = kbd.nextLine();
            if (looping.equals("yes")) {
                System.out.print("");
            } else if (looping.equals("no")) {
                break;
            }
        }
    }   
}
