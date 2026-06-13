/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.time.LocalDate;
import modelo.Ciudadano;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Gonzalo Achucarro
 */
public class CiudadanoTest {
    
    private static Ciudadano ciu;
    private static int contadorTest = 0;

    @BeforeClass
    public static void antesDeTodo(){
        ciu = new Ciudadano("Anonimus", 1212);
        System.out.println("INGRESO de ciudadano del bien");
    }

    @AfterClass
    public static void despuesDeTodo(){
        LocalDate ayer = LocalDate.now().minusDays(1);
        System.out.println(ayer + " - Baches reparados, Ciudadanos Felices");
    }

    @Before
    public void setUp(){
        contadorTest++;
        System.out.println("----------------------------------------");
        System.out.println("Iniciando Test NUmero: " + contadorTest);
    }

    @After
    public void tearDown(){
        System.out.println("----------------------------------------");
    }

    @Test
    public void testValidarUsr(){
        System.out.println("Ejecutando: testValidarUsr()");
        int contra = 123456;
        boolean resultado = ciu.validarIngreso(contra);
        assertTrue("La contraseña no coincide, acceso denegado", resultado); 
    }

    @Test
    public void testValidarEmail(){
        System.out.println("Ejecutando: testValidarEmail()");
        String email = "vecino@sanluis.com";
        
        boolean tieneArroba = email.contains("@");
        boolean tienePunto = email.contains(".");
        boolean longitudCorrecta = email.length() < 20;
        
        boolean resultado = tieneArroba && tienePunto && longitudCorrecta;
        assertTrue(resultado);
    }

    @Test
    public void testCambioPass(){
        System.out.println("Ejecutando: testCambioPass()");
        String newPass = "1234";
        ciu.cambioPassword(newPass);
        
        assertEquals(1234, ciu.getContraseña()); 
        System.out.println("Cambio verificado con exito.");
    }

    @Test(timeout = 30)
    public void testDelay() throws InterruptedException{
        System.out.println("Ejecutando: testDelay()");
        ciu.delay(45);
    }

    @Test
    public void testCiudadanosDiferentes(){
        System.out.println("Ejecutando: testCiudadanosDiferentes()");
        Ciudadano c1 = new Ciudadano("Juan", 5555);
        Ciudadano c2 = new Ciudadano("Pedro", 9999);
        
        assertNotSame("misma persona", c1, c2); 
    }
    
    
}
