package daniel.webintro.exceptions;

public class NotFound extends RuntimeException {
    public NotFound(int id) {
        super("Elemento con id " + id + " non trovato!");
    }
}
