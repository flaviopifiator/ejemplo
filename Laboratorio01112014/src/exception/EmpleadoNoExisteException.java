package exception;

public class EmpleadoNoExisteException extends RuntimeException{
    public EmpleadoNoExisteException(String mensaje){
        super(mensaje);
    }
    
}
