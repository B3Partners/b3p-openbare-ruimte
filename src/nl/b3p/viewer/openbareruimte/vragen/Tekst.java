/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.b3p.viewer.openbareruimte.vragen;

import java.util.List;

/**
 *
 * @author Roy Braam
 */
public class Tekst {
    private List<CustomInput> customInputs;
    private String tekst;

    Tekst(String tekst) {
        this(tekst,null);
    }
    Tekst(String tekst,List<CustomInput> customInputs) {
        this.tekst=tekst;
        this.customInputs=customInputs;
    }
    
    //<editor-fold defaultstate="collapsed" desc="Getters and setters">
    public List<CustomInput> getCustomInputs() {
        return customInputs;
    }
    
    public void setCustomInputs(List<CustomInput> customInputs) {
        this.customInputs = customInputs;
    }
    
    public String getTekst() {
        return tekst;
    }
    
    public void setTekst(String tekst) {
        this.tekst = tekst;
    }
    //</editor-fold>
}
