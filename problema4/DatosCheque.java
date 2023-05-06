/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

/**
 *
 * @author DELL
 */
public class DatosCheque {
    private double vch;
    private double com;
    private cliente cl;
    private banco ba;

    public DatosCheque(double vach, cliente cli, banco ban) {
        vch = vach;
        com = com;
        cl = cli;
        ba = ban;
     }

    public double getVch() {
        return vch;
    }

    public void setVch(double vache) {
        vch = vache;
    }

    public double getCom() {
        return com;
    }

    public void setCom(double comis) {
        com = comis;
    }

    public cliente getCl() {
        return cl;
    }

    public void setCl(cliente clie) {
        cl = clie;
    }

    public banco getBa() {
        return ba;
    }

    public void setBa(banco banc) {
        ba = banc;
    }
    public double calcularComision(){
    return com = vch * 0.003;
    }
    
    
}
