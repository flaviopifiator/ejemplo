package laboratorio;

import exception.FaltanDatosException;
import exception.IngresoNegativoException;
import exception.ParienteYaEstaException;
import java.util.ArrayList;

public class Empleado extends Persona {
    
    ArrayList<Pariente> parientes = new ArrayList();
    private Fecha ingreso;
    private String legajo;
    private String cargo;
   
    public void agregarPariente(String d, String a, String n, String dom, Fecha f, char s, String r)
    throws FaltanDatosException, NumberFormatException, IngresoNegativoException, ParienteYaEstaException{
        if(d.isEmpty()||a.isEmpty()||n.isEmpty()||dom.isEmpty())
            throw new FaltanDatosException("Empleado - agregarPariente");
        if(f.años()<0)
            throw new IngresoNegativoException("Empleado - agregarPariente");
        int i = 0;
        for(Pariente p:parientes)
            if(parientes.get(i).getDni().equals(d))
                throw new ParienteYaEstaException();
        parientes.add(new Pariente(d, a, n, dom, f, s, r));
    }
    public Object[][] devolverFamiliares(){
        int i = 0;
        Object[][] datos = new Object[parientes.size()][6];
        for(Pariente p:parientes){
            String sexo;
            if(parientes.get(i).getSexo()=='m')
                sexo="Masculino";
            else
                sexo="Femenino";
            datos[i][0] = parientes.get(i).getApellido()+", "+parientes.get(i).getNombre();
            datos[i][1] = parientes.get(i).getDni();
            datos[i][2] = sexo;
            datos[i][3] = parientes.get(i).getDomicilio();
            datos[i][4] = parientes.get(i).getFecha();
            datos[i][5] = parientes.get(i).getRelacion();
            i++;
        }
        return datos;
    }
    public String getLegajo() {
        return legajo;
    }
    public void setIngreso(Fecha ing){
        this.ingreso = ing;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }
    public String getFechaIngreso(){
        return this.ingreso.getDia()+"/"+this.ingreso.getMes()+"/"+this.ingreso.getAño();
    }
    public Fecha getFechaIngresoSinFormato(){
        return this.ingreso;
    }
    public void setFechaIngresoSinFormato(Fecha f){
        this.ingreso = f;
    }
    public void setCargo(String c){
        this.cargo = c;
    }
    public String getCargo(){
        return this.cargo;
    }
    public String getDiaISF(){
        String st = String.valueOf(this.ingreso.getDia());
        return st;
    }
    public String getMesISF(){
        String st = String.valueOf(this.ingreso.getMes());
        return st;
    }
    public String getAñoISF(){
        String st = String.valueOf(this.ingreso.getAño());
        return st;
    }
}
