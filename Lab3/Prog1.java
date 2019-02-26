// Author: Ocean Lu
// Assignment: Lab #3
// Task #1
// Completed: 04/11/2017

import java.util.Scanner;
public class Prog1 
{
public static void main(String[] args) 
{
        System.out.print("Please enter weight (kilograms): ");
        Scanner keyboard = new Scanner (System.in);
        double weight = keyboard.nextDouble();
        System.out.print("Please enter height (meters): ");
        Scanner kbd = new Scanner (System.in);
        double height = kbd.nextDouble();
        double bmi = weight/(Math.pow(height, 2));
        System.out.printf("Weight: %.2f\nHeight: %.2f\nBMI: %.0f\n", 
weight, height, bmi);
}
}
