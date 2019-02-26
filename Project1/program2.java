// Ocean Lu
// CS140
// Progject 1, Task #2 - Determining Seasons
// 04.25.17

import java.util.Scanner;
public class program2 {
    public static void main(String[] args) {
        System.out.print("Please enter month (1-12): ");
        Scanner keyboard = new Scanner(System.in);
        int month = keyboard.nextInt();
        System.out.print("Please enter day (1-31): ");
        Scanner kbd = new Scanner(System.in);
        int day = kbd.nextInt();
        if (month > 12 || month < 1) {
            System.out.println("Invalid month!");
        }
        if (day > 31 || day < 1) {
            System.out.println("Invalid day!");
        }
        if (month <= 12 && month >= 1 && day <= 31 && day >= 1) {
            int month_day = (month * 100) + day;
            if (month_day <= 320) {
                System.out.println(month + "/" + day + " is in the Winter Season.");
            } else if (month_day <= 620) {
                System.out.println(month + "/" + day + " is in the Spring Season.");
            } else if (month_day <= 920) {
                System.out.println(month + "/" + day + " is in the Summer Season.");
            } else if (month_day <= 1220) {
                System.out.println(month + "/" + day + " is in the Fall Season.");
            } else {
                System.out.println(month + "/" + day + " is in the Winter Season.");
            }
        }
    }
}
