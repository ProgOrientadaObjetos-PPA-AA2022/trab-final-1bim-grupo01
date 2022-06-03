/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import java.io.Serializable;

/**
 *
 * @author grupo01
 */
public class Barrio implements Serializable{
    private String nombre;
    private String referencia;

    public Barrio(String n, String r) {
        nombre = n;
        referencia = r;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerReferencia() {
        return referencia;
    }
    
}
