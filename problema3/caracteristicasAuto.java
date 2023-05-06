/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caracteristicas;

/**
 *
 * @author DELL
 */
public class caracteristicasAuto {
    private String cedula;
    private int añof;
    private double vv;
    private double vm;
    private fabricante fabri;
    double añosantiguedad;
    double vporciento;
    double porci;
    public caracteristicasAuto(String cedu, int añofa, double vave, fabricante fabric) {
        cedula = cedu;
        añof = añofa;
        vv = vave;
        vm = vm;
        fabri = fabric;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedul) {
        cedula = cedul;
    }

    public int getAñof() {
        return añof;
    }

    public void setAñof(int añofab) {
        añof = añofab;
    }

    public double getVv() {
        return vv;
    }

    public void setVv(double valve) {
        vv = valve;
    }

    public double getVm() {
        return vm;
    }

    public void setVm(double valma) {
        vm = valma;
    }

    public fabricante getFabri() {
        return fabri;
    }

    public void setFabri(fabricante fabrica) {
       fabri = fabrica;
    }
    public double calcularValorMatricula(){
    
        añosantiguedad = 2023 - añof;
        porci = 0.002/100;
        vporciento = porci * añosantiguedad;
            return vm = vv * vporciento;
    }
    
}
