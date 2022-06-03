/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Usuario iTC
 */
public class EscrituraBarrio {
    private String nombreArchivo;
    private ObjectOutputStream salida; 
    private Barrio registroBarrio;
    private ArrayList<Barrio> listaBarrio;

    public EscrituraBarrio(String nombreArc) {
        nombreArchivo = nombreArc;
        establecerListaBarrio(); // obtener los valores (objetos)
        
                                    // que tiene el archivo.
        try // abre el archivo
        {
            salida = new ObjectOutputStream(
                    new FileOutputStream(nombreArchivo));
            // proceso para ingresar nuevamente los valores del archivo
            if (obtenerListaBarrio().size() > 0) {
                for (int i = 0; i < obtenerListaBarrio().size(); i++) {
                    establecerRegistroBarrio(obtenerListaBarrio().get(i));
                    establecerSalida();
                }
            }
        } // fin de try
        catch (IOException ioException) {
            System.err.println("Error al abrir el archivo.");
        } // fin de catch
    }
    
    public void establecerRegistroBarrio(Barrio p) {
        registroBarrio = p;
    }
    
    public void establecerNombreArchivo(String n){
        nombreArchivo = n;
    }
    
    

    public void establecerSalida() {
        try {
            salida.writeObject(registroBarrio); // envía el registro como 
                                                  // objeto al archivo
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }

    // en el atributo listaProfesores obtenemos los registros 
    // del archivo
    public void establecerListaBarrio() {
        LecturaBarrio l = 
                new LecturaBarrio(obtenerNombreArchivo());
        l.establecerBarrio();
        listaBarrio = l.obtenerBarrio();
    }

    public String obtenerNombreArchivo(){
        return nombreArchivo;
    }
    
    public ArrayList<Barrio> obtenerListaBarrio() {
        return listaBarrio;
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
