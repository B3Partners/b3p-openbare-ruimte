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
public class Factory {
    public Factory(){}
    
    public static MaatregelForm createVragen(List<RawCrow> raw){
        Collections.sort(raw);
        return createVragenSorted(raw);
    }
    
    /**
     * Create lijst met vragen.
     * @param sortedRaw 
     * @return 
     */
    public static MaatregelForm createVragenSorted(List<RawCrow> sortedRaw){
        MaatregelForm f = new MaatregelForm();
        List<Vraag> vragen = new ArrayList<Vraag>();
        if (sortedRaw == null || sortedRaw.size()==0){
            return f;
        }        
        String curCode = null;
        Vraag laatsteVraag = null;
        VraagOptie laatsteOptie =null;
        for (RawCrow raw : sortedRaw){                        
            //if empty
            if (raw.getDeficode()==null ||
                    raw.getDeficode().length()==0){
                continue;
            }else if (raw.getDeficode().equals("0000")){
                f.addTekst(raw.getTekst());                
                if (raw.getEenheid()!=null){
                    f.setEenheid(raw.getEenheid());
                }
            }else{
                if (curCode==null){
                    curCode =raw.getDeficode();
                    laatsteVraag = new Vraag();
                    laatsteOptie = new VraagOptie(curCode);
                }
                //nieuwe optie
                if (!curCode.equalsIgnoreCase(raw.getDeficode())){
                    laatsteVraag.add(laatsteOptie);
                    laatsteOptie=new VraagOptie(raw.getDeficode());
                }
                //nieuwe vraag
                if (curCode.charAt(0) != raw.getDeficode().charAt(0)){
                    vragen.add(laatsteVraag);
                    laatsteVraag=  new Vraag();
                }
                laatsteOptie.addTekst(raw.getTekst());
                curCode=raw.getDeficode();
            }
        }
        f.setVragen(vragen);
        return f;
    }
}
