// Author: Ocean Lu
// Assignment: Lab #4
// Completed: 04/14/2017

import java.util.Scanner;
public class yangBMI {
	public static void main(String[] args) {
		System.out.print("Please input \"m\" for Metric or \"e\" for English: ");
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
        		if (bmi <= 24) {
        			System.out.println("You are normal.");
        		}
        		if (bmi > 24 && bmi < 30) {
        	        	System.out.println("You are overweight.");
        	    	}
        	    	if (bmi >= 30) {
        	        	System.out.println("You are obese.");
        	    	}
       		}
		if (choice.equals("e")) {
    			System.out.print("Please enter weight (lb): ");
    	        	double weight = keyboard.nextDouble();
    	        	System.out.print("Please enter height (inches): ");
    	        	Scanner kbd = new Scanner(System.in);
    	        	double height = kbd.nextDouble();
    	        	double bmi = weight / (Math.pow(height, 2)) * 703;
            		System.out.printf("Weight: %.2f, Height: %.2f, BMI: %.0f\n", weight, height, bmi);
            		if (bmi <= 24) {
                		System.out.println("You are normal.");
            		}
            		if (bmi > 24 && bmi < 30) {
                		System.out.println("You are overweight.");
            		}
            		if (bmi >= 30) {
                		System.out.println("You are obese.");
            		}
        	}
	}
}

