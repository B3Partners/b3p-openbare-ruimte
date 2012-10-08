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
                if (raw.getEenheid()!=null && raw.getEenheid().length()>0){
                    f.setEenheid(raw.getEenheid());
                }                
                if (raw.getVrij()!=null && !raw.getVrij().equalsIgnoreCase("0000")){
                    Integer previousTextLength = f.getTekst().length() - raw.getTekst().length();
                    String vrij = raw.getVrij();
                    while (vrij.length()>0){
                        Integer startIndex = new Integer(vrij.substring(0, 2));
                        Integer endIndex = new Integer(vrij.substring(2, 4));
                        //start with 0 not with 1
                        startIndex--;                        
                        //if there is a previous text, add the length of that text for the correct length
                        CustomInput ci = new CustomInput(previousTextLength+startIndex,endIndex-startIndex);
                        vrij = vrij.substring(4);
                        f.addCustomInput(ci);
                    }
                }
            }else{
                if (curCode==null){
                    curCode =raw.getDeficode();
                    laatsteVraag = new Vraag(new Integer(""+curCode.charAt(0)));
                    laatsteOptie = new VraagOptie(curCode,raw.getTekst());
                }
                //nieuwe optie
                if (!curCode.equalsIgnoreCase(raw.getDeficode())){
                    laatsteVraag.add(laatsteOptie);
                    laatsteOptie=new VraagOptie(raw.getDeficode(),raw.getTekst());
                    
                    
                }else{
                    laatsteOptie.addTekst(raw.getTekst());
                }
                //create custom input fields                
                if (raw.getVrij()!=null && !raw.getVrij().equalsIgnoreCase("0000")){
                    Integer previousTextLength = laatsteOptie.getTekst().length() - raw.getTekst().length();
                    String vrij = raw.getVrij();
                    while (vrij.length()>0){
                        Integer startIndex = new Integer(vrij.substring(0, 2));
                        Integer endIndex = new Integer(vrij.substring(2, 4));
                        //start with 0 not with 1
                        startIndex--;                        
                        //if there is a previous text, add the length of that text for the correct length
                        CustomInput ci = new CustomInput(previousTextLength+startIndex,endIndex-startIndex);
                        vrij = vrij.substring(4);
                        laatsteOptie.addCustomInput(ci);
                    }
                }
                
                //nieuwe vraag
                if (curCode.charAt(0) != raw.getDeficode().charAt(0)){
                    vragen.add(laatsteVraag);
                    laatsteVraag=  new Vraag(new Integer(""+raw.getDeficode().charAt(0)));
                }
                if (raw.getEenheid()!=null && raw.getEenheid().length()>0){
                    laatsteOptie.setEenheid(raw.getEenheid());
                }
                curCode=raw.getDeficode();
            }
        }
        f.setVragen(vragen);
        return f;
    }
}
