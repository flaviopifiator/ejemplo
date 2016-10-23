package laboratorio;

public class Vendedor extends Empleado{
    private int sucursal;
    private float procentaje;
    
    public Vendedor(String d, String a, String n, String dom, Fecha f, Fecha ing, String leg, String c, char s, int suc, float por){
        setNombre(n);
        setApellido(a);
        setDni(d);
        setDomicilio(dom);
        setFecha(f);
        setIngreso(ing);
        setLegajo(leg);
        setCargo(c);
        setSexo(s);
        this.sucursal = suc;
        this.procentaje = por;
    }

    /**
     * @return the sucursal
     */
    public int getSucursal() {
        return sucursal;
    }

    /**
     * @param sucursal the sucursal to set
     */
    public void setSucursal(int sucursal) {
        this.sucursal = sucursal;
    }

    /**
     * @return the procentaje
     */
    public float getProcentaje() {
        return procentaje;
    }

    /**
     * @param procentaje the procentaje to set
     */
    public void setProcentaje(float procentaje) {
        this.procentaje = procentaje;
    }
    
}
