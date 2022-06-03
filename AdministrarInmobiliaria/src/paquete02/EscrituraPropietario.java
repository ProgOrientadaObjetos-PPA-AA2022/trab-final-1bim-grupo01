/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


/**
 *
 * @author Usuario iTC
 */
public class EscrituraPropietario {
    private String nombreArchivo;
    private ObjectOutputStream salida; 
    private Propietario registroPropietario;
    private ArrayList<Propietario> listaPropietario;

    public EscrituraPropietario(String nombreArc) {
        nombreArchivo = nombreArc;
        establecerListaPropietario(); // obtener los valores (objetos)
        
                                    // que tiene el archivo.
        try // abre el archivo
        {
            salida = new ObjectOutputStream(
                    new FileOutputStream(nombreArchivo));
            // proceso para ingresar nuevamente los valores del archivo
            if (obtenerListaPropietario().size() > 0) {
                for (int i = 0; i < obtenerListaPropietario().size(); i++) {
                    establecerRegistroPropietario(obtenerListaPropietario().get(i));
                    establecerSalida();
                }
            }
        } // fin de try
        catch (IOException ioException) {
            System.err.println("Error al abrir el archivo.");
        } // fin de catch
    }
    
    public void establecerRegistroPropietario(Propietario p) {
        registroPropietario = p;
    }
    
    public void establecerNombreArchivo(String n){
        nombreArchivo = n;
    }
    
    

    public void establecerSalida() {
        try {
            salida.writeObject(registroPropietario); // envía el registro como 
                                                  // objeto al archivo
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }

    // en el atributo listaProfesores obtenemos los registros 
    // del archivo
    public void establecerListaPropietario() {
        LecturaPropietario l = 
                new LecturaPropietario(obtenerNombreArchivo());
        l.establecerPropietario();
        listaPropietario = l.obtenerPropietario();
    }

    public String obtenerNombreArchivo(){
        return nombreArchivo;
    }
    
    public ArrayList<Propietario> obtenerListaPropietario() {
        return listaPropietario;
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
