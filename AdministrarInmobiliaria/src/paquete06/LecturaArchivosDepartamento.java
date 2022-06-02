/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete06;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 *
 * @author Usuario iTC
 */
public class LecturaArchivosDepartamento {
    private ObjectInputStream entrada;
    private ArrayList<Departamento> departamentos;
    private String nombreArchivo;
    //private String identificador;
    //private Casa casaBuscada;

    public LecturaArchivosDepartamento(String n) {
        nombreArchivo = n;
        File f = new File(nombreArchivo);
        if (f.exists()) {
            try // abre el archivo
            {
                entrada = new ObjectInputStream(
                        new FileInputStream(n));
            } // fin de try
            catch (IOException ioException) {
                System.err.println("Error al abrir el archivo." + ioException);
            } // fin de catch
        }
    }

    public void establecerNombreArchivo(String n) {
        nombreArchivo = n;
    }

    public void establecerDepartamentos() {
        // 
        departamentos = new ArrayList<>();
        File f = new File(obtenerNombreArchivo());
        if (f.exists()) {

            while (true) {
                try {
                    Departamento registro = (Departamento) entrada.readObject();
                    departamentos.add(registro);
                } catch (EOFException endOfFileException) {
                    return; // se llegó al fin del archivo
                    // se puede usar el break;
                    // System.err.println("Fin de archivo: " + endOfFileException);

                } catch (IOException ex) {
                    System.err.println("Error al leer el archivo: " + ex);
                } catch (ClassNotFoundException ex) {
                    System.err.println("No se pudo crear el objeto: " + ex);
                } catch (Exception ex) {
                    System.err.println("No hay datos en el archivo: " + ex);

                }
            }
        }
    }
    
    /*public void establecerCasaBuscada() {
        // 
        
        File f = new File(obtenerNombreArchivo());
        if (f.exists()) {

            while (true) {
                try {
                    Casa registro = (Casa) entrada.readObject();
                    
                    if(registro.obtenerID().equals(identificador)){
                        casaBuscada = registro;
                        break;
                    }
                    
                } catch (EOFException endOfFileException) {
                    return; // se llegó al fin del archivo
                    // se puede usar el break;
                    // System.err.println("Fin de archivo: " + endOfFileException);

                } catch (IOException ex) {
                    System.err.println("Error al leer el archivo: " + ex);
                } catch (ClassNotFoundException ex) {
                    System.err.println("No se pudo crear el objeto: " + ex);
                } catch (Exception ex) {
                    System.err.println("No hay datos en el archivo: " + ex);

                }
            }
        }
    }*/
    
    /*public void establecerIdentificador(String n) {
        identificador = n;
    }
    
    public Casa obtenerCasaBuscada() {
        return casaBuscada;
    }*/

    public ArrayList<Departamento> obtenerDepartamentos() {
        return departamentos;
    }

    public String obtenerNombreArchivo() {
        return nombreArchivo;
    }

    /*@Override
    public String toString() {
        String cadena = "Lista de Departamentos\n";
        for (int i = 0; i < obtenerDepartamentos().size(); i++) {
            Departamento p = obtenerDepartamentos().get(i);
            cadena = String.format("%s(%s)%s - %s camas - %smil de presupuesto\n", 
                    cadena,
                    i+1,
                    p.obtenerNombre(),
                    p.obtenerNumeroCamas(),
                    p.obtenerPresupuesto());
        }

        return cadena;
    }*/

    // cierra el archivo y termina la aplicación
    public void cerrarArchivo() {
        try // cierra el archivo y sale
        {
            if (entrada != null) {
                entrada.close();
            }
            System.exit(0);
        } // fin de try
        catch (IOException ioException) {
            System.err.println("Error al cerrar el archivo.");
            System.exit(1);
        } // fin de catch
    } // fin del método cerrarArchivo
}
