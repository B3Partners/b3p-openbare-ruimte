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
    public List<VraagOptie> vraagOpties;

    void add(VraagOptie laatsteOptie) {
        if (this.vraagOpties==null){
            this.vraagOpties = new ArrayList<VraagOptie>();
        }
        this.vraagOpties.add(laatsteOptie);
    }
}
