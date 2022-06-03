/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

import java.io.Serializable;

/**
 *
 * @author grupo01
 */
public class Ciudad implements Serializable{
    private String nombre;
    private String provincia;

    public Ciudad(String n, String p) {
        nombre = n;
        provincia = p;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerProvincia() {
        return provincia;
    }
}
