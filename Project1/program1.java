// Ocean Lu
// CS140
// Project 1, Task #1 - Calculating Hourly Pay
// 04.25.17

import java.util.Scanner;
public class program1 {
    public static void main(String[] args) {
        System.out.print("Please enter hours you worked this week: ");
        Scanner keyboard = new Scanner(System.in);
        int hours = keyboard.nextInt();
        System.out.print("Please enter your hourly pay rate: ");
        double rate = keyboard.nextDouble();
        double pay;
        if (hours > 40 && hours < 60) {
            pay = (rate * 40) + (rate * 1.5 * (hours - 40));
            System.out.println("Your gross pay is $" + pay);
        } else if (hours >= 60) {
            pay = (rate * 40) + (rate * 1.5 * (20));
            System.out.println("Your gross pay is $" + pay);
        } else if (hours < 15) {
            pay = 0;
            System.out.println("Sorry you need to work at least 15 hours to get paid this week.\nYour hours worked will be deferred to next week.");
        } else {
            pay = (rate * hours);
            System.out.println("Your gross pay is $" + pay);
        }
    }
}
