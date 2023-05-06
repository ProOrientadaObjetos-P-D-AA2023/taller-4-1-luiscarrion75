/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caracteristicas;

/**
 *
 * @author DELL
 */
public class fabricante {
    private String nfabricante;
    private String ciuorigen;

    public fabricante(String nofabricante, String ciudorigen) {
        nfabricante = nofabricante;
        ciuorigen = ciudorigen;
    }

    public String getNfabricante() {
        return nfabricante;
    }

    public void setNfabricante(String nomfabricante) {
        this.nfabricante = nomfabricante;
    }

    public String getCiuorigen() {
        return ciuorigen;
    }

    public void setCiuorigen(String ciudadorigen) {
        this.ciuorigen = ciudadorigen;
    }
}
