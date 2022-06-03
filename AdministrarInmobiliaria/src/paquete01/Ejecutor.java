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

        int contadorCasas = 0;
        int contadorDepartamentos = 0;
        int contadorPropietario = 0;
        int contadorBarrio = 0;
        int contadorCiudad = 0;
        int contadorConstructora = 0;
        EscrituraPropietario archivoP
                = new EscrituraPropietario("propietario.dat");

        EscrituraBarrio archivoB
                = new EscrituraBarrio("barrio.dat");

        EscrituraCiudad archivoC
                = new EscrituraCiudad("ciudad.dat");

        EscrituraConstructora archivoCo
                = new EscrituraConstructora("constructora.dat");

        EscrituraArchivosCasa archivoCasa
                = new EscrituraArchivosCasa(nombreArchivoCasa);

        EscrituraArchivosDepartamento archivoDepar
                = new EscrituraArchivosDepartamento(nombreArchivoCasa);
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

                    archivoP.establecerRegistroPropietario(propietario.get(contadorPropietario));
                    // establecer en el archivo el atributo del registro
                    archivoP.establecerSalida();
                    contadorPropietario++;
                    break;
                case 2:

                    System.out.println("Ingrese el nombre del barrio: ");
                    nombreBarr = entrada.nextLine();
                    System.out.println("Ingrese una referencia: ");
                    referencia = entrada.nextLine();

                    Barrio barr = new Barrio(nombreBarr, referencia);
                    barrio.add(barr);

                    archivoB.establecerRegistroBarrio(barrio.get(contadorBarrio));
                    // establecer en el archivo el atributo del registro
                    archivoB.establecerSalida();
                    contadorBarrio++;

                    break;

                case 3:
                    System.out.println("Ingrese el nombre de la ciudad: ");
                    nombreCiud = entrada.nextLine();
                    System.out.println("Ingrese el nombre de la provincia: ");
                    nombreProv = entrada.nextLine();
                    Ciudad ciud = new Ciudad(nombreCiud, nombreProv);
                    ciudad.add(ciud);

                    archivoC.establecerRegistroCiudad(ciudad.get(contadorCiudad));
                    // establecer en el archivo el atributo del registro
                    archivoC.establecerSalida();
                    contadorCiudad++;
                    break;

                case 4:
                    System.out.println("Ingrese el nombre de la constructora: ");
                    nombreConstr = entrada.nextLine();
                    System.out.println("Ingrese el id de la empresa: ");
                    idEmpresa = entrada.nextLine();
                    Constructora constr = new Constructora(nombreConstr, idEmpresa);
                    constructora.add(constr);

                    archivoCo.establecerRegistroConstructora(constructora.get(contadorConstructora));
                    // establecer en el archivo el atributo del registro
                    archivoCo.establecerSalida();

                    contadorConstructora++;
                    break;

                case 5:
                    System.out.println("Ingrese el precio por metro cudarado: ");
                    precioM2 = entrada.nextDouble();
                    System.out.println("Ingrese el número de metros cuadrados: ");
                    metros = entrada.nextInt();
                    System.out.println("Ingrese el número de cuartos: ");
                    nCuartos = entrada.nextInt();
                    System.out.println("Para ingresar un propietario, ingrese"
                            + " su identificacion");

                    entrada.nextLine();
                    String nombre_buscar = entrada.nextLine();
                    Propietario propietario_buscar;
                    LecturaPropietario lecturaP
                            = new LecturaPropietario("propietario.dat");
                    lecturaP.establecerIdentificador(nombre_buscar);
                    lecturaP.establecerPropietarioBuscado();
                    propietario_buscar = lecturaP.obtenerPropietarioBuscado();
                    if (propietario_buscar == null) {
                        System.out.println("Propietario no encontrado");
                    }

                    System.out.println("Para ingresar un barrio, ingrese el "
                            + "nombre del mismo");
                    nombre_buscar = entrada.nextLine();
                    Barrio barrio_buscar;
                    LecturaBarrio lecturaB
                            = new LecturaBarrio("barrio.dat");
                    lecturaB.establecerIdentificador(nombre_buscar);
                    lecturaB.establecerBarrioBuscado();
                    barrio_buscar = lecturaB.obtenerBarrioBuscado();
                    if (barrio_buscar == null) {
                        System.out.println("Barrio no encontrado");
                    }

                    System.out.println("Para ingresar una ciudad, ingrese el "
                            + "nombre de la misma");
                    nombre_buscar = entrada.nextLine();
                    Ciudad ciudad_buscar;
                    LecturaCiudad lecturaC
                            = new LecturaCiudad("ciudad.dat");
                    lecturaC.establecerIdentificador(nombre_buscar);
                    lecturaC.establecerCiudadBuscada();
                    ciudad_buscar = lecturaC.obtenerCiudadBuscada();
                    if (ciudad_buscar == null) {
                        System.out.println("Ciudad no encontrada");
                    }

                    System.out.println("Para ingresar una constructora, ingrese el "
                            + "id de la empresa");
                    String id_buscar = entrada.nextLine();
                    Constructora constructora_buscar;
                    LecturaConstructora lecturaCo
                            = new LecturaConstructora("constructora.dat");
                    lecturaCo.establecerIdentificador(id_buscar);
                    lecturaCo.establecerConstructoraBuscada();
                    constructora_buscar = lecturaCo.obtenerConstructoraBuscada();
                    if (constructora_buscar == null) {
                        System.out.println("Constructora no encontrada");
                    }

                    Casa cas = new Casa(propietario_buscar, barrio_buscar,
                            ciudad_buscar);
                    cas.establecerMetrosCuadrado(metros);
                    cas.establecerPrecioMetro(precioM2);
                    cas.establecerNumeroCuartos(nCuartos);
                    cas.calcularFinal();
                    cas.establecerConstructora(constructora_buscar);
                    casas.add(cas);

                    archivoCasa.establecerRegistroCasa(casas.get(contadorCasas));
                    // establecer en el archivo el atributo del registro
                    archivoCasa.establecerSalida();

                    contadorCasas++;
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
                    entrada.nextLine();
                    System.out.println("Ingrese el nombre del edificio: ");
                    String nombreEd = entrada.nextLine();

                    System.out.println("Para ingresar un propietario, ingrese"
                            + " su identificación");
                    entrada.nextLine();
                    nombre_buscar = entrada.nextLine();
                    LecturaPropietario lecturaPr
                            = new LecturaPropietario("propietario.dat");
                    lecturaPr.establecerIdentificador(nombre_buscar);
                    lecturaPr.establecerPropietarioBuscado();
                    propietario_buscar = lecturaPr.obtenerPropietarioBuscado();
                    if (propietario_buscar == null) {
                        System.out.println("Propietario no encontrado");
                    }

                    System.out.println("Para ingresar un barrio, ingrese el "
                            + "nombre del mismo");
                    nombre_buscar = entrada.nextLine();
                    LecturaBarrio lecturaBa
                            = new LecturaBarrio("barrio.dat");
                    lecturaBa.establecerIdentificador(nombre_buscar);
                    lecturaBa.establecerBarrioBuscado();
                    barrio_buscar = lecturaBa.obtenerBarrioBuscado();
                    if (barrio_buscar == null) {
                        System.out.println("Barrio no encontrado");
                    }

                    System.out.println("Para ingresar una ciudad, ingrese el "
                            + "nombre de la misma");
                    nombre_buscar = entrada.nextLine();
                    LecturaCiudad lecturaCi
                            = new LecturaCiudad("ciudad.dat");
                    lecturaCi.establecerIdentificador(nombre_buscar);
                    lecturaCi.establecerCiudadBuscada();
                    ciudad_buscar = lecturaCi.obtenerCiudadBuscada();
                    if (ciudad_buscar == null) {
                        System.out.println("Ciudad no encontrada");
                    }

                    System.out.println("Para ingresar una constructora, ingrese el "
                            + "id de la empresa");
                    id_buscar = entrada.nextLine();

                    LecturaConstructora lecturaCon
                            = new LecturaConstructora("constructora.dat");
                    lecturaCon.establecerIdentificador(id_buscar);
                    lecturaCon.establecerConstructoraBuscada();
                    constructora_buscar = lecturaCon.obtenerConstructoraBuscada();
                    if (ciudad_buscar == null) {
                        System.out.println("Constructora no encontrado");
                    }

                    Departamento dep = new Departamento(propietario_buscar,
                            barrio_buscar, ciudad_buscar);
                    dep.establecerMetrosCuadrado(metros);
                    dep.establecerPrecioMetro(precioM2);
                    dep.establecerNumeroCuartos(nCuartos);
                    dep.calcularFinal();
                    dep.establecerConstructora(constructora_buscar);
                    dep.establecerAlicuota(alicuota);
                    departamentos.add(dep);
                    
                    archivoDepar.establecerRegistroDepartamentos(departamentos.get(contadorDepartamentos));
                    // establecer en el archivo el atributo del registro
                    archivoDepar.establecerSalida();
                    break;
                default:
                    break;
            }
        } while (opc != 0);

        do {
            opc = men.menu2();
            switch (opc) {
                case 1:
                    LecturaArchivosCasa lecturaCasa
                            = new LecturaArchivosCasa(nombreArchivoDepartamento);
                    lecturaCasa.establecerCasas();
                    System.out.println(lecturaCasa);

                    break;
                case 2:
                    LecturaArchivosDepartamento lecturaD
                            = new LecturaArchivosDepartamento(nombreArchivoDepartamento);
                    lecturaD.establecerDepartamentos();
                    System.out.println(lecturaD);
                    break;
                case 3:;
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
