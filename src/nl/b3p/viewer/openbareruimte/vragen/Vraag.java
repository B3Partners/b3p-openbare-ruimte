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
public class Vraag {
    private List<VraagOptie> vraagOpties;

    void add(VraagOptie laatsteOptie) {
        if (this.vraagOpties==null){
            this.vraagOpties = new ArrayList<VraagOptie>();
        }
        this.vraagOpties.add(laatsteOptie);
    }

    //<editor-fold defaultstate="collapsed" desc="getters setters">

    public List<VraagOptie> getVraagOpties() {
        return vraagOpties;
    }
    
    public void setVraagOpties(List<VraagOptie> vraagOpties) {
        this.vraagOpties = vraagOpties;
    }

    //</editor-fold>
}
