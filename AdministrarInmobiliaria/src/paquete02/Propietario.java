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
public class Propietario implements Serializable {

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

    /**
     *
     * @return
     */
    public String obtenerIdentificacion() {
        return identificacion;
    }

    @Override
    public String toString() {
        String cadena = String.format("Propietario\nNombre: %s\nApellido: %s\n"
                + "Identificacion: %s\n", nombre,apellido,identificacion);
        return cadena;
    }
}
