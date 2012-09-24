/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.b3p.viewer.openbareruimte.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Roy Braam
 */
@Entity
public class Maatregel {
    @Id
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
