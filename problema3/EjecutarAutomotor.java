/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejecutarautomotor;
import caracteristicas.caracteristicasAuto;
import caracteristicas.fabricante;
/**
 *
 * @author DELL
 */
public class EjecutarAutomotor {

    public static void main(String[] args) {
        System.out.println("AUTOMOVIL");
        
        String cedula = "1150641692";
        int añofabricacion = 2015; 
        int valorvehiculo = 15000;
        String nombrefabricante = "Renault";
        String ciudadorigen = "Boulogne-Billancourt Francia";
         fabricante fa = new fabricante(nombrefabricante, ciudadorigen );
         
        caracteristicasAuto carac = new caracteristicasAuto(cedula, añofabricacion, valorvehiculo, fa);
        
        System.out.println("Cedula Propietario: " + carac.getCedula());
        System.out.println("Fabricante del vehiculo: " + carac.getFabri().getNfabricante());
        System.out.println("Ciudad de origen: " + carac.getFabri().getCiuorigen());
        System.out.println("Año de fabricacion: " + carac.getAñof());
        System.out.println("Valor de vehiculo: " + carac.getVv());
        System.out.println("El valor de la matricula es: " + carac.calcularValorMatricula());
        
    }
}
