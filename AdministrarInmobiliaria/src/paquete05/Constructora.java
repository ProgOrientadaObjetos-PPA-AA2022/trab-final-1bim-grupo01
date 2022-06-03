/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete05;

import java.io.Serializable;

/**
 *
 * @author grupo01
 */
public class Constructora implements Serializable{
    private String nombre;
    private String id;

    public Constructora(String n, String i) {
        nombre = n;
        id = i;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerId() {
        return id;
    }
}
