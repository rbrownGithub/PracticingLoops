package org.example;
import java.util.Scanner;

public class TakeABreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        do {
            System.out.println("Do you want to take a break?");
            input = scanner.nextLine().toLowerCase();
        } while (!input.equals("yes"));

        System.out.println("Enjoy your break!");
        scanner.close();
    }
}