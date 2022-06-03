/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.io.Serializable;

/**
 *
 * @author grupo01
 */
public class Propietario implements Serializable{
    
    private String nombre;
    private String apellido;
    private String identificacion;

    public Propietario(String n, String a, String id) {
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

    public String obtenerIdentificacion() {
        return identificacion;
    }
}
