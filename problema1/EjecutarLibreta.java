/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejecutarlibreta;
import datos.datosestudiantes;
import datos.universidad;
/**
 *
 * @author DELL
 */
public class EjecutarLibreta {

    public static void main(String[] args) {
        System.out.println("Libreta Estudiante");
        String nombre = "Luis Carrion";
        double materia1 = 7.5;
        double materia2 = 4.7;
        double materia3 = 10;
        datosestudiantes dt = new datosestudiantes(nombre, materia1, materia2, materia3);
        String nombreU = "UTPL";
        String direccion = "San Cayetano Alto";
        universidad uni = new universidad(nombreU,direccion);
        
        
        System.out.println("Datos del estudiante: " + dt.getNomes());
        System.out.println("Materia 1: " + dt.getM1());
        System.out.println("Materia 2: " + dt.getM2());
        System.out.println("Materia 3: " + dt.getM3());
        System.out.println("El promedio es: " + dt.calcularPromedio());
        System.out.println("Universidad: " + uni.getNu());
        System.out.println("Direccion: " + uni.getD());
        
        
        
        
        
    }
}
