/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.b3p.viewer.openbareruimte.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

/**
 *
 * @author Roy Braam
 */
@Entity
public class RawCrow implements Comparable {
    @Id
    private Long id;    
    private Integer wc;
    private Integer swc;
    private Integer volgnr;
    private String deficode;
    @Lob
    @org.hibernate.annotations.Type(type="org.hibernate.type.StringClobType")
    private String tekst;
    private String eenheid;
    private String vrij;
    private String aanwijzing;
    private String type;
    private Integer regelnr;
    private String release;
    
    //<editor-fold defaultstate="collapsed" desc="Getters and Setters">
    public Integer getWc() {
        return wc;
    }
    
    public void setWc(Integer wc) {
        this.wc = wc;
    }
    
    public Integer getSwc() {
        return swc;
    }
    
    public void setSwc(Integer swc) {
        this.swc = swc;
    }
    
    public Integer getVolgnr() {
        return volgnr;
    }
    
    public void setVolgnr(Integer volgnr) {
        this.volgnr = volgnr;
    }
    
    public String getDeficode() {
        if (deficode!=null){
            return deficode.trim();
        }else{
            return deficode;
        }
    }
    
    public void setDeficode(String deficode) {        
        this.deficode = deficode;
    }
    
    public String getTekst() {
        return tekst;
    }
    
    public void setTekst(String tekst) {
        this.tekst = tekst;
    }
    
    public String getEenheid() {
        if (eenheid!=null){
            return eenheid.trim();
        }else{
            return eenheid;
        }
    }
    
    public void setEenheid(String eenheid) {
        if (eenheid !=null){
            eenheid=eenheid.trim();
        }
        this.eenheid = eenheid;
    }
    
    public String getVrij() {
        return vrij;
    }
    
    public void setVrij(String vrij) {
        this.vrij = vrij;
    }
    
    public String getAanwijzing() {
        return aanwijzing;
    }
    
    public void setAanwijzing(String aanwijzing) {
        this.aanwijzing = aanwijzing;
    }
    
    public String getType() {
        return type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    public Integer getRegelnr() {
        return regelnr;
    }
    
    public void setRegelnr(Integer regelnr) {
        this.regelnr = regelnr;
    }
    
    public String getRelease() {
        return release;
    }
    
    public void setRelease(String release) {
        this.release = release;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    //</editor-fold>

    @Override
    public int compareTo(Object obj) {
        RawCrow o = (RawCrow)obj;
        int comp = 0;
        if (this.getDeficode()!=null){
            comp=this.getDeficode().compareTo(o.getDeficode());
        }else if (o.getDeficode()!=null){
            comp=-1;
        }
        if (comp==0){
            if(this.getRegelnr()!=null){
                comp=this.getRegelnr().compareTo(o.getRegelnr());
            }else if(o.getRegelnr()!=null){
                return -1;
            }
        }
        return comp;
    }
}
