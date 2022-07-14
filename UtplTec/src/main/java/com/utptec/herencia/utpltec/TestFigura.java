/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.utptec.herencia.utpltec;

import com.utptec.herencia.clasesabstractas.CuadradoA;

/**
 *
 * @author t-freddyromero
 */
public class TestFigura {

    public static void main(String[] args) {
        //Circulo circulo = new Circulo();
        //circulo.calcularArea();
        
        /*Cuadrado cuadrado = new Cuadrado();
        cuadrado.setLado(10);
        cuadrado.calcularArea();
        System.out.println("Area cuadrado: " + cuadrado.getArea());
        
        Circulo circulo = new Circulo();
        circulo.calcularArea();
        System.out.println("Area circulo: " + circulo.getArea());
        
        
        Triangulo tri = new Triangulo();
        tri.calcularArea();
        System.out.println("Area circulo: " + tri.getArea());*/
        
    CuadradoA cuadrado = new CuadradoA();
    cuadrado.calcularArea();
    
    /*String alumno1 = "Felipe";
    String alumno2 = "Felipe";
    
        System.out.println(alumno1.equals(alumno2));
*/
        
    }
}
