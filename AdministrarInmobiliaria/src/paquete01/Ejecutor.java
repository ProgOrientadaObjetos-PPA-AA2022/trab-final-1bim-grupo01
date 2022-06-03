/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import java.util.ArrayList;
import java.util.Scanner;
import paquete02.*;
import paquete03.*;
import paquete04.*;
import paquete05.*;
import paquete06.*;

/**
 *
 * @author grupo01
 */
public class Ejecutor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Casa> casas = new ArrayList<>();
        ArrayList<Departamento> departamentos = new ArrayList<>();
        ArrayList<Propietario> propietario = new ArrayList<>();
        ArrayList<Barrio> barrio = new ArrayList<>();
        ArrayList<Ciudad> ciudad = new ArrayList<>();
        ArrayList<Constructora> constructora = new ArrayList<>();
        Menu men = new Menu();
        String nombreProp, apellidoProp, nombreBarr, referencia,
                nombreCiud, nombreProv, nombreConstr, idEmpresa, idProp;
        double precioM2, alicuota;
        int metros, nCuartos;
        String nombreArchivoCasa = "casas.dat";
        String nombreArchivoDepartamento = "departamento.dat";
        int opc;

        int i = 0, j = 0;
        EscrituraPropietario archivoP
                = new EscrituraPropietario("propietario.dat");

        EscrituraBarrio archivoB
                = new EscrituraBarrio("barrio.dat");

        EscrituraCiudad archivoC
                = new EscrituraCiudad("ciudad.dat");

        EscrituraConstructora archivoCo
                = new EscrituraConstructora("constructora.dat");

        do {
            opc = men.menu();
            switch (opc) {
                case 1:
                    System.out.println("Ingrese el nombre del propietario:");
                    nombreProp = entrada.nextLine();
                    System.out.println("Ingrese el apellido del propietario: ");
                    apellidoProp = entrada.nextLine();
                    System.out.println("Ingrese la id del propietario: ");
                    idProp = entrada.nextLine();

                    Propietario prop = new Propietario(nombreProp, apellidoProp, idProp);
                    propietario.add(prop);

                    archivoP.establecerRegistroPropietario(propietario.get(i));
                    // establecer en el archivo el atributo del registro
                    archivoP.establecerSalida();

                    /*
                    String nombre_buscar = "2222";
                    Barrio barrio_buscar;
                    LecturaBarrio lecturaB
                            = new LecturaBarrio("barrio.dat");
                    lecturaB.establecerIdentificador(nombre_buscar);
                    lecturaB.establecerBarrioBuscado();
                    barrio_buscar = barrio.obtenerBarrioBuscado();
                    if (hospital_buscar != null) {
                        System.out.println(hospital_buscar);
                    } else {
                        System.out.println("Hospital no encontrado");
                    }*/

                    // establecer el valor del atributo registr
                    //archivoP.establecerRegistroPropietario(propietario.get(i));
                    // establecer en el archivo el atributo del registro
                    //archivoP.establecerSalida();
                    /*

                    Casa cas = new Casa(prop, barr, ciud);
                    cas.establecerMetrosCuadrado(metros);
                    cas.establecerPrecioMetro(precioM2);
                    cas.establecerNumeroCuartos(nCuartos);
                    cas.calcularFinal();
                    cas.establecerConstructora(constr);
                    casas.add(cas);
                     */
                    break;
                case 2:

                    System.out.println("Ingrese el nombre del barrio: ");
                    nombreBarr = entrada.nextLine();
                    System.out.println("Ingrese una referencia: ");
                    referencia = entrada.nextLine();

                    Barrio barr = new Barrio(nombreBarr, referencia);
                    barrio.add(barr);

                    archivoB.establecerRegistroBarrio(barrio.get(i));
                    // establecer en el archivo el atributo del registro
                    archivoB.establecerSalida();
                    /*
                    Departamento dep = new Departamento(propD, barrD, ciudD);
                    dep.establecerMetrosCuadrado(metros);
                    dep.establecerPrecioMetro(precioM2);
                    dep.establecerNumeroCuartos(nCuartos);
                    dep.calcularFinal();
                    dep.establecerConstructora(constrD);
                    dep.establecerAlicuota(alicuota);
                    departamentos.add(dep);
                     */
                    break;

                case 3:
                    System.out.println("Ingrese el nombre de la ciudad: ");
                    nombreCiud = entrada.nextLine();
                    System.out.println("Ingrese el nombre de la provincia: ");
                    nombreProv = entrada.nextLine();
                    Ciudad ciud = new Ciudad(nombreCiud, nombreProv);
                    ciudad.add(ciud);

                    archivoC.establecerRegistroCiudad(ciudad.get(i));
                    // establecer en el archivo el atributo del registro
                    archivoC.establecerSalida();
                    break;

                case 4:
                    System.out.println("Ingrese el nombre de la constructora: ");
                    nombreConstr = entrada.nextLine();
                    System.out.println("Ingrese el id de la empresa: ");
                    idEmpresa = entrada.nextLine();
                    Constructora constr = new Constructora(nombreConstr, idEmpresa);
                    constructora.add(constr);

                    archivoCo.establecerRegistroConstructora(constructora.get(i));
                    // establecer en el archivo el atributo del registro
                    archivoCo.establecerSalida();
                    break;

                case 5:
                    System.out.println("Ingrese el precio por metro cudarado: ");
                    precioM2 = entrada.nextDouble();
                    System.out.println("Ingrese el número de metros cuadrados: ");
                    metros = entrada.nextInt();
                    System.out.println("Ingrese el número de cuartos: ");
                    nCuartos = entrada.nextInt();
                    /*
                    Casa cas = new Casa(prop, barr, ciud);
                    cas.establecerMetrosCuadrado(metros);
                    cas.establecerPrecioMetro(precioM2);
                    cas.establecerNumeroCuartos(nCuartos);
                    cas.calcularFinal();
                    cas.establecerConstructora(constr);
                    casas.add(cas);*/
                    break;

                case 6:
                    System.out.println("Ingrese el precio por metro cudarado: ");
                    precioM2 = entrada.nextDouble();
                    System.out.println("Ingrese el número de metros cuadrados: ");
                    metros = entrada.nextInt();
                    System.out.println("Ingrese el número de cuartos: ");
                    nCuartos = entrada.nextInt();
                    System.out.println("Ingrese el valor de la alícuota: ");
                    alicuota = entrada.nextDouble();
                    System.out.println("Ingrese el nombre del edificio: ");
                    String nombreEd = entrada.nextLine();
                    break;
                default:
                    break;
            }
        } while (opc != 0);

        /*
        EscrituraArchivosCasa archivo
                = new EscrituraArchivosCasa(nombreArchivoCasa);

        for (int x = 0; x < casas.size(); x++) {
            // establecer el valor del atributo registr
            archivo.establecerRegistroCasa(casas.get(x));
            // establecer en el archivo el atributo del registro
            archivo.establecerSalida();
        }

        archivo.cerrarArchivo();
        
        LecturaArchivosCasa lectura
                = new LecturaArchivosCasa(nombreArchivoCasa);
        lectura.establecerCasas();
        System.out.println(lectura);
         
        EscrituraArchivosDepartamento archivoD
                = new EscrituraArchivosDepartamento(nombreArchivoDepartamento);

        for (int x = 0; x < departamentos.size(); x++) {
            // establecer el valor del atributo registr
            archivoD.establecerRegistroDepartamentos(departamentos.get(x));
            // establecer en el archivo el atributo del registro
            archivo.establecerSalida();
        }

        archivoD.cerrarArchivo();

       
        LecturaArchivosDepartamento lecturaD
                = new LecturaArchivosDepartamento(nombreArchivoDepartamento);
        lecturaD.establecerDepartamentos();
        System.out.println(lecturaD);
         */
        do {
            opc = men.menu2();
            switch (opc) {
                case 1:
                    LecturaArchivosCasa lectura
                            = new LecturaArchivosCasa(nombreArchivoCasa);
                    lectura.establecerCasas();
                    System.out.println(lectura);

                    break;
                case 2:
                    LecturaArchivosDepartamento lecturaD
                            = new LecturaArchivosDepartamento(nombreArchivoDepartamento);
                    lecturaD.establecerDepartamentos();
                    System.out.println(lecturaD);
                    break;
                case 3:
                    LecturaPropietario lecturaP
                            = new LecturaPropietario("propietario.dat");
                    lecturaP.establecerPropietario();
                    System.out.println(lecturaP);
                    break;
                case 4:
                    LecturaBarrio lecturaB
                            = new LecturaBarrio("barrio.dat");
                    lecturaB.establecerBarrio();
                    System.out.println(lecturaB);
                    break;
                case 5:
                    LecturaCiudad lecturaC
                            = new LecturaCiudad("ciudad.dat");
                    lecturaC.establecerCiudad();
                    System.out.println(lecturaC);
                    break;
                case 6:
                    LecturaConstructora lecturaCo
                            = new LecturaConstructora("constructora.dat");
                    lecturaCo.establecerConstructora();
                    System.out.println(lecturaCo);
                    break;
                default:
                    break;
            }
        } while (opc != 0);

    }
}
