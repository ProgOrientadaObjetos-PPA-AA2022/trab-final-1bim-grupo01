/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

/**
 *
 * @author grupo01
 */
public class Propietario {
    
    private String nombre;
    private String apellido;
    private int identificacion;

    public Propietario(String n, String a, int id) {
        nombre = n;
        apellido = a;
        identificacion = id;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public int obtenerIdentificacion() {
        return identificacion;
    }
}
