package Exceptions;

public class UnsupportedException extends Exception {
    public UnsupportedException() {
        super("Неподдерживаемая операция");
    }
}
