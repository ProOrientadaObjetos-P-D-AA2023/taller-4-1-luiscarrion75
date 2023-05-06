/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

/**
 *
 * @author DELL
 */
public class Provincia {
     private String nombreP;
     private double nh;

    public Provincia(String nombrePr, double nuh) {
        nombreP = nombrePr;
        nh = nuh;
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public double getNh() {
        return nh;
    }

    public void setNh(double nh) {
        this.nh = nh;
    }
   
}
