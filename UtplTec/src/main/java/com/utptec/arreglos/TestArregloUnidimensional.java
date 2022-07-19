/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utptec.arreglos;

import java.util.Scanner;

/**
 *
 * @author t-freddyromero
 */
public class TestArregloUnidimensional {

    public static void main(String[] args) {
        //tipodato nombreVariable[] UNIDIMENSIONAL
        Scanner scan = new Scanner(System.in);
        System.out.println("Que tamanio de arreglo necesita?: ");
        int tamanioArreglo = scan.nextInt();
        
        String arregloCadena[] = new String[tamanioArreglo];
        
        //Expresiones regules.
        //([0-8])4.validar("QWE12). .> true false
        
        /*String arregloCadenaAux[] = {"Hola", "desde", "utpl", "Tec", "!"};
        String saludoUtpl[] = {"Hola", "desde", "utpl", "Tec", "!"};
        
        int arregloInt[] = {1, 2, 3};
        
        String juanDatos[] = {"contraseña", "526", "utpl", "Tec", "!"};*/
       
        //Dimension 5
        //Indece 0-4
        // arregloCadena[0]="Valor1";
        //...
        // arregloCadena[4]="Valor1";
        // arregloCadena[5]="Valor1"; // ERROR

        //Asignacion. 
        //arregloCadena[0] = "Hola";
        //arregloCadena[1] = "desde";
        //arregloCadena[2] = "Utpl";
        //arregloCadena[3] = "Tec";
        //arregloCadena[4] = "!";
        //arregloCadena[5] = "PD.";
        
        //Acceder a valor directamente
        //System.out.println("Dato 2: " + arregloCadena[2]);
        //System.out.println("Dato 2 + dato 1: " + arregloCadena[2] + arregloCadena[1]);
        
        //Error
        /*
        System.out.println("Tamaño: " + arregloCadena.length);
        //Recorrido completo
        System.out.println("Primer recorrido");
        for (int i = 0; i < arregloCadena.length; i++) {
            // aqui se puede referir al objeto con arregloCadena[i];
           System.out.println("Dato " + arregloCadena[i]);
        }*/
        
        //System.out.println("Primer recorrido");
        //String arregloCadena[] = new String[5];
        // arregloCadena.length = 5
        // arregloCadena[0] - arregloCadena[4]
        //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 5
        /*System.out.println("Segundo recorrido");
        for (int i = 4; i < arregloCadena.length; i--) {
            // aqui se puede referir al objeto con arregloCadena[i];
           System.out.println("Dato " + arregloCadena[i]);
        }*//*
        System.out.println("TERCER recorrido");
        for (int i = arregloCadena.length-1; i >= 0; i--) {
            // aqui se puede referir al objeto con arregloCadena[i];
           System.out.println("arregloCadena [" + i + "] = " + arregloCadena[i]);
        }*/
        
        // Hola desde utpl tec !
        // ! tec utpl desde Hola
        
        //Ingreso de datos
        for (int i = 0; i < arregloCadena.length; i++) {
            // aqui se puede referir al objeto con arregloCadena[i];
            
            System.out.println("Ingrese el valor de arregloCadena["+i+"): ");
            arregloCadena[i] = scan.nextLine();
        }

    }
}
