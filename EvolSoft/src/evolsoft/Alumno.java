/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evolsoft;

import java.util.List;

/**
 *
 * @author davidwesker
 */
public class Alumno {

    private String Nombre;
    private double Nota1;
    private double Nota2;
    private double Promedio;
    private boolean Aprobado;
    public Alumno()
    {
        Nombre="David";Nota1=17.5;Nota2=19.5;
    }
    public double HallarPromedio() {
        return Promedio = (Nota1 + Nota2) / 2;
    }

    public String MiNombre() {
        return Nombre;
    }

    public boolean Resultado() {
        Promedio = (Nota1 + Nota2) / 2;
        if (Promedio < 13) {
            Aprobado = false;
        } else {
            Aprobado = true;
        }
        return Aprobado;
    }

    public Alumno retornarDavid(Alumno David) {
        return David;
    }

    public List<Alumno> retornarLista(List<Alumno> LstAlumnos) {
        return LstAlumnos;
    }

    public void Exception1Division() {
        try {
            int a = 0, b = 0, c;
            c = a / b;
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }
    public void Exception2Conversion() {
        Object o=null;
        try {
            int i=(int)o;
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }
}
