/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

/**
 *
 * @author DELL
 */
public class DatosProfesor {
    private String nombre;
    private String apellido;
    private double sb;
    private double st;
    private String cedula;
    private Provincia pro;
    double porcientosb;

    public DatosProfesor(String nom, String ape, double suba, String ced, Provincia prov) {
        nombre = nom;
        apellido = ape;
        sb = suba;
        st = st;
        cedula = ced;
        pro = prov;
        
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nomb) {
        nombre = nomb;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apelli) {
        apellido = apelli;
    }

    public double getSb() {
        return sb;
    }

    public void setSb(double sueba) {
        sb = sueba;
    }

    public double getSt() {
        return st;
    }

    public void setSt(double sueto) {
        st = sueto;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedu) {
        cedula = cedu;
    }

    public Provincia getPro() {
        return pro;
    }

    public void setPro(Provincia provin) {
        pro = provin;
    }
    public double calcularSueldoTotal(){
    porcientosb = sb * 0.20;
        return st = sb + porcientosb;
    }
}
