package org.example;
import java.util.Scanner;

public class StopAtFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.println("Give a number:");
            number = scanner.nextInt();
        } while (number != 5);

        System.out.println("You entered 5. The program has ended.");
        scanner.close();
    }
}