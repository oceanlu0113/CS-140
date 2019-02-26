// Author: Ocean Lu
// Assignment: Project #4
// Task #1
// Completed: 05/31/2017

import java.util.Scanner;
import java.io.*;

public class ArrayProcessing {

    public static void main(String[] args) throws IOException {
        int[] outputFile = inputData();
        System.out.println("Original Array: ");
        printArray(outputFile);
	double average = average(outputFile);
        System.out.printf("The average temperature is %.1fF degrees.\n", average);
        System.out.println("The highest temperature is " + max(outputFile) + "F degrees.");
        System.out.println("The lowest temperature is " + min(outputFile) + "F degrees.");
        System.out.println("Sorted Array:");
        selectionSort(outputFile);
    }

    public static int[] inputData() throws IOException {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter input filename: ");
        String fileName = keyboard.nextLine();
        File file = new File(fileName);
        if (!file.exists()) {
            System.out.println("Error, file do not exist.");
            System.exit(0);
        } else {
            int count = 0;
            Scanner inputFile = new Scanner(file);
            int[] numbers = new int[inputFile.nextInt()];
            while (inputFile.hasNext() && count < numbers.length) {
                numbers[count] = inputFile.nextInt();
                count++;
            }
            inputFile.close();
            return numbers;
        }
        return null;
    }

    public static void printArray(int[] array) {
        for (int i = 1; i <= array.length; i++) {
            System.out.print(array[i-1] + " ");
            if (i % 10 == 0) {
                System.out.println();
            }
        }
	System.out.println();
    }

    public static double average(int[] array) {
        double total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }
        return total / array.length;
    }

    public static int max(int[] array) {
        int highest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > highest) {
                highest = array[i];
            }
        }
        return highest;
    }

    public static int min(int[] array) {
        int lowest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < lowest) {
                lowest = array[i];
            }
        }
        return lowest;
    }


    public static void selectionSort(int[] array) {
        for (int s = 0; s <= array.length - 1; s++) {
            for (int k = 0; k <= array.length - 2; k++) {
                if (array[k] > array[k + 1]) {
                    int temp = 0;
                    temp = array[k];
                    array[k] = array[k + 1];
                    array[k + 1] = temp;
                }
            }
        }
        printArray(array);
    }
}
