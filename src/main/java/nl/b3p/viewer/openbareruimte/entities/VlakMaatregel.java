/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.b3p.viewer.openbareruimte.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author Roy Braam
 */
@Entity
public class VlakMaatregel {
    @Id
    private Long id;
    private String vlakType;
    @ManyToOne
    private Maatregel maatregel;

    //<editor-fold defaultstate="collapsed" desc="Getters and setters">
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getVlakType() {
        return vlakType;
    }
    
    public void setVlakType(String vlakType) {
        this.vlakType = vlakType;
    }
    
    public Maatregel getMaatregel() {
        return maatregel;
    }
    
    public void setMaatregel(Maatregel maatregel) {
        this.maatregel = maatregel;
    }
    //</editor-fold>
}
