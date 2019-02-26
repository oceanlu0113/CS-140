// Author: Ocean Lu
// Assignment: Project #3
// Task: #1
// Completed: 05/11/2017

import java.util.Scanner;
public class Prog1 {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter an integer that is greater than or equal to 2: ");
        for (int i = 0; i < 4; i++) {
            int num = keyboard.nextInt();
            if (num < 2) {
                System.out.print("Invalid input. Please try again: ");
            } else {
                if (isPrime(num)) {
                    System.out.println(num + " is prime number.");
                } else {
                    System.out.println(num + " is not Prime Number");
                }
                System.exit(0);
            }
            if (i == 2) {
                System.out.println("Exiting.");
                System.exit(0);
            }
        }
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i <= num / 2; i++) {
            int temp = num % i;
            if (temp == 0) {
                return false;
            }
        }
        return true;
    }
}

//test runs
/*
0;oslu@costello:~ javac Prog1.java
0;oslu@costello:~ java Prog1
Enter an integer that is greater than or equal to 2: 2
2 is prime number.
0;oslu@costello:~ java Prog1
Enter an integer that is greater than or equal to 2: 5
5 is prime number.
0;oslu@costello:~ java Prog1
Enter an integer that is greater than or equal to 2: 6
6 is not Prime Number
0;oslu@costello:~ java Prog1
Enter an integer that is greater than or equal to 2: 19
19 is prime number.
0;oslu@costello:~ java Prog1
Enter an integer that is greater than or equal to 2: 51
51 is not Prime Number
0;oslu@costello:~ java Prog1
Enter an integer that is greater than or equal to 2: 53
53 is prime number.
0;oslu@costello:~ java Prog1
Enter an integer that is greater than or equal to 2: 297
297 is not Prime Number
0;oslu@costello:~ java Prog1
Enter an integer that is greater than or equal to 2: 301
301 is not Prime Number
*/
