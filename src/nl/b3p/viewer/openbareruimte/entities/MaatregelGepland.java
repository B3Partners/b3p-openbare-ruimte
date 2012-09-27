/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.b3p.viewer.openbareruimte.entities;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author Roy Braam
 */
@Entity
public class MaatregelGepland {
    @Id
    private Long id;
    @ManyToOne
    private Maatregel maatregel;
    
    private Integer hoeveelheid;
    
    @OneToMany(mappedBy="maatregel", fetch= FetchType.LAZY, cascade={CascadeType.PERSIST, CascadeType.REMOVE, CascadeType.MERGE})
    private List<MaatregelEigenschap> eigenschappen;

    public void addEigenschap(MaatregelEigenschap me){
        if (eigenschappen==null){
            eigenschappen = new ArrayList<MaatregelEigenschap>();
        }
        eigenschappen.add(me);
    }
    //<editor-fold defaultstate="collapsed" desc="Getters and Setters">
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public Maatregel getMaatregel() {
        return maatregel;
    }
    
    public void setMaatregel(Maatregel maatregel) {
        this.maatregel = maatregel;
    }

    public Integer getHoeveelheid() {
        return hoeveelheid;
    }

    public void setHoeveelheid(Integer hoeveelheid) {
        this.hoeveelheid = hoeveelheid;
    }

    public List<MaatregelEigenschap> getEigenschappen() {
        return eigenschappen;
    }

    public void setEigenschappen(List<MaatregelEigenschap> eigenschappen) {
        this.eigenschappen = eigenschappen;
    }
    //</editor-fold>
    
}
