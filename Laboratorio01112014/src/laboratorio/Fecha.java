package laboratorio;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Fecha {
    
    private int año;
    private int mes;
    private int dia;
    private int edad;
    Calendar c = new GregorianCalendar(); 
    Calendar cal = Calendar.getInstance();
    
    public Fecha(int d,int m,int a){
        this.dia = d;
        this.mes = m;
        this.año = a;
    }
    public Fecha(){
    }
    
    
    public int años (){
        this.edad = cal.get(Calendar.YEAR)-this.getAño();
        if (this.getMes() > cal.get(Calendar.MONTH) && this.edad > 1)
            this.edad--;
        if (this.getDia() > cal.get(Calendar.DAY_OF_MONTH) && this.getMes() == cal.get(Calendar.MONTH) && this.edad >= 1)
            this.edad--;
        return edad;            
    }
    public String devolverFecha(){
        dia = c.get(Calendar.DATE);
        mes = c.get(Calendar.MONTH)+1;
        año = c.get(Calendar.YEAR);
        return dia+"/"+mes+"/"+año;
    }
    public void setAño(int año) {
        this.año = año;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }

    /**
     * @return the año
     */
    public int getAño() {
        return año;
    }

    /**
     * @return the mes
     */
    public int getMes() {
        return mes;
    }

    /**
     * @return the dia
     */
    public int getDia() {
        return dia;
    }
}
