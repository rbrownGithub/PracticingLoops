package org.example;
import java.util.Scanner;

public class PositiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        while (true) {
            System.out.println("Enter a number:");
            number = scanner.nextInt();

            if (number == 0) {
                break;
            } else if (number < 0) {
                System.out.println("Number must be a positive number");
            } else {
                System.out.println("Number is " + number);
            }
        }

        System.out.println("You entered 0. The program has ended.");
        scanner.close();
    }
}