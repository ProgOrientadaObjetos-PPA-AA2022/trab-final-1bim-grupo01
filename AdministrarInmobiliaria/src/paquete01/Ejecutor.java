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
        ArrayList<Casa> casas = new ArrayList<Casa>();
        ArrayList<Departamento> departamentos = new ArrayList<Departamento>();
        ArrayList<Propietario> propietario = new ArrayList<Propietario>();
        ArrayList<Barrio> barrio = new ArrayList<Barrio>();
        ArrayList<Ciudad> ciudad = new ArrayList<Ciudad>();
        ArrayList<Constructora> constructora = new ArrayList<Constructora>();
        Menu men = new Menu();
        String nombreProp, apellidoProp, nombreBarr, referencia,
               nombreCiud, nombreProv, nombreConstr, idEmpresa;
        double precioM2;
        int metros, nCuartos, idProp;
        int i = 0;
        int j = 0;
        int opc;
        do {
            opc = men.menu();
            switch (opc) {
                case 1:
                    System.out.println("Ingrese el nombre del propietario:");
                    nombreProp = entrada.nextLine();
                    System.out.println("Ingrese el apellido del propietario: ");
                    apellidoProp = entrada.nextLine();
                    System.out.println("Ingrese la id del propietario: ");
                    idProp = entrada.nextInt();
                    System.out.println("Ingrese el precio por metro cudarado: ");
                    precioM2 = entrada.nextDouble();
                    System.out.println("Ingrese el número de metros cuadrados: ");
                    metros = entrada.nextInt();
                    entrada.nextLine();  //limpieza de buffer
                    System.out.println("Ingrese el nombre del barrio: ");
                    nombreBarr = entrada.nextLine();
                    System.out.println("Ingrese una referencia: ");
                    referencia = entrada.nextLine();
                    System.out.println("Ingrese el nombre de la ciudad: ");
                    nombreCiud = entrada.nextLine();
                    System.out.println("Ingrese el nombre de la provincia: ");
                    nombreProv = entrada.nextLine();
                    System.out.println("Ingrese el número de cuartos: ");
                    nCuartos = entrada.nextInt();
                    System.out.println("Ingrese el nombre de la constructora: ");
                    nombreConstr = entrada.nextLine();
                    System.out.println("Ingrese el id de la empresa: ");
                    idEmpresa = entrada.nextLine();
                    
                    Propietario prop = new Propietario(nombreProp, apellidoProp,idProp);
                    propietario.add(prop);
                    Barrio barr = new Barrio(nombreBarr, referencia);
                    barrio.add(barr);
                    Ciudad ciud = new Ciudad(nombreCiud, nombreProv);
                    ciudad.add(ciud);
                    Constructora constr = new Constructora(nombreConstr, idEmpresa);
                    constructora.add(constr);
                    
                    Casa cas = new Casa(prop, barr, ciud);
                    cas.establecerMetrosCuadrado(metros);
                    cas.establecerPrecioMetro(precioM2);
                    cas.establecerNumeroCuartos(nCuartos);
                    casas.add(cas);
                    
                    i++;
                    break;
                case 2:
                    System.out.println("Ingrese el nombre del propietario:");
                    nombreProp = entrada.nextLine();
                    System.out.println("Ingrese el apellido del propietario: ");
                    apellidoProp = entrada.nextLine();
                    System.out.println("Ingrese la id del propietario: ");
                    idProp = entrada.nextInt();
                    System.out.println("Ingrese el precio por metro cudarado: ");
                    precioM2 = entrada.nextDouble();
                    System.out.println("Ingrese el número de metros cuadrados: ");
                    metros = entrada.nextInt();
                    entrada.nextLine(); // limpieza de buffer
                    System.out.println("Ingrese el nombre del barrio: ");
                    nombreBarr = entrada.nextLine();
                    System.out.println("Ingrese una referencia: ");
                    referencia = entrada.nextLine();
                    System.out.println("Ingrese el nombre de la ciudad: ");
                    nombreCiud = entrada.nextLine();
                    System.out.println("Ingrese el nombre de la provincia: ");
                    nombreProv = entrada.nextLine();
                    System.out.println("Ingrese el número de cuartos: ");
                    nCuartos = entrada.nextInt();
                    System.out.println("Ingrese el nombre de la constructora: ");
                    nombreConstr = entrada.nextLine();
                    System.out.println("Ingrese el id de la empresa: ");
                    idEmpresa = entrada.nextLine();
                    j++;
                    break;
                default:
                    break;
            }
        } while (opc != 0);

    }
}
