package org.fasttrack.curs13;

public class SoldInsuficientException extends RuntimeException {
    private int sold;
    private int suma;

    public SoldInsuficientException(int sold, int suma) {
        super();
    }

    public String getDetailedMessage() {
        return String.format("Utilizator a dorit sa extraga %d din cont, dar soldul era de %d", suma, sold);
    }
}
