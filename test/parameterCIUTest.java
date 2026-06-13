/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Arrays;
import java.util.Collection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author Gonzalo Achucarro
 */
@RunWith(value = Parameterized.class)
public class parameterCIUTest {
    private String emailInput;
    private boolean resultadoEsperado;

    public parameterCIUTest(String emailInput, boolean resultadoEsperado) {
        this.emailInput = emailInput;
        this.resultadoEsperado = resultadoEsperado;
    }

    @Parameters
    public static Collection<Object[]> tomarDatos(){
        return Arrays.asList(new Object[][]{
            {"jorgesys@tototita.com", true},
            {"jorgesys@tototitacom", false},
            {"jorgesystototita.com", false},
            {"@jorgesystototita.com", false},
            {".jorgesystototita@com", false}
        });
    }

    public static boolean validarMail(String email) {
        Pattern pattern = Pattern.compile("^[A-Za-z0-9-\\+]+(\\.[A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9+]+)*(\\.[A-Za-z]{2,})$"); // [cite: 103, 104]
        Matcher matcher = pattern.matcher(email);
        return matcher.find();
    }

    @Test
    public void testValidarEmailParametrizado() {
        System.out.println("Evaluando ciclicamente correo: " + emailInput);
        boolean resultadoReal = validarMail(emailInput);
        
        assertEquals("Fallo el patron regex en: " + emailInput, resultadoEsperado, resultadoReal);
    }
    
    
}
