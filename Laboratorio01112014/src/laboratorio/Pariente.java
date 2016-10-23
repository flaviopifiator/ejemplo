package laboratorio;

public class Pariente extends Persona{
    private String relacion;
    
    public Pariente(String d, String a, String n, String dom, Fecha f, char s, String r){
        this.persona(d, a, n, dom, f, s);
        this.relacion=r;    
    }

    /**
     * @return the relacion
     */
    public String getRelacion() {
        return relacion;
    }

    /**
     * @param relacion the relacion to set
     */
    public void setRelacion(String relacion) {
        this.relacion = relacion;
    }
    
}
