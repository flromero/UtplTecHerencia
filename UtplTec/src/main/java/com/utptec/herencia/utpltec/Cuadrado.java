/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utptec.herencia.utpltec;

/**
 *
 * @author t-freddyromero
 */
public class Cuadrado extends Figura{
    
    //Area de cuadrado lado por lado.
    private int lado;

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
    
    public void calcularArea(){
        setArea(lado*lado);
    }
    
}
