package com.campusdual.classroom;

/**
 * Excepción personalizada para manejar errores de división por cero.
 */
public class DivisionByZeroException extends Exception {
    public DivisionByZeroException(String message) {
        super(message);
    }
}
