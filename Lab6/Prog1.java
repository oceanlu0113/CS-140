// Author: Ocean Lu
// Assignment: Lab #6
// Task #1
// Completed: 05/02/2017

import java.util.Scanner;
import java.io.*;
public class Prog1 {
    public static void main(String[] args) throws IOException {
        File roster = new File("roster.txt");
        File scores = new File("scores.txt");
        if (!roster.exists() || !scores.exists()) {
            System.out.println("Error, files do not exist.");
            System.exit(0);
        }
        System.out.print("Enter output file name: ");
        Scanner keyboard = new Scanner(System.in);
        String outputFile = keyboard.nextLine();
        System.out.println("The current output file " + outputFile + " will be erased and replaced with the new version.");
        PrintWriter pw = new PrintWriter(outputFile);
        Scanner readR = new Scanner(roster);
        Scanner readS = new Scanner(scores);
        while (readR.hasNext()) {
            String str = readR.nextLine().toUpperCase();
            pw.print(str + " ");
        }
        readR.close();
        pw.println();
        while (readS.hasNext()) {
            int num = readS.nextInt() + 5;
            pw.print(num + " ");
        }
        readS.close();
        pw.close();
    }
}
