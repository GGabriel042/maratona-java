package Exercicios.ErrosExceptions03.dominio;

public class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
