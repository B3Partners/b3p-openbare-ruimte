/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.b3p.viewer.openbareruimte.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Roy Braam
 */

@Entity
@Table(name="maatregel_custom_input")
public class MaatregelCustomInput extends CustomInput{
    @Id
    private Long id;    
    
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="maatregel", insertable=false, updatable=false)
    private MaatregelGepland maatregel;
    
    public MaatregelGepland getMaatregel() {
        return maatregel;
    }

    public void setMaatregel(MaatregelGepland maatregel) {
        this.maatregel = maatregel;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
