/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.b3p.viewer.openbareruimte.entitiies;

/**
 *
 * @author Roy Braam
 */
public class MaatregelEigenschap {
    private MaatregelGepland maatregel;
    private String deficode;
    private Integer hoeveelheid;
    
    //<editor-fold defaultstate="collapsed" desc="Getters and Setters">
    public MaatregelGepland getMaatregel() {
        return maatregel;
    }
    
    public void setMaatregel(MaatregelGepland maatregel) {
        this.maatregel = maatregel;
    }

    public String getDeficode() {
        return deficode;
    }

    public void setDeficode(String deficode) {
        this.deficode = deficode;
    }

    public Integer getHoeveelheid() {
        return hoeveelheid;
    }

    public void setHoeveelheid(Integer hoeveelheid) {
        this.hoeveelheid = hoeveelheid;
    }
    //</editor-fold>
}
