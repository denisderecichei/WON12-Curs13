package org.fasttrack.curs13;

import java.time.LocalDate;

public class BirthYearCalculator {

    public static int returnYearOfBirth(int age) throws InvalidAgeException {
        LocalDate current = LocalDate.now();
        int year = current.getYear();

        if (age < 0) {
            throw new InvalidAgeException("Age " + age + " is invalid.");
        }
        return year - age;
    }
}
