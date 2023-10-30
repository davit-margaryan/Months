package org.example;

import java.time.Month;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static List<Integer> test(String substring) {
        return Stream.of(Month.values())
                .filter(month -> month.name().contains(substring.toUpperCase()))
                .map(month -> month.name().length())
                .distinct()
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a substring or 'q' to quit: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("q")) {
                System.out.println("Exiting the program.");
                break;
            } else {
                List<Integer> result = test(input);
                System.out.println("Result: " + result);
            }
        }
        scanner.close();
    }
}