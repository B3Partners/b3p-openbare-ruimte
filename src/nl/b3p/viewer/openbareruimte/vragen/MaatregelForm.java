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
    private String tekst;
    private String eenheid;
    private List<CustomInput> customInputs;

    //<editor-fold defaultstate="collapsed" desc="getters and setters">
    public List<Vraag> getVragen() {
        return vragen;
    }
    
    public void setVragen(List<Vraag> vragen) {
        this.vragen = vragen;
    }
    
    public String getTekst() {
        return tekst;
    }
    
    public void setTekst(String tekst) {
        this.tekst = tekst;
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

    void addTekst(String tekst) {
        if (this.tekst==null){
            this.tekst=tekst;
        }else{
            this.tekst+=" "+tekst;
        }
    }

    public void addCustomInput(CustomInput ci) {
        if (this.customInputs==null){
            this.customInputs = new ArrayList<CustomInput>();
        }
        this.customInputs.add(ci);
    }

    void addCustomInputs(List<CustomInput> cis) {
        if (this.customInputs==null){
            this.setCustomInputs(cis);
        }else{
            this.customInputs.addAll(cis);
        }
    }
    
}
