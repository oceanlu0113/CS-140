// Author: Ocean Lu
// Assignment: Project #2
// Task: #1
// Completed: 05/08/2017

import java.util.Scanner;
public class Prog1 {
    public static int size;
    public static double sizeCost = 0, crustCost = 0, toppingsCost = 0, totalCost = 0, finalCost = 0;
    public static String crustName, Pepperoni = "", Sausage = "", Onion = "", Mushroom = "";

    public static void main(String[] args) {
        String looping;
        do {
            totalCost = 0;
            getSize();
            getCrust();
            getToppings();
            totalCost = sizeCost + crustCost + toppingsCost;
            totalCost = getCoupon(totalCost);
            System.out.printf("You have chosen a pizza size of " + size + " inches at the price of $%.2f.\n", sizeCost);
            System.out.printf("You have chosen a pizza crust of " + crustName + " at the price of $%.2f.\n", crustCost);
            System.out.printf("You have chosen the list of toppings: " + Pepperoni + Sausage + Onion + Mushroom + "at the price of $%.2f.\n", toppingsCost);
            System.out.printf("After your coupon deduction, you have a total of $%.2f.\n", totalCost);
            totalCost *= 1.085;
            System.out.printf("Sales tax has been applied. Your total cost of this pizza will be $%.2f.\n", totalCost);
            System.out.print("Do you want to order another pizza (Enter 'yes'): ");
            Scanner keyBoard = new Scanner(System.in);
            looping = keyBoard.nextLine();
            finalCost += totalCost;
            System.out.printf("The final cost of this order is $%.2f.\n", finalCost);
            System.out.println("Thank you for ordering!");
        } while (looping.equals("yes"));
    }

    public static void getSize() {
        size = 0;
        System.out.println("Pizza Size (inches)   Cost");
        System.out.println("        10            $10.99");
        System.out.println("        12            $12.99");
        System.out.println("        14            $14.99");
        System.out.println("        16            $16.99");
        System.out.print("What size pizza would you like: ");
        Scanner keyboard = new Scanner(System.in);
        int counter = 1;
        while (counter < 7) {
            size = keyboard.nextInt();
            if (size == 10) {
                sizeCost = 10.99;
                break;
            } else if (size == 12) {
                sizeCost = 12.99;
                break;
            } else if (size == 14) {
                sizeCost = 14.99;
                break;
            } else if (size == 16) {
                sizeCost = 16.99;
                break;
            }
            if (counter == 5) {
                System.out.println("Too many errors. Exiting.");
                System.exit(0);
            } else {
                counter++;
            }
            System.out.print("Error size (attempt: " + counter + "). Please reenter: ");
        }
    }

    public static void getCrust() {
        crustCost = 0;
        crustName = "";
        System.out.println("Pizza Crust (choice)    Cost");
        System.out.println("  Thin Crust   't'      $0");
        System.out.println("  Hand-Tossed  'h'      $1");
        System.out.println("  Deep-Dish    'd'      $2");
        System.out.println("  Abstain      'a'      $0");
        System.out.println("Note: Default will be Thin Crust.");
        System.out.print("What pizza crust would you like: ");
        Scanner kbd = new Scanner(System.in);
        int counter = 1;
        while (counter < 5) {
            crustName = kbd.nextLine();
            if (crustName.equals("t") || crustName.equals("a") || counter == 3) {
                crustCost = 0.0;
                crustName = "Thin Crust";
                System.out.println(crustName + " has been assigned.");
                break;
            } else if (crustName.equals("h")) {
                crustCost = 1.0;
                crustName = "Hand-Tossed";
                System.out.println(crustName + " has been assigned.");
                break;
            } else if (crustName.equals("d")) {
                crustCost = 2.0;
                crustName = "Deep-Dish";
                System.out.println(crustName + " has been assigned.");
                break;
            } else {
                counter++;
            }
            System.out.print("Error crust (attempt: " + counter + "). Please reenter: ");

        }
    }

    public static void getToppings() {
        toppingsCost = 0;
        Pepperoni = "";
        Sausage = "";
        Onion = "";
        Mushroom = "";
        System.out.println("All pizzas come with cheese.");
        System.out.println("Additional toppings are $1.25 each, choose from:");
        System.out.println("Pepperoni, Sausage, Onion, Mushroom.");
        System.out.println("If input incorrectly, it will be treated as no.");
        System.out.println("Please enter ‘Y’ or ‘y’ for yes, and ‘N’ or ‘n’ for no.");
        System.out.print("Would you like Pepperoni: ");
        Scanner kbd = new Scanner(System.in);
        String choice = kbd.nextLine();
        if (choice.equals("Y") || choice.equals("y")) {
            Pepperoni = "Pepperoni ";
            toppingsCost += 1.25;
        } else if (choice.equals("N") || choice.equals("n")) {
            System.out.print("");
        }
        System.out.print("Would you like Sausage: ");
        choice = "";
        choice = kbd.nextLine();
        if (choice.equals("Y") || choice.equals("y")) {
            Sausage = "Sausage ";
            toppingsCost += 1.25;
        } else if (choice.equals("N") || choice.equals("n")) {
            System.out.print("");
        }
        System.out.print("Would you like Onion: ");
        choice = "";
        choice = kbd.nextLine();
        if (choice.equals("Y") || choice.equals("y")) {
            Onion = "Onion ";
            toppingsCost += 1.25;
        } else if (choice.equals("N") || choice.equals("n")) {
            System.out.print("");
        }
        System.out.print("Would you like Mushroom: ");
        choice = "";
        choice = kbd.nextLine();
        if (choice.equals("Y") || choice.equals("y")) {
            Mushroom = "Mushroom ";
            toppingsCost += 1.25;
        } else if (choice.equals("N") || choice.equals("n")) {
            System.out.print("");
        }
    }

    public static double getCoupon(double cost) {
        System.out.println("Coupon codes are case insensitive.");
        System.out.print("Please enter coupon code: ");
        Scanner key = new Scanner(System.in);
        String coupon = key.nextLine();
        coupon = coupon.toLowerCase();
        if (coupon.equals("holiday10")) {
            cost = cost * .90;
            return cost;
        } else if (coupon.equals("winter20")) {
            cost = cost * .80;
            return cost;
        } else if (coupon.equals("vipmax")) {
            cost = cost * .75;
            return cost;
        } else {
            return cost;
        }
    }
}
