/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.b3p.viewer.openbareruimte.vragen;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Roy Braam
 */
public class MaatregelForm {
    private List<Vraag> vragen;
    private List<Tekst> teksten;
    private String eenheid;
    private List<CustomInput> customInputs;
    
    //<editor-fold defaultstate="collapsed" desc="getters and setters">
    public List<Vraag> getVragen() {
        return vragen;
    }
    
    public void setVragen(List<Vraag> vragen) {
        this.vragen = vragen;
    }
    
    public List getTeksten() {
        return teksten;
    }
    
    public void setTeksten(List<Tekst> teksten) {
        this.teksten = teksten;
    }
    
    public String getEenheid() {
        return eenheid;
    }
    
    public void setEenheid(String eenheid) {
        this.eenheid = eenheid;
    }
    
    public List<CustomInput> getCustomInputs() {
        return customInputs;
    }

    public void setCustomInputs(List<CustomInput> customInputs) {
        this.customInputs = customInputs;
    }
    //</editor-fold>    
    void addTekst(Tekst tekst) {
        if (teksten==null){
            teksten = new ArrayList<Tekst>();
        }
        teksten.add(tekst);
    }
    
}
