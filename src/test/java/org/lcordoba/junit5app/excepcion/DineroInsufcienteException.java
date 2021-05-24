package org.lcordoba.junit5app.excepcion;

public class DineroInsufcienteException extends RuntimeException {
    public DineroInsufcienteException(String message) {
        super(message);
    }
}
