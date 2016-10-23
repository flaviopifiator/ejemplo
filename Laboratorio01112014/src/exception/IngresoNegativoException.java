package exception;

public class IngresoNegativoException extends RuntimeException{
    public IngresoNegativoException(String mensaje){
        super(mensaje);
    }
}
