package org.example;
import java.util.Scanner;

public class CountToEleven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number less than 11:");
        int number = scanner.nextInt();

        while (number <= 11) {
            System.out.println(number);
            number++;
        }

        scanner.close();
    }
}