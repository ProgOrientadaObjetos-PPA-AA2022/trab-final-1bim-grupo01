/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import java.util.Scanner;

/**
 *
 * @author Usuario iTC
 */
public class Menu {

    public int menu() {
        Scanner entrada = new Scanner(System.in);
        int opc;

        System.out.println("Ingresar una casa          [1]");
        System.out.println("Ingresar un departamento   [2]");
        System.out.println("Dejar de ingresar          [0]");
        opc = entrada.nextInt();

        return opc;
    }
    
    public void ingresarCasas(){
        System.out.println("Ingrese el nombre del propietario:");
        System.out.println("Ingrese el apellido del propietario: ");
        System.out.println("Ingrese la id del propietario: ");
        System.out.println("Ingrese el precio por metro cudarado: ");
        System.out.println("Ingrese el número de metros cuadrados: ");
        System.out.println("Ingrese el nombre del barrio: ");
        System.out.println("Ingrese una referencia: ");
        System.out.println("Ingrese el nombre de la ciudad: ");
        System.out.println("Ingrese el nombre de la provincia: ");
        System.out.println("Ingrese el número de cuartos: ");
        System.out.println("Ingrese el nombre de la constructora: ");
        System.out.println("Ingrese el id de la empresa: ");
    }
    
    public void ingresarDepar(){
        
    }
}
