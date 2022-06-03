/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete06;

import java.io.Serializable;
import paquete02.Propietario;
import paquete03.Barrio;
import paquete04.Ciudad;
import paquete05.Constructora;

/**
 *
 * @author grupo01
 */
public class Casa implements Serializable{

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

    public void calcularFinal() {
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

    @Override
    public String toString() {
        String cadena = "Lista de Casas\n";

        cadena = String.format("%sNombre del Propietario : %s"
                + "\nApellido del Propietario: %s\nIdentificación del "
                + "Propietario: %s\nPrecio por metro cuadrado: %.2f\n"
                + "Número de metros cuadrados: %s\nCosto final: %.2f\n"
                + "Nombre del barrio: %s\nReferencia: %s\nNombre de la"
                + " Ciudad: %s\nNombre de la Provincia: %s\nNúmero de"
                + " cuartos: %s\nNombre de la constructora: %s\n"
                + "Id de la empresa: %s\n",
                cadena,
                obtenerPropietario().obtenerNombre(),
                obtenerPropietario().obtenerApellido(),
                obtenerPropietario().obtenerIdentificacion(),
                obtenerPrecioMetro(), obtenerMetroCuadrado(),
                obtenerCostoFinal(), obtenerBarrio().obtenerNombre(),
                obtenerBarrio().obtenerReferencia(),
                obtenerCiudad().obtenerNombre(),
                obtenerCiudad().obtenerProvincia(),
                obtenerNumeroCuartos(), obtenerConstructora().obtenerNombre(),
                obtenerConstructora().obtenerId());

        return cadena;
    }
}
