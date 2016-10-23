/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package laboratorio;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Cusipuma Santiago
 */
public class NominaEmpleadoTest {
    
    public NominaEmpleadoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of agregarAdminOpeJefe method, of class NominaEmpleado.
     */
    @Test
    public void agregarYDevolverEmpleadosTest(){
        NominaEmpleado nomina = new NominaEmpleado();
        Administrativo admin =new Administrativo("123321", "apellidoAlguien", "nombreAlguien", "algunaDireccion", new Fecha(12, 10, 1995), new Fecha(20,11,2014), "123", "Administrativo", 'm', "galleta");
        nomina.empleados.add(admin);
        assertEquals(admin,nomina.empleadoSegunDni("123321") );
    }
    
    @Test
    public void deolverPosicionSegunDNITest(){
        NominaEmpleado nomina = new NominaEmpleado();
        Administrativo admin =new Administrativo("123321", "apellidoAlguien", "nombreAlguien", "algunaDireccion", new Fecha(12, 10, 1995), new Fecha(20,11,2014), "123", "Administrativo", 'm', "galleta");
        nomina.empleados.add(admin);
        assertEquals(0,nomina.devolverSegunDni("123321"));
    }
    
    @Test
    public void devolverPosicionJefeDeAreaPorNombreDeAreaTest(){
        NominaEmpleado nomina = new NominaEmpleado();
        JefeDeArea jefe = new JefeDeArea("321", "AlgunApellido", "AlgunNombre", "AlgunDomicilio",new Fecha(12, 10, 1995), new Fecha(20,11,2014), "123456789", "Jefe de área", 'm', "galleta");
        nomina.empleados.add(jefe);
        assertEquals(0,nomina.devolverJefe("galleta"));
    }
    
    @Test
    public void agregarEmpleadoAJefeDeAreaTest(){
        JefeDeArea jefe = new JefeDeArea("321", "AlgunApellido", "AlgunNombre", "AlgunDomicilio",new Fecha(12, 10, 1995), new Fecha(20,11,2014), "123456789", "Jefe de área", 'm', "galleta");
        Administrativo admin =new Administrativo("123321", "apellidoAlguien", "nombreAlguien", "algunaDireccion", new Fecha(12, 10, 1995), new Fecha(20,11,2014), "123", "Administrativo", 'm', "galleta");
        jefe.empleadoEnArea(admin);
        assertFalse(jefe.empleados.isEmpty());
        jefe.quitarEmpleado(admin);
        assertTrue(jefe.empleados.isEmpty());
        
    }
    
    @Test
    public void cambiarAreaTest(){
            NominaEmpleado nomina = new NominaEmpleado();
            JefeDeArea jefe = new JefeDeArea("321", "AlgunApellido", "AlgunNombre", "AlgunDomicilio",new Fecha(12, 10, 1995), new Fecha(20,11,2014), "123456789", "Jefe de área", 'm', "galleta");
            Administrativo admin =new Administrativo("123321", "apellidoAlguien", "nombreAlguien", "algunaDireccion", new Fecha(12, 10, 1995), new Fecha(20,11,2014), "123", "Administrativo", 'm', "galleta");
            nomina.empleados.add(jefe);
            nomina.empleados.add(admin);
            jefe.empleadoEnArea(admin);
            nomina.modificarArea(0, "areaAlguna", nomina.devolverSegunDni("123321"));
            assertTrue(jefe.empleados.isEmpty());
            
            
    }
    
}
