/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utptec.herencia.utpltec;

/**
 *
 * @author t-freddyromero
 */
public class Figura extends Object{
    private int area;
    
    public Figura(){
        System.out.println("Contructor Figura");
    }
    
    public void calcularArea(){
        System.out.println("calcularArea desde Figura");
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }
    
    
}
