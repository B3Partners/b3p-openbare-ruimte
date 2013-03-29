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
            //is maatregel tekst?
            }
            Tekst t = new Tekst(raw.getTekst());
            t.setAanwijzing(raw.getAanwijzing());
            if (raw.getDeficode().equals("0000")){
                if (raw.getEenheid()!=null && raw.getEenheid().length()>0){
                    f.setEenheid(raw.getEenheid());
                }
                if (raw.getVrij()!=null && !raw.getVrij().equalsIgnoreCase("0000")){
                    List <CustomInput> cis = createCustomInputs(raw.getVrij()); 
                    t.setCustomInputs(cis);                    
                }
                f.addTekst(t);
            }else{
                if (curCode==null){
                    curCode =raw.getDeficode();
                    laatsteVraag = new Vraag(new Integer(""+curCode.charAt(0)));
                    laatsteOptie = new VraagOptie(curCode);
                }
                //nieuwe optie
                if (!curCode.equalsIgnoreCase(raw.getDeficode())){
                    laatsteVraag.add(laatsteOptie);
                    laatsteOptie=new VraagOptie(raw.getDeficode());
                }
                //create custom input fields                
                if (raw.getVrij()!=null && !raw.getVrij().equalsIgnoreCase("0000")){
                    List<CustomInput> cis = createCustomInputs(raw.getVrij());
                    t.setCustomInputs(cis);                    
                }
                laatsteOptie.addTekst(t);
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
    /**
     * @param text 
     */
    private static List<CustomInput> createCustomInputs(String vrij){
        List <CustomInput> cis = new ArrayList<CustomInput>();
        while (vrij.length()>0){
            Integer startIndex = new Integer(vrij.substring(0, 2));
            Integer endIndex = new Integer(vrij.substring(2, 4));
            //start with 0 not with 1
            startIndex--;                        
            //if there is a previous text, add the length of that text for the correct length
            CustomInput ci = new CustomInput(startIndex,endIndex-startIndex);
            vrij = vrij.substring(4);
            cis.add(ci);
        }
        return cis;
    }
}
