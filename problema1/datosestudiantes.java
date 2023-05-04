/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

/**
 *
 * @author DELL
 */
public class datosestudiantes {
    private String nomes;
    private double m1;
    private double m2;
    private double m3;
    private double p;
    double suma;
    public datosestudiantes(String nom, double ma1, double ma2, double ma3) {
        nomes = nom;
        m1 = ma1;
        m2 = ma2;
        m3 = ma3;
     
  }

   
    public String getNomes() {
        return nomes;
    }

    public void setNomes(String nome) {
        nomes = nome;
    }

    public double getM1() {
        return m1;
    }

    public void setM1(double mat1) {
        m1 = mat1;
    }

    public double getM2() {
        return m2;
    }

    public void setM2(double mat2) {
        m2 = mat2;
    }

    public double getM3() {
        return m3;
    }

    public void setM3(double mat3) {
        this.m3 = mat3;
    }
    public double calcularPromedio(){
    suma = m1 + m2 + m3;
        
        return p = suma/3;
    }
    
    
    
}
