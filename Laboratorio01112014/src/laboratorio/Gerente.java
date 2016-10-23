package laboratorio;

public class Gerente extends Empleado{
    private String sector;
    
    
    public Gerente(String d, String a, String n, String dom, Fecha f, Fecha ing, String leg, String c, char s){
        setNombre(n);
        setApellido(a);
        setDni(d);
        setDomicilio(dom);
        setFecha(f);
        setIngreso(ing);
        setLegajo(leg);
        setCargo(c);
        setSexo(s);
    }
    
}
