package org.fasttrack.curs13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your age: ");
        int age = 0;

        while (true) {
            try {
                age = scanner.nextInt();
                System.out.println("Your birth year is: " + BirthYearCalculator.returnYearOfBirth(age));
                break;
            } catch (InputMismatchException ex) {
                System.out.println("Inputul nu este un numar valid");
            } catch (InvalidAgeException ex) {
                System.out.println(ex.getMessage());
            } finally {
                System.out.println("-----------------");
            }
        }
    }
}
