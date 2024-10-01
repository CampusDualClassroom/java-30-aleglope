package com.campusdual.classroom;

public class Exercise30 {

    /**
     * Método que realiza una división y lanza una excepción personalizada si el divisor es cero.
     *
     * @param dividend El dividendo de la operación.
     * @param divisor  El divisor de la operación.
     * @return El resultado de la división.
     * @throws DivisionByZeroException Si el divisor es cero.
     */
    public static int divisionWithCustomException(int dividend, int divisor) throws DivisionByZeroException {
        if (divisor == 0) {
            throw new DivisionByZeroException("Error: No se puede dividir por cero.");
        }
        return dividend / divisor;
    }

    public static void main(String[] args) {
        try {
            // Intentar dividir dos números, aquí no se lanza una excepción
            int result = divisionWithCustomException(10, 2); // Cambié a 2 para evitar excepción
            System.out.println("Resultado de la división: " + result);
        } catch (DivisionByZeroException e) {
            // Controlar la excepción personalizada
            System.out.println("Excepción controlada: " + e.getMessage());
        }
    }
}
