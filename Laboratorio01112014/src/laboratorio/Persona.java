package laboratorio;

public class Persona {
    private String dni;
    private String apellido;
    private String nombre;
    private String domicilio;
    private Fecha fecha ;
    private char sexo;
        
    public void persona(String d, String a, String n, String dom, Fecha f, char s){
        this.dni=d;
        this.apellido=a;
        this.nombre=n;
        this.domicilio=dom;
        this.fecha=f;
        this.sexo=s;
    }
     //encapsulamiento....
    
    public void setFecha(Fecha f){
        this.fecha = f;
    }
    public Fecha getFechaSinFormato(){
        return this.fecha;
    }
    public String getFecha(){
        return this.fecha.getDia()+"/"+this.fecha.getMes()+"/"+this.fecha.getAño();
    }
    
    public int getEdad(){
        return this.fecha.años();
    }
    
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    public String getXose(){
        if(this.sexo=='m')
            return "Masculino";
        else
            return "Femenino";
    }
    public String getDiaSF(){
        String st = String.valueOf(this.fecha.getDia());
        return st;
    }
    public String getMesSF(){
        String st = String.valueOf(this.fecha.getMes());
        return st;
    }
    public String getAñoSF(){
        String st = String.valueOf(this.fecha.getAño());
        return st;
    }
}

