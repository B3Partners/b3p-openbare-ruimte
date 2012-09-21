/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.b3p.viewer.openbareruimte.entitiies;

/**
 *
 * @author Roy Braam
 */
public class Maatregel {
    private String id;
    private String omschrijving;

    //<editor-fold defaultstate="collapsed" desc="comment">
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getOmschrijving() {
        return omschrijving;
    }
    
    public void setOmschrijving(String omschrijving) {
        this.omschrijving = omschrijving;
    }
    //</editor-fold>
}
