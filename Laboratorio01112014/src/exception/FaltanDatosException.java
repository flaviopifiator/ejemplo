package exception;

public class FaltanDatosException extends RuntimeException{
    public FaltanDatosException(String mensaje){
        super(mensaje);
    }
}
