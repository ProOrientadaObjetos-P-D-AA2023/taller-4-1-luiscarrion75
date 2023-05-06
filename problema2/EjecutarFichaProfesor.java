/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejecutarfichaprofesor;
import Datos.DatosProfesor;
import Datos.Provincia;
/**
 *
 * @author DELL
 */
public class EjecutarFichaProfesor {

    public static void main(String[] args) {
        System.out.println("Ficha Profesor");
        
        String nombre = "Luis";
        String apellido = "Carrión";
        double sueldobasico = 450;
        String cedula = "1150641692";
        String nombrePro = "Loja";
        double numeroHa = 521154;
        
        Provincia prov = new Provincia(nombrePro,numeroHa);
        
        DatosProfesor dt = new DatosProfesor(nombre, apellido, sueldobasico, cedula, prov);
        
        System.out.println("Nombre: " + dt.getNombre());
        System.out.println("Apellido: " + dt.getApellido());
        System.out.println("Sueldo Basico: " + dt.getSb());
        System.out.println("Cedula: " + dt.getCedula());
        System.out.println("Provincia de nacimiento: " + dt.getPro().getNombreP());
        System.out.println("Numero de habitantes: " + dt.getPro().getNh());
        System.out.println("Sueldo total: " + dt.calcularSueldoTotal());
        
        
        
    }
}
