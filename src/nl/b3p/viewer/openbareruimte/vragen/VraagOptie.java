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
public class VraagOptie {
    private String deficode;
    private String tekst;
    private String eenheid;
    private String omschrijving;
    
    private List<CustomInput> customInputs;

    VraagOptie(String deficode,String tekst) {
        this.deficode=deficode;
        this.tekst= tekst;
    }

    //<editor-fold defaultstate="collapsed" desc="comment">
    public String getDeficode() {
        return deficode;
    }
    
    public void setDeficode(String deficode) {
        this.deficode = deficode;
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
    
    public String getOmschrijving() {
        return omschrijving;
    }

    public void setOmschrijving(String omschrijving) {
        this.omschrijving = omschrijving;
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
    
    void addOmschrijving(String omschrijving) {
        if (this.omschrijving==null){
            this.omschrijving=omschrijving;
        }else{
            this.omschrijving+=" "+omschrijving;
        }
    }
    
    void addCustomInput(CustomInput customInput){
        if (this.customInputs==null){
            this.customInputs = new ArrayList<CustomInput>();
        }
        this.customInputs.add(customInput);
    }

    void addCustomInputs(List<CustomInput> cis) {
        if (this.customInputs==null){
            this.customInputs = cis;
        }else{
            this.customInputs.addAll(cis);
        }
    }
}
