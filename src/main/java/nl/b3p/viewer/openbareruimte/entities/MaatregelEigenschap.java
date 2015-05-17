/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.b3p.viewer.openbareruimte.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author Roy Braam
 */
@Entity
public class MaatregelEigenschap {
    @Id
    private Long id;
    
    @ManyToOne
    @JsonIgnore    
    @JoinColumn (name="maatregel")    
    private MaatregelGepland maatregel;
    
    private String deficode;
    private Integer hoeveelheid;
    
    @OneToMany(fetch= FetchType.LAZY, cascade={CascadeType.ALL})
    @JoinColumn (name="maatregel_eigenschap")
    private List<MaatregelEigenschapCustomInput> customInputs;
    
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
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<MaatregelEigenschapCustomInput> getCustomInputs() {
        return customInputs;
    }

    public void setCustomInputs(List<MaatregelEigenschapCustomInput> customInputs) {
        this.customInputs = customInputs;
    }
    //</editor-fold>

}
