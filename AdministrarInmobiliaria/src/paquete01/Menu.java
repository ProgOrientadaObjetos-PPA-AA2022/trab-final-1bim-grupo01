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

        System.out.println("Ingresar un propietario    [1]");
        System.out.println("Ingresar un barrio         [2]");
        System.out.println("Ingresar una ciudad        [3]");
        System.out.println("Ingresar una constructora  [4]");
        System.out.println("Ingresar una casa          [5]");
        System.out.println("Ingresar un departamento   [6]");
        System.out.println("Dejar de ingresar          [0]");
        opc = entrada.nextInt();

        return opc;
    }
    
    
    public int menu2() {
        Scanner entrada = new Scanner(System.in);
        int opc;

        System.out.println("Presentar Casas            [1]");
        System.out.println("Presentar Departamentos    [2]");
        System.out.println("Presentar Propietarios     [3]");
        System.out.println("Presentar Barrios          [4]");
        System.out.println("Presentar Ciudades         [5]");
        System.out.println("Presentar Constructoras    [6]");
        System.out.println("Salir                      [0]");
        opc = entrada.nextInt();

        return opc;
    }
}
