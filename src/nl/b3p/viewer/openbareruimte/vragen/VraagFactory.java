/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.b3p.viewer.openbareruimte.vragen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import nl.b3p.viewer.openbareruimte.entities.RawCrow;

/**
 *
 * @author Roy Braam
 */
public class VraagFactory {
    public VraagFactory(){}
    
    public static List<Vraag> createVragen(List<RawCrow> raw){
        Collections.sort(raw);
        return createVragenSorted(raw);
    }
    
    /**
     * Create lijst met vragen.
     * @param sortedRaw 
     * @return 
     */
    public static List<Vraag> createVragenSorted(List<RawCrow> sortedRaw){
        List<Vraag> vragen = new ArrayList<Vraag>();
        if (sortedRaw == null || sortedRaw.size()==0){
            return vragen;
        }        
        String curCode = sortedRaw.get(0).getDeficode();
        Vraag laatsteVraag = new Vraag();
        VraagOptie laatsteOptie = new VraagOptie(curCode);
        for (RawCrow raw : sortedRaw){
            //nieuwe vraag
            if (curCode.charAt(0) != raw.getDeficode().charAt(0)){
                vragen.add(laatsteVraag);
                laatsteVraag=  new Vraag();
            }
            //nieuwe optie
            if (!curCode.equalsIgnoreCase(raw.getDeficode())){
                laatsteVraag.add(laatsteOptie);
                laatsteOptie=new VraagOptie(raw.getDeficode());
            }
            laatsteOptie.addTekst(raw.getTekst());
            curCode=raw.getDeficode();
        }
        return vragen;
    }
}
