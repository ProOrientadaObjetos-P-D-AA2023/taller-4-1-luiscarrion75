/*  
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejecutarcheque;
import datos.DatosCheque;
import datos.cliente;
import datos.banco;
/**
 *
 * @author DELL
 */
public class EjecutarCheque {

    public static void main(String[] args) {
        System.out.println("CHEQUE");
        String nombres = "Luis Xavier";
        String apellidos = "Carrion Campoverde";
        String cedula = "1150641692";
        cliente cl = new cliente(nombres, apellidos, cedula);
        
        String nombrebanco = "Banco de Loja";
        String numerosucursales = "3";
        banco bc = new banco(nombrebanco,numerosucursales);
        
        double valorcheque = 27000;
        DatosCheque dch = new DatosCheque(valorcheque,cl,bc);
        System.out.println("Datos Cliente");
        System.out.println("Nombres: " + dch.getCl().getNombres());
        System.out.println("Apellidos: " + dch.getCl().getApellidos());
        System.out.println("Cedula: " + dch.getCl().getCedula());
        System.out.println("BANCO");
        System.out.println("Nombre: " + dch.getBa().getNombanco());
        System.out.println("Sucursales: " + dch.getBa().getNumsucur());
        System.out.println("Valor del Cheque: " + dch.getVch());
        System.out.println("Comision: " + dch.calcularComision());
        
        
        
        
    }
}
