// Author: Ocean Lu
// Assignment: Lab #5
// Task #1
// Completed: 04/28/2017

import java.util.Scanner;
public class Prog1 {
    public static void main(String[] args) {
        while (true) {
            System.out.print("Welcome to my BMI calculation.\nPlease input \"m\" for Metric or \"e\" for English: ");
            Scanner keyboard = new Scanner(System.in);
            String choice = keyboard.nextLine();
            if (choice.equals("m")) {
                System.out.print("Please enter weight (kilograms): ");
                double weight = keyboard.nextDouble();
                System.out.print("Please enter height (meters): ");
                Scanner kbd = new Scanner(System.in);
                double height = kbd.nextDouble();
                double bmi = weight / (Math.pow(height, 2));
                System.out.printf("Weight: %.2f, Height: %.2f, BMI: %.0f\n", weight, height, bmi);
            }
            if (choice.equals("e")) {
                System.out.print("Please enter weight (lb): ");
                double weight = keyboard.nextDouble();
                System.out.print("Please enter height (inches): ");
                Scanner kbd = new Scanner(System.in);
                double height = kbd.nextDouble();
                double bmi = weight / (Math.pow(height, 2)) * 703;
                System.out.printf("Weight: %.2f, Height: %.2f, BMI: %.0f\n", weight, height, bmi);
            }
            System.out.print("Do you want to calculate another BMI? Enter Y or y for Yes: ");
            Scanner kbd = new Scanner(System.in);
            String looping = kbd.nextLine();
            if (looping.equals("y") || looping.equals("Y")) {
                System.out.print("");
            } else {
                break;
            }
        }
    }
}
