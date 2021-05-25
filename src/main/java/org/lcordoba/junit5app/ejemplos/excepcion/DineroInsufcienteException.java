package org.lcordoba.junit5app.ejemplos.excepcion;

public class DineroInsufcienteException extends RuntimeException {
    public DineroInsufcienteException(String message) {
        super(message);
    }
}
