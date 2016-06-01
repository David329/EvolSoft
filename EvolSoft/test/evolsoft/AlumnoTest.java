/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evolsoft;

import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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

    @Test
    public void DBEnterosIguales() {
        Connection cn = null;
        int expResult = 4;
        int result = 0;
        try {
            System.out.println("DBEnterosIguales");

            cn = AccesoDB.getConnection();
            StringBuilder query = new StringBuilder();
            query.append("SELECT a FROM Enteros WHERE a=?");
            PreparedStatement ps = cn.prepareStatement(query.toString());
            ps.setInt(1, 4);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                result = rs.getInt(1);
            }

        } catch (SQLException ex) {
            throw new RuntimeException(ex.getMessage());
        } catch (Exception e) {
            throw new RuntimeException("No se tiene acceso al servidor");
        } finally {
            try {
                if (cn != null) {
                    assertEquals(expResult, result, 0.0);
                    cn.close();
                }
            } catch (Exception ex) {
            }
        }
    }

    @Test
    public void DBEnterosDiferentes() {
        Connection cn = null;
        int expResult = 0;
        int result = 0;
        try {
            System.out.println("DBEnterosDiferentes");

            cn = AccesoDB.getConnection();
            StringBuilder query = new StringBuilder();
            query.append("SELECT a FROM Enteros WHERE a=?");
            PreparedStatement ps = cn.prepareStatement(query.toString());
            ps.setInt(1, 4);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                result = rs.getInt(1);
            }

        } catch (SQLException ex) {
            throw new RuntimeException(ex.getMessage());
        } catch (Exception e) {
            throw new RuntimeException("No se tiene acceso al servidor");
        } finally {
            try {
                if (cn != null) {
                    assertEquals(expResult, result, 0.0);
                    cn.close();
                }
            } catch (Exception ex) {
            }
        }
    }

    @Test
    public void DBTextoIgual() {
        Connection cn = null;
        String expResult = "hola";
        String result = "";
        try {
            System.out.println("DBTextoIgual");

            cn = AccesoDB.getConnection();
            StringBuilder query = new StringBuilder();
            query.append("SELECT b FROM Strings WHERE b=?");
            PreparedStatement ps = cn.prepareStatement(query.toString());
            ps.setString(1, "hola");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                result = rs.getString(1);
            }

        } catch (SQLException ex) {
            throw new RuntimeException(ex.getMessage());
        } catch (Exception e) {
            throw new RuntimeException("No se tiene acceso al servidor");
        } finally {
            try {
                if (cn != null) {
                    assertEquals(expResult, result);
                    cn.close();
                }
            } catch (Exception ex) {
            }
        }
    }

    @Test
    public void DBTextoDiferente() {
        Connection cn = null;
        String expResult = "hello";
        String result = "";
        try {
            System.out.println("DBTextoDiferente");

            cn = AccesoDB.getConnection();
            StringBuilder query = new StringBuilder();
            query.append("SELECT b FROM Strings WHERE b=?");
            PreparedStatement ps = cn.prepareStatement(query.toString());
            ps.setString(1, "hola");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                result = rs.getString(1);
            }

        } catch (SQLException ex) {
            throw new RuntimeException(ex.getMessage());
        } catch (Exception e) {
            throw new RuntimeException("No se tiene acceso al servidor");
        } finally {
            try {
                if (cn != null) {
                    assertEquals(expResult, result);
                    cn.close();
                }
            } catch (Exception ex) {
            }
        }
    }

    @Test
    public void DBDecimalIguales() {
        Connection cn = null;
        double expResult = 10.53;
        double result = 0.0;
        try {
            System.out.println("DBDecimalIguales");

            cn = AccesoDB.getConnection();
            StringBuilder query = new StringBuilder();
            query.append("SELECT c FROM Decimal WHERE c=?");
            PreparedStatement ps = cn.prepareStatement(query.toString());
            ps.setDouble(1, 10.53);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                result = rs.getDouble(1);
            }

        } catch (SQLException ex) {
            throw new RuntimeException(ex.getMessage());
        } catch (Exception e) {
            throw new RuntimeException("No se tiene acceso al servidor");
        } finally {
            try {
                if (cn != null) {
                    assertEquals(expResult, result, 0.0);
                    cn.close();
                }
            } catch (Exception ex) {
            }
        }
    }

    @Test
    public void DBDecimalDiferentes() {
        Connection cn = null;
        double expResult = 11.53;
        double result = 0.0;
        try {
            System.out.println("DBDecimalDiferentes");

            cn = AccesoDB.getConnection();
            StringBuilder query = new StringBuilder();
            query.append("SELECT c FROM Decimal WHERE c=?");
            PreparedStatement ps = cn.prepareStatement(query.toString());
            ps.setDouble(1, 10.53);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                result = rs.getDouble(1);
            }

        } catch (SQLException ex) {
            throw new RuntimeException(ex.getMessage());
        } catch (Exception e) {
            throw new RuntimeException("No se tiene acceso al servidor");
        } finally {
            try {
                if (cn != null) {
                    assertEquals(expResult, result, 0.0);
                    cn.close();
                }
            } catch (Exception ex) {
            }
        }
    }
}
