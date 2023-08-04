package org.fasttrack.curs13;

import org.fasttrack.tema12.Car;
import org.fasttrack.tema12.CarShop;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainExceptions {

    //CHECKED VS UNCHECKED
    //checked: recuperabile, trebuie neaparat gestionate. Catch or Specify. Codul nu compileaza altfel
    //checked: inherited from the Exception class

    //unchecked: runtime exception - unexpected
    //unchecked: inherited from the RuntimeException class

    //errors: kills the app, nothing we can do

    //they all extend Throwable.


    public static void main(String[] args) throws FileNotFoundException {
//        methodA();
//        System.out.println("HELLO");
//        try {
//            System.out.println("COD");
//            extractMoneyFromBank(100, 50);
//            extractMoneyFromBank(1000000, 1000);
//        } catch (ValidationException e) {
//            System.out.println("EXCEPTIE");
//            throw new SoldInsuficientException(0, 0);
//        } finally {
//            System.out.println("FINALMENTE");
//        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("a=");
        int number;
        try {
            number = scanner.nextInt();
        } catch (InputMismatchException ex) {
            String message = "Ati incercat sa transformati in int o valoare incorecta";
            throw new RuntimeException(message);
        }

        System.out.println(number);

//        mimicNPE();
    }

    public static void mimicNPE() {
        try {
            methodA();
            CarShop carShop = new CarShop(new ArrayList<>());
            Car myFirstBmw = carShop.getFirstCarWithName("bmw");
            System.out.println(myFirstBmw.getPrice());
        } catch (NullPointerException | ArithmeticException ex) {
            System.out.println("caught a null pointer");
        } catch (FileNotFoundException ex) {
            System.out.println("file not found");
        }
    }

    public static void methodA() throws FileNotFoundException {
        methodB();
    }

    public static void methodB() throws FileNotFoundException {
        methodC();
        methodD();
    }

    public static void methodC() {
        try {
            FileReader reader = new FileReader("files/input1.txt");
        } catch (FileNotFoundException exception) {
            System.out.println("EROAREA MEA ESTE: " + exception.getMessage());
        } catch (IOException exception) {
            System.out.println("dasdasdasd");
        } catch (Exception exception) {
            System.out.println("regular exception");
        }
    }

    private static void methodD() {
    }

    private static void extractMoneyFromBank(int sold, int suma) throws ValidationException {
        if (sold < suma) {
            SoldInsuficientException soldInsuficientException = new SoldInsuficientException(sold, suma);
            System.out.println(soldInsuficientException.getDetailedMessage());
            throw new ValidationException("validarea a cazut");
//            throw soldInsuficientException;
        } else {
            System.out.println("suma ramasa este de " + (sold - suma));
        }
    }

}
