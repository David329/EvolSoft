/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evolsoft;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author davidwesker
 */
public class AlumnoTest {

    @Test
    public void TextNumericoIguales() {
        Alumno David = new Alumno();
        System.out.println("TextNumericoIguales");
        double expResult = 18.5;
        double result = David.HallarPromedio();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void TextNumericoDiferentes() {
        Alumno David = new Alumno();
        System.out.println("TextNumericoDiferentes");
        double expResult = 13.22;
        double result = David.HallarPromedio();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void TestTextoIguales() {
        Alumno David = new Alumno();
        System.out.println("TestTextoIguales");
        String expResult = "David";
        String result = David.MiNombre();
        assertEquals(expResult, result);
    }

    @Test
    public void TestTextoDiferentes() {
        Alumno David = new Alumno();
        System.out.println("TestTextoDiferentes");
        String expResult = "Dave";
        String result = David.MiNombre();
        assertEquals(expResult, result);
    }

    @Test
    public void TestBooleanIguales() {
        Alumno David = new Alumno();
        System.out.println("TestBooleanIguales");
        boolean expResult = true;
        boolean result = David.Resultado();
        assertEquals(expResult, result);
    }

    @Test
    public void TestBooleanDiferentes() {
        Alumno David = new Alumno();
        System.out.println("TestBooleanDiferentes");
        boolean expResult = false;
        boolean result = David.Resultado();
        assertEquals(expResult, result);
    }

    @Test
    public void TestObjetoIguales() {
        Alumno David = new Alumno();
        System.out.println("TestObjetoIguales");
        Object expResult = David;
        Object result = David.retornarDavid(David);
        assertEquals(expResult, result);
    }

    @Test
    public void TestObjetoDiferentes() {
        Alumno David = new Alumno();
        System.out.println("TestObjetoDiferentes");
        Object expResult = null;
        Object result = David.retornarDavid(David);
        assertEquals(expResult, result);
    }

    @Test
    public void TestListasIguales() {
        Alumno David = new Alumno();
        List<Alumno> lstAlumno = new ArrayList<Alumno>();

        Alumno al1 = new Alumno();
        Alumno al2 = new Alumno();
        lstAlumno.add(al1);
        lstAlumno.add(al2);
        System.out.println("TestListasIguales");
        Object expResult = lstAlumno;
        Object result = David.retornarLista(lstAlumno);
        assertEquals(expResult, result);
    }

    @Test
    public void TestListasDiferentes() {
        Alumno David = new Alumno();
        List<Alumno> lstAlumno = new ArrayList<Alumno>();

        Alumno al1 = new Alumno();
        Alumno al2 = new Alumno();
        lstAlumno.add(al1);
        lstAlumno.add(al2);
        System.out.println("TestListasDiferentes");
        Object expResult = null;
        Object result = David.retornarLista(lstAlumno);
        assertEquals(expResult, result);
    }

    @Test
    public void TestException1Division() {
        Alumno David = new Alumno();
        David.Exception1Division();
    }

    @Test
    public void TestException2Conversion() {
        Alumno David = new Alumno();
        David.Exception2Conversion();
    }
}
