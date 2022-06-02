/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete06;

import paquete02.Propietario;
import paquete03.Barrio;
import paquete04.Ciudad;
import paquete05.Constructora;

/**
 *
 * @author grupo01
 */
public class Casa {
    private Propietario propietario;
    private double precioMetro;
    private int metroCuadrado;
    private double costoFinal;
    private Barrio barrio;
    private Ciudad ciudad;
    private int numeroCuartos;
    private Constructora constructora;

    public Casa(Propietario prop, Barrio barr, Ciudad ciud) {
        propietario = prop;
        barrio = barr;
        ciudad = ciud;
    }

    public void establecerPropietario(Propietario prop) {
        propietario = prop;
    }

    public void establecerPrecioMetro(double precio) {
        precioMetro = precio;
    }

    public void establecerMetrosCuadrado(int mc) {
        metroCuadrado = mc;
    }

    public void establecerCostoFinal(double c) {
        costoFinal = c;
    }

    public void establecerBarrio(Barrio b) {
        barrio = b;
    }

    public void establecerCiudad(Ciudad c) {
        ciudad = c;
    }

    public void establecerNumeroCuartos(int nc) {
        numeroCuartos = nc;
    }

    public void establecerConstructora(Constructora c) {
        constructora = c;
    }
    
    public void calcular(){
        costoFinal = precioMetro * metroCuadrado;
    }

    public Propietario obtenerPropietario() {
        return propietario;
    }
    
    public int obtenerMetroCuadrado() {
        return metroCuadrado;
    }

    public double obtenerCostoFinal() {
        return costoFinal;
    }

    public Barrio obtenerBarrio() {
        return barrio;
    }

    public Ciudad obtenerCiudad() {
        return ciudad;
    }

    public int obtenerNumeroCuartos() {
        return numeroCuartos;
    }

    public Constructora obtenerConstructora() {
        return constructora;
    }

    public double obtenerPrecioMetro() {
        return precioMetro;
    }
}
