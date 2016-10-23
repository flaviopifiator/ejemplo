package laboratorio;

public class Administrativo extends Empleado{
    private String area;
    
    public Administrativo(String d, String a, String n, String dom, Fecha f, Fecha ing, String leg, String c, char s, String ar){
        setNombre(n);
        setApellido(a);
        setDni(d);
        setDomicilio(dom);
        setFecha(f);
        setIngreso(ing);
        setLegajo(leg);
        setCargo(c);
        setSexo(s);
        this.area=ar;
    }
    public String getArea() {
        return area;
    }
    public void setArea(String area) {
        this.area = area;
    }
    
    
}
