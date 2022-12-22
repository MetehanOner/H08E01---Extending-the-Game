package de.tum.in.ase;

public class IllegalMoveException extends Exception {
    private String message;

    public IllegalMoveException(String message) throws IllegalMoveException {

        this.message = message;
        throw new IllegalMoveException(message);

    }

}
