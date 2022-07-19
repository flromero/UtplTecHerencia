/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utptec.arreglos;

/**
 *
 * @author t-freddyromero
 */
public class TestArregloBidimensional1 {

    public static void main(String[] args) {
        //tipodato nombreVariable[] UNIDIMENSIONAL
        String arregloCadena[][] = new String[2][3];
       
        
        // Unidimensional arregloCadena[0] = "Hola";
        
        //Bidimensional
        arregloCadena[0][0] = "Arreglo 0 valor 0";
        arregloCadena[1][2] = "arreglo 1 valor 2";
        
        //Bidimensional
        // arregloCadena[0] = {"Mate". "Fisica", "Lengua"}; error
        String materias[] = {"Mate", "Lenguaje", "CCNN"};
        String nombres[] = {"contraseña", "526", "utpl"};
        
        arregloCadena[0] = materias;
        arregloCadena[1] = nombres;
        
        System.out.println("Primer recorrido" + arregloCadena[1][2]);
        
        
        for (int i = 0; i < arregloCadena.length; i++) {
            // aqui se puede referir al objeto con arregloCadena[i];
           //System.out.println("arregloCadena [" + i + "] = " + arregloCadena[i][0]);
           for (int j = 0; j < arregloCadena[i].length; j++) {
            // aqui se puede referir al objeto con arregloCadena[i];
                System.out.println("arregloCadena [" + i + "][" + j + "] = " + arregloCadena[i][j]);
            }
        }
        
        // Hola desde utpl tec !
        // ! tec utpl desde Hola
        

    }
}
