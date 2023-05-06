/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

/**
 *
 * @author DELL
 */
public class cliente {
     private String nombres;
     private String apellidos;
     private String cedula;

    public cliente(String nom, String ape, String cedu) {
        nombres = nom;
        apellidos = ape;
        cedula = cedu;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nomb) {
        nombres = nomb;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apell) {
        apellidos = apell;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedul) {
        cedula = cedul;
    }
     
     
}
