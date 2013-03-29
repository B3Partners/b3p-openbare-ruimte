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
    private List<Tekst> teksten;
    private String eenheid;
    private String omschrijving;
    
    private List<CustomInput> customInputs;

    VraagOptie(String deficode/*,String tekst*/) {
        this.deficode=deficode;
        /*teksten = new ArrayList<String>();
        if (tekst!=null){
            this.teksten.add(tekst);
        }*/
    }

    //<editor-fold defaultstate="collapsed" desc="Getters and Setters">
    public String getDeficode() {
        return deficode;
    }
    
    public void setDeficode(String deficode) {
        this.deficode = deficode;
    }
    
    public List<Tekst> getTeksten(){
        return teksten;
    }
    
    public void setTeksten(List<Tekst> teksten){
        this.teksten = teksten;
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

    void addTekst(Tekst tekst) {
        if (teksten==null){
            teksten = new ArrayList<Tekst>();
        }
        teksten.add(tekst);
    }
     
    void addOmschrijving(String omschrijving) {
        if (this.omschrijving==null){
            this.omschrijving=omschrijving;
        }else{
            this.omschrijving+=" "+omschrijving;
        }
    }  
}
