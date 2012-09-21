/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.b3p.viewer.openbareruimte.vragen;

/**
 *
 * @author Roy Braam
 */
public class VraagOptie {
    private String deficode;
    private String tekst;
    private String eenheid;

    VraagOptie(String deficode) {
        this.deficode=deficode;
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
    //</editor-fold>

    void addTekst(String tekst) {
        if (this.tekst==null){
            this.tekst=tekst;
        }else{
            this.tekst+=" "+tekst;
        }
    }
}
