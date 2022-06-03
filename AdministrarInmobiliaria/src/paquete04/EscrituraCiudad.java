/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import paquete03.Barrio;
import paquete03.LecturaBarrio;

/**
 *
 * @author Usuario iTC
 */
public class EscrituraCiudad {
    private String nombreArchivo;
    private ObjectOutputStream salida; 
    private Ciudad registroCiudad;
    private ArrayList<Ciudad> listaCiudad;

    public EscrituraCiudad(String nombreArc) {
        nombreArchivo = nombreArc;
        establecerListaCiudad(); // obtener los valores (objetos)
        
                                    // que tiene el archivo.
        try // abre el archivo
        {
            salida = new ObjectOutputStream(
                    new FileOutputStream(nombreArchivo));
            // proceso para ingresar nuevamente los valores del archivo
            if (obtenerListaCiudad().size() > 0) {
                for (int i = 0; i < obtenerListaCiudad().size(); i++) {
                    establecerRegistroCiudad(obtenerListaCiudad().get(i));
                    establecerSalida();
                }
            }
        } // fin de try
        catch (IOException ioException) {
            System.err.println("Error al abrir el archivo.");
        } // fin de catch
    }
    
    public void establecerRegistroCiudad(Ciudad p) {
        registroCiudad = p;
    }
    
    public void establecerNombreArchivo(String n){
        nombreArchivo = n;
    }
    
    

    public void establecerSalida() {
        try {
            salida.writeObject(registroCiudad); // envía el registro como 
                                                  // objeto al archivo
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }

    // en el atributo listaProfesores obtenemos los registros 
    // del archivo
    public void establecerListaCiudad() {
        LecturaCiudad l = 
                new LecturaCiudad(obtenerNombreArchivo());
        l.establecerCiudad();
        listaCiudad = l.obtenerCiudad();
    }

    public String obtenerNombreArchivo(){
        return nombreArchivo;
    }
    
    public ArrayList<Ciudad> obtenerListaCiudad() {
        return listaCiudad;
    }

    public ObjectOutputStream obtenerSalida(){
        return salida;
    }
    public void cerrarArchivo() {
        try // cierra el archivo
        {
            if (salida != null) {
                salida.close();
            }
        } // fin de try
        catch (IOException ioException) {
            System.err.println("Error al cerrar el archivo.");
            
        } // fin de catch
    } 
}
