package laboratorio;

import java.util.ArrayList;

public class JefeDeArea extends Empleado{
    ArrayList<Empleado> empleados = new ArrayList();
    private String area;
    
    
    public JefeDeArea(String d, String a, String n, String dom, Fecha f, Fecha ing, String leg, String c, char s, String ar){
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
    public void empleadoEnArea(Empleado e){
        empleados.add(e);
    }
    public Object[][] devolverEmpleadosACargo(){
        int i = 0;
        Object[][] datos = new Object[empleados.size()][7];
        for(Empleado e:empleados){
            String sexo;
            if(empleados.get(i).getSexo()=='m')
                sexo="Masculino";
            else
                sexo="Femenino";
            datos[i][0] = empleados.get(i).getApellido()+", "+empleados.get(i).getNombre();
            datos[i][1] = empleados.get(i).getDni();
            datos[i][2] = sexo;
            datos[i][3] = empleados.get(i).getEdad();
            datos[i][4] = empleados.get(i).getFechaIngreso();
            datos[i][5] = empleados.get(i).getCargo();                
            if(empleados.get(i) instanceof Administrativo){
                Administrativo admin = (Administrativo) e;
                datos[i][6] = admin.getArea();
            }if(empleados.get(i) instanceof Operario){
                Operario ope = (Operario) e;
                datos[i][6] = ope.getArea();
            }
            i++;
        }
        return datos;
    }
    public void empleadosAJefeNuevo(Empleado emp){
        if(empleados.size()==0)
            empleados.add(emp);
        else
            for(Empleado e:empleados)
                if(!e.getDni().equals(emp.getDni()))
                    empleados.add(emp);
    }
    public void quitarEmpleados(){
        empleados.removeAll(empleados);
    }
    public void quitarEmpleado(Empleado e){
        int i = 0;
        if(empleados.size() != 0){
            for(Empleado emp:empleados){
                if(emp.getDni().equals(e.getDni()))
                    break;
                i++;
            }
            this.empleados.remove(i);
        }
    }
    public String getArea() {
        return area;
    }
    public void setArea(String area) {
        this.area = area;
    }
    
}
 