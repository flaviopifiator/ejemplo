package laboratorio;

import exception.EmpleadoNoExisteException;
import exception.IngresoNegativoException;
import exception.MenorDeEdadException;
import exception.FaltanDatosException;
import exception.EmpleadoYaEstaException;
import exception.JefeYaEstaException;
import exception.SinSeleccionException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class NominaEmpleado {
    ArrayList<Empleado> empleados = new ArrayList();
    
    
    public void agregarAdminOpeJefe
    (String d, String a, String n, String dom, Fecha f, Fecha ing, String leg, char s, String ar, int cargo, int pos)
    throws EmpleadoYaEstaException, FaltanDatosException, MenorDeEdadException, NumberFormatException, IngresoNegativoException, JefeYaEstaException, EmpleadoNoExisteException{
        if(d.isEmpty()||a.isEmpty()||n.isEmpty()||dom.isEmpty()||leg.isEmpty()||
        ar.isEmpty()||f.getDia()==0||f.getMes()==0||f.getAño()==0
        ||ing.getDia()==0||ing.getMes()==0||ing.getAño()==0)
            throw new FaltanDatosException("NominaEmpleado - agregarAdminOpeJefe");
        if(f.años()<18)
            throw new MenorDeEdadException();
        if(ing.años()<0||ing.años()>80)
            throw new IngresoNegativoException("NominaEmpleado - agregarAdminOpeJefe");
        if(pos == -1){
            for(Empleado e: empleados){
                Empleado emp = (Empleado) e;
                if(emp.getDni().equals(d))
                    throw new EmpleadoYaEstaException();
                if(e instanceof JefeDeArea){
                    JefeDeArea jefe = (JefeDeArea) e;
                    if(cargo == 2 && jefe.getArea().toLowerCase().equals(ar.toLowerCase()))
                        throw new JefeYaEstaException();
                }
            }
            switch (cargo){
                case 0:
                    empleados.add(new Administrativo(d, a, n, dom, f, ing, leg, "Administrativo", s, ar));
                    break;
                case 1:
                    empleados.add(new Operario(d, a, n, dom, f, ing, leg, "Operario", s, ar));
                    break;
                case 2:
                    empleados.add(new JefeDeArea(d, a, n, dom, f, ing, leg, "Jefe de área", s, ar));
                    break;
            }
            JOptionPane.showMessageDialog(null,"Empleado agregado","Mensaje",JOptionPane.PLAIN_MESSAGE);
        } else {
            if(pos>empleados.size()||pos<0)
                throw new EmpleadoNoExisteException("NominaEmpleado - agregarAdminOpeJefe");
            switch (cargo){
                case 0:
                    empleados.add(pos, new Administrativo(d, a, n, dom, f, ing, leg, "Administrativo", s, ar));
                    break;
                case 1:
                    empleados.add(pos, new Operario(d, a, n, dom, f, ing, leg, "Operario", s, ar));
                    break;
                case 2:
                    empleados.add(pos, new JefeDeArea(d, a, n, dom, f, ing, leg, "Jefe de área", s, ar));
                    break;
            }
        }
            
        
    }
    public void agregarGerente
    (String d, String a, String n, String dom, Fecha f, Fecha ing, String leg, char s, int pos)
    throws EmpleadoYaEstaException, FaltanDatosException, MenorDeEdadException, NumberFormatException, IngresoNegativoException, EmpleadoNoExisteException{
        if(d.isEmpty()||a.isEmpty()||n.isEmpty()||dom.isEmpty()||leg.isEmpty()
        ||f.getDia()==0||f.getMes()==0||f.getAño()==0
        ||ing.getDia()==0||ing.getMes()==0||ing.getAño()==0)
            throw new FaltanDatosException("NominaEmpelado - agregarGerente");
        if(f.años()<18)
            throw new MenorDeEdadException();
        if(ing.años()<0||ing.años()>80)
            throw new IngresoNegativoException("NominaEmpelado - agregarGerente");
        if (pos == -1){
            for(Empleado e: empleados){
                Empleado emp = (Empleado) e;
                if(emp.getDni().equals(d))
                    throw new EmpleadoYaEstaException();
            }
            empleados.add(new Gerente(d, a, n, dom, f, ing, leg, "Gerente", s));
            JOptionPane.showMessageDialog(null,"Empleado agregado","Mensaje",JOptionPane.PLAIN_MESSAGE);
        } else {
            if(pos>empleados.size()||pos<0)
                throw new EmpleadoNoExisteException("NominaEmpleado - agregarGerente");
            empleados.add(pos, new Gerente(d, a, n, dom, f, ing, leg, "Gerente", s));
        }
    }
    public void agregarVendedor
    (String d, String a, String n, String dom, Fecha f, Fecha ing, String leg, char s, int suc, float por, int pos)
    throws EmpleadoYaEstaException, FaltanDatosException, MenorDeEdadException, NumberFormatException, IngresoNegativoException, EmpleadoNoExisteException{
        if(d.isEmpty()||a.isEmpty()||n.isEmpty()||dom.isEmpty()||leg.isEmpty()||
        suc==0||por==0||f.getDia()==0||f.getMes()==0||f.getAño()==0
        ||ing.getDia()==0||ing.getMes()==0||ing.getAño()==0
        ||suc==0||por==0)
            throw new FaltanDatosException("NominaEmpleado - agregarVendedor");        
        if(f.años()<18)
            throw new MenorDeEdadException();
        if(ing.años()<0||ing.años()>80)
            throw new IngresoNegativoException("NominaEmpleado - agregarVendedor");
        if (pos == -1){
            for(Empleado e: empleados){
                Empleado emp = (Empleado) e;
                if(emp.getDni().equals(d))
                    throw new EmpleadoYaEstaException();
            }
            empleados.add(new Vendedor(d, a, n, dom, f, ing, leg, "Vendedor", s, suc, por));
            JOptionPane.showMessageDialog(null,"Empleado agregado","Mensaje",JOptionPane.PLAIN_MESSAGE);
        } else {
            if(pos>empleados.size()||pos<0)
                throw new EmpleadoNoExisteException("NominaEmpleado - agregarAdminOpeJefe");
            empleados.add(pos, new Vendedor(d, a, n, dom, f, ing, leg, "Vendedor", s, suc, por));
        }
    }
    public void agregarPariente(String d, String a, String n, String dom, Fecha f, char s, String r, int i){
        empleados.get(i).agregarPariente(d, a, n, dom, f, s, r);
    }
    public void eliminarEmpleado(int i) throws EmpleadoNoExisteException{
        try{
            int j = empleados.size();
            if (i>j || i<0)
                throw new EmpleadoNoExisteException("NominaEmpleado - eliminarEmpleado");
            if(empleados.get(i) instanceof Administrativo){
                Administrativo admin = (Administrativo) empleados.get(i);
                if(devolverJefe(admin.getArea())!=-1){
                    JefeDeArea jefe = (JefeDeArea) empleados.get(devolverJefe(admin.getArea()));
                    jefe.quitarEmpleado(admin);
                }
            }
            if(empleados.get(i) instanceof Operario){
                Operario ope = (Operario) empleados.get(i);
                if(devolverJefe(ope.getArea())!=-1){
                    JefeDeArea jefe = (JefeDeArea) empleados.get(devolverJefe(ope.getArea()));
                    jefe.quitarEmpleado(ope);
                }
            }    
            empleados.remove(i);
            JOptionPane.showMessageDialog(null, "El empledo ha sido eliminado","Mensaje",JOptionPane.PLAIN_MESSAGE);
        }catch(EmpleadoNoExisteException Ex){
            JOptionPane.showMessageDialog(null, "El empleado seleecionado no se encuentra en el listado","Error",JOptionPane.PLAIN_MESSAGE);
        }
    }
    public String buscarJefe(String area){
        String jefeDeArea, retorno = "";
        for(Empleado e: empleados){
            Empleado emp = (Empleado) e;
            if(e instanceof JefeDeArea){
                JefeDeArea jefe = (JefeDeArea) e;
                if(jefe.getArea().toLowerCase().equals(area.toLowerCase())){
                    jefeDeArea = jefe.getApellido()+", "+jefe.getNombre();
                    for(int i = 0; i<20&&i<jefeDeArea.length(); i++)
                        retorno += jefeDeArea.charAt(i);
                    return "Jefe: "+ retorno;
                }
            }
        }
        return "No hay Jefe de Area";
    }
    public int devolverJefe(String area){
        int i=0;
        for(Empleado e: empleados){
            if(empleados.get(i) instanceof JefeDeArea){
                JefeDeArea jefe = (JefeDeArea) e;
                if(jefe.getArea().toLowerCase().equals(area.toLowerCase()))
                    return i;
            }
            i++;
        }
        return -1;
    }
    public Object[][] empleadosSegunJefe(int i){
        JefeDeArea jefe;
        jefe = (JefeDeArea) empleados.get(i);
        return jefe.devolverEmpleadosACargo();
    }
    public Empleado empleadoSegunDni(String d){
        int i = 0;
        for(Empleado e: empleados){
            if(empleados.get(i).getDni().equals(d))
                return empleados.get(i);
        }
        return null;
    }
    public int devolverPosSegunDni(String d){
        int i = 0;
        for(Empleado e: empleados){
            if(e.getDni().equals(d))
                return i;
            i++;
        }
        return -1;
    }
    public Object[][] listarEmpleados(){
        int i=0;
        Object[][] datos = new Object[empleados.size()][7];
        for (Empleado e:empleados){
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
            datos[i][6] = "----------";
            if(empleados.get(i) instanceof Administrativo){
                Administrativo admin = (Administrativo) e;
                datos[i][6] = admin.getArea();
            }if(empleados.get(i) instanceof Operario){
                Operario ope = (Operario) e;
                datos[i][6] = ope.getArea();
            }if(empleados.get(i) instanceof JefeDeArea){
                JefeDeArea jefe = (JefeDeArea) e;
                datos[i][6] = jefe.getArea();
            }
            i++;
        }
        return datos;
    }
    public Object[][] listaEmpleadosDiferentesAlArea(String a){
        int i=0, j=0;
        String sexo = "";
        Administrativo admin;
        Operario ope;
        Object[][] datos = new Object[empleados.size()][7];
        for (Empleado e:empleados){
            if(empleados.get(j) instanceof Administrativo){
                admin = (Administrativo) empleados.get(j);
                if(!admin.getArea().toLowerCase().equals(a.toLowerCase())){
                    datos[i][0] = admin.getApellido()+", "+admin.getNombre();
                    datos[i][1] = admin.getDni();
                    if(admin.getSexo()=='m')
                        sexo="Masculino";
                    else
                        sexo="Femenino";
                    datos[i][2] = sexo;
                    datos[i][3] = admin.getEdad();
                    datos[i][4] = admin.getFechaIngreso();
                    datos[i][5] = admin.getCargo();
                    datos[i][6] = admin.getArea();
                    i++;
                }
            } if(empleados.get(j) instanceof Operario){
                ope = (Operario) empleados.get(j);
                if(!ope.getArea().toLowerCase().equals(a.toLowerCase())){
                    datos[i][0] = ope.getApellido()+", "+ope.getNombre();
                    datos[i][1] = ope.getDni();
                    if(ope.getSexo()=='m')
                        sexo="Masculino";
                    else
                        sexo="Femenino";
                    datos[i][2] = sexo;
                    datos[i][3] = ope.getEdad();
                    datos[i][4] = ope.getFechaIngreso();
                    datos[i][5] = ope.getCargo();
                    datos[i][6] = ope.getArea();
                    i++;
                }
            } 
            j++;
        }
        return datos;
    }
    public Object[][] segunApellido(String a){
        int i=0, j=0;
        Object[][] datos = new Object[empleados.size()][7];
        if(!a.isEmpty())
            for (Empleado e:empleados){
                if(empleados.get(i).getApellido().toLowerCase().indexOf(a.toLowerCase())==0){
                    String sexo;
                    if(empleados.get(i).getSexo()=='m')
                        sexo="Masculino";
                    else
                        sexo="Femenino";
                    datos[j][0] = empleados.get(i).getApellido()+", "+empleados.get(i).getNombre();
                    datos[j][1] = empleados.get(i).getDni();
                    datos[j][2] = sexo;
                    datos[j][3] = empleados.get(i).getEdad();
                    datos[j][4] = empleados.get(i).getFechaIngreso();
                    datos[j][5] = empleados.get(i).getCargo();
                    datos[j][6] = "------------";
                    if(empleados.get(i) instanceof Administrativo){
                        Administrativo admin = (Administrativo) e;
                        datos[j][6] = admin.getArea();
                    }if(empleados.get(i) instanceof Operario){
                        Operario ope = (Operario) e;
                        datos[j][6] = ope.getArea();
                    }if(empleados.get(i) instanceof JefeDeArea){
                        JefeDeArea jefe = (JefeDeArea) e;
                        datos[j][6] = jefe.getArea();
                    }
                    j++;
                }
                i++;
            }
        return datos;
    }
    public Object[][] segunDni(String a){
        int i=0, j=0;
        Object[][] datos = new Object[empleados.size()][7];
        if(!a.isEmpty())
            for (Empleado e:empleados){
                Empleado emp = (Empleado) e;
                if(emp.getDni().indexOf(a)==0){
                    String sexo;
                    if(emp.getSexo()=='m')
                        sexo="Masculino";
                    else
                        sexo="Femenino";
                    datos[j][0] = emp.getApellido()+", "+emp.getNombre();
                    datos[j][1] = emp.getDni();
                    datos[j][2] = sexo;
                    datos[j][3] = emp.getEdad();
                    datos[j][4] = emp.getFechaIngreso();
                    datos[j][5] = emp.getCargo();
                    datos[j][6] = "------------";
                    if(empleados.get(i) instanceof Administrativo){
                        Administrativo admin = (Administrativo) e;
                        datos[j][6] = admin.getArea();
                    }if(empleados.get(i) instanceof Operario){
                        Operario ope = (Operario) e;
                        datos[j][6] = ope.getArea();
                    }if(empleados.get(i) instanceof JefeDeArea){
                        JefeDeArea jefe = (JefeDeArea) e;
                        datos[j][6] = jefe.getArea();
                    }
                    j++;
                }
            }
        return datos;
    }
    public Object[][] segunLegajo(String a){
        int i=0, j=0;
        Object[][] datos = new Object[empleados.size()][7];
        if(!a.isEmpty())
            for (Empleado e:empleados){
                Empleado emp = (Empleado) e;
                if(empleados.get(i).getLegajo().toLowerCase().indexOf(a.toLowerCase())==0){
                    String sexo;
                    if(empleados.get(i).getSexo()=='m')
                        sexo="Masculino";
                    else
                        sexo="Femenino";
                    datos[j][0] = emp.getApellido()+", "+emp.getNombre();
                    datos[j][1] = emp.getDni();
                    datos[j][2] = sexo;
                    datos[j][3] = emp.getEdad();
                    datos[j][4] = emp.getFechaIngreso();
                    datos[j][5] = emp.getCargo();
                    datos[j][6] = "------------";
                    if(empleados.get(i) instanceof Administrativo){
                        Administrativo admin = (Administrativo) e;
                        datos[j][6] = admin.getArea();
                    }if(empleados.get(i) instanceof Operario){
                        Operario ope = (Operario) e;
                        datos[j][6] = ope.getArea();
                    }if(empleados.get(i) instanceof JefeDeArea){
                        JefeDeArea jefe = (JefeDeArea) e;
                        datos[j][6] = jefe.getArea();
                    }
                    j++;
                }
            i++;
            }
        return datos;
    }
    public Object[][] segunArea(String a){
        int i=0;
        String sexo = "";
        Administrativo admin;
        Operario ope;
        JefeDeArea jefe;
        Object[][] datos = new Object[empleados.size()][7];
        if(!a.isEmpty())
            for (Empleado e:empleados){    
                if(e instanceof Administrativo){
                    admin = (Administrativo) e;
                    if(admin.getArea().toLowerCase().indexOf(a.toLowerCase())==0){
                        datos[i][0] = admin.getApellido()+", "+admin.getNombre();
                        datos[i][1] = admin.getDni();
                        if(admin.getSexo()=='m')
                            sexo="Masculino";
                        else
                            sexo="Femenino";
                        datos[i][2] = sexo;
                        datos[i][3] = admin.getEdad();
                        datos[i][4] = admin.getFechaIngreso();
                        datos[i][5] = admin.getCargo();
                        datos[i][6] = admin.getArea();
                        i++;
                    }
                } 
                if(e instanceof Operario){
                    ope = (Operario) e;
                    if(ope.getArea().toLowerCase().indexOf(a.toLowerCase())==0){
                        datos[i][0] = ope.getApellido()+", "+ope.getNombre();
                        datos[i][1] = ope.getDni();
                        if(ope.getSexo()=='m')
                            sexo="Masculino";
                        else
                            sexo="Femenino";
                        datos[i][2] = sexo;
                        datos[i][3] = ope.getEdad();
                        datos[i][4] = ope.getFechaIngreso();
                        datos[i][5] = ope.getCargo();
                        datos[i][6] = ope.getArea();
                        i++;
                    }
                } 
                if(e instanceof JefeDeArea){
                    jefe = (JefeDeArea) e;
                    if(jefe.getArea().toLowerCase().indexOf(a.toLowerCase())==0){
                        datos[i][0] = jefe.getApellido()+", "+jefe.getNombre();
                        datos[i][1] = jefe.getDni();
                        if(jefe.getSexo()=='m')
                            sexo="Masculino";
                        else
                            sexo="Femenino";
                        datos[i][2] = sexo;
                        datos[i][3] = jefe.getEdad();
                        datos[i][4] = jefe.getFechaIngreso();
                        datos[i][5] = jefe.getCargo();
                        datos[i][6] = jefe.getArea();
                        i++;
                    }
                }

            }
        return datos;
    }
    public Object[][] segunCargo(String a){
        int i=0, j=0;
        Object[][] datos = new Object[empleados.size()][7];
        if(!a.isEmpty())
            for (Empleado e:empleados){
                Empleado emp = (Empleado) e;
                if(empleados.get(i).getCargo().toLowerCase().indexOf(a.toLowerCase())==0){
                    String sexo;
                    if(empleados.get(i).getSexo()=='m')
                        sexo="Masculino";
                    else
                        sexo="Femenino";
                    datos[j][0] = emp.getApellido()+", "+emp.getNombre();
                    datos[j][1] = emp.getDni();
                    datos[j][2] = sexo;
                    datos[j][3] = emp.getEdad();
                    datos[j][4] = emp.getFechaIngreso();
                    datos[j][5] = emp.getCargo();
                    datos[j][6] = "------------";
                    if(empleados.get(i) instanceof Administrativo){
                        Administrativo admin = (Administrativo) e;
                        datos[j][6] = admin.getArea();
                    }if(empleados.get(i) instanceof Operario){
                        Operario ope = (Operario) e;
                        datos[j][6] = ope.getArea();
                    }if(empleados.get(i) instanceof JefeDeArea){
                        JefeDeArea jefe = (JefeDeArea) e;
                        datos[j][6] = jefe.getArea();
                    }
                    j++;
                }
                i++;
            }
        return datos;
    }
    public Object[][] ultimosCinco(){
        int i=0;
        Object[][] datos = new Object[empleados.size()][7];
        if(empleados.size()<6)
            for (Empleado e:empleados){
                Empleado emp = (Empleado) e;
                String sexo;
                if(empleados.get(i).getSexo()=='m')
                    sexo="Masculino";
                else
                    sexo="Femenino";
                datos[i][0] = emp.getApellido()+", "+emp.getNombre();
                datos[i][1] = emp.getDni();
                datos[i][2] = sexo;
                datos[i][3] = emp.getEdad();
                datos[i][4] = emp.getFechaIngreso();
                datos[i][5] = emp.getCargo();
                datos[i][6] = "------------";
                if(empleados.get(i) instanceof Administrativo){
                    Administrativo admin = (Administrativo) e;
                    datos[i][6] = admin.getArea();
                }if(empleados.get(i) instanceof Operario){
                    Operario ope = (Operario) e;
                    datos[i][6] = ope.getArea();
                }if(empleados.get(i) instanceof JefeDeArea){
                    JefeDeArea jefe = (JefeDeArea) e;
                    datos[i][6] = jefe.getArea();
                }
                i++;
        } else {            
            i=empleados.size()-5;
            for (Empleado e:empleados){
                Empleado emp = (Empleado) e;
                if (i==empleados.size())
                    break;
                String sexo;
                if(empleados.get(i).getSexo()=='m')
                    sexo="Masculino";
                else
                    sexo="Femenino";
                datos[i][0] = emp.getApellido()+", "+emp.getNombre();
                datos[i][1] = emp.getDni();
                datos[i][2] = sexo;
                datos[i][3] = emp.getEdad();
                datos[i][4] = emp.getFechaIngreso();
                datos[i][5] = emp.getCargo();
                datos[i][6] = "------------";
                if(empleados.get(i) instanceof Administrativo){
                    Administrativo admin = (Administrativo) e;
                    datos[i][6] = admin.getArea();
                }if(empleados.get(i) instanceof Operario){
                    Operario ope = (Operario) e;
                    datos[i][6] = ope.getArea();
                }if(empleados.get(i) instanceof JefeDeArea){
                    JefeDeArea jefe = (JefeDeArea) e;
                    datos[i][6] = jefe.getArea();
                }
                i++;
            }
        }
        return datos;
    }
    public int devolverSegunDni(String d) throws EmpleadoNoExisteException{
        try{
            int i=0;
            for (Empleado e :empleados){
                if(e.getDni().equals(d))
                    return i;
                i++;                   
            }
            throw new EmpleadoNoExisteException("NominaEmpleados - devolverSegunDni");
        }catch(EmpleadoNoExisteException Ex){
            JOptionPane.showMessageDialog(null, "El empleado seleecionado no se encuentra en el listado","Error",JOptionPane.PLAIN_MESSAGE);
        }
        return -1;
    }
    public void modificarArea(int tipo, String a, int emp){
        switch(tipo){
            case 0:
                Administrativo admin;
                admin = (Administrativo) empleados.get(emp);
                if(devolverJefe(admin.getArea())!=-1){
                    JefeDeArea jefe2;
                    jefe2 = (JefeDeArea) empleados.get(devolverJefe(admin.getArea()));
                    jefe2.quitarEmpleado(admin);
                }if(devolverJefe(a)!=-1){
                    JefeDeArea jefe;
                    jefe = (JefeDeArea) empleados.get(devolverJefe(a));
                    jefe.empleadoEnArea(admin);
                }
                admin.setArea(a); break;
            case 1:
                Operario ope;
                ope = (Operario) empleados.get(emp);
                if(devolverJefe(ope.getArea())!=-1){
                    JefeDeArea jefe2;
                    jefe2 = (JefeDeArea) empleados.get(devolverJefe(ope.getArea()));
                    jefe2.quitarEmpleado(ope);
                }if(devolverJefe(a)!=-1){
                    JefeDeArea jefe;
                    jefe = (JefeDeArea) empleados.get(devolverJefe(a));
                    jefe.empleadoEnArea(ope);
                }
                ope.setArea(a); break;
        }
    }
    public void jefeNuevo(JefeDeArea jefe){
        for(Empleado e: empleados){
            if(e instanceof Administrativo){
                Administrativo admin;
                admin = (Administrativo) e;
                if(admin.getArea().equals(jefe.getArea()))
                    jefe.empleadosAJefeNuevo(admin);                    
            }
            if(e instanceof Operario){
                Operario ope;
                ope = (Operario) e;
                if(ope.getArea().equals(jefe.getArea()))
                    jefe.empleadosAJefeNuevo(ope);
            }
        }
    }
    public int devolverCargo(int i){
        int c=-1;
        switch (empleados.get(i).getCargo()){
            case "Administrativo":
                c = 0; break;
            case "Operario":
                c = 1; break;
            case "Jefe de área":
                c = 2; break;
            case "Gerente":
                c = 3; break;
            case "Vendedor":
                c = 4; break;                 
        }
        return c;
    }
    public void setDniSinRepetir(String d, int i) throws EmpleadoYaEstaException{
        for(Empleado e: empleados)
            if(e.getDni().equals(d))
                throw new EmpleadoYaEstaException();
        empleados.get(i).setDni(d);
    }
    public void quitarSegunPos(int pos) throws EmpleadoNoExisteException{
        if(pos>empleados.size()||pos<0)
            throw new EmpleadoNoExisteException("NominaEmpleado - quitarSegunPos");
        empleados.remove(pos);
    }
    public boolean sinSeleccionException(int i) throws SinSeleccionException, NullPointerException{
        try{
            if(i==(-1))
                throw new SinSeleccionException();
            return true;
        }catch(SinSeleccionException Ex){
            JOptionPane.showMessageDialog(null, "No se seleccionó ningún empleado","Error",JOptionPane.PLAIN_MESSAGE);
            return false;
        }catch(NullPointerException Ex){
            JOptionPane.showMessageDialog(null, "No se seleccionó ningún empleado","Error",JOptionPane.PLAIN_MESSAGE);
            return false;
        }
    }
}
