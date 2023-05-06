/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

/**
 *
 * @author DELL
 */
public class banco {
    private String nombanco;
    private String numsucur;

    public banco(String nbanco, String nsucur) {
        nombanco = nbanco;
        numsucur = nsucur;
    }

    public String getNombanco() {
        return nombanco;
    }

    public void setNombanco(String nombrebanco) {
        nombanco = nombrebanco;
    }

    public String getNumsucur() {
        return numsucur;
    }

    public void setNumsucur(String numerosucur) {
        numsucur = numerosucur;
    }
    
    
}
