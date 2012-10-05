/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.b3p.viewer.openbareruimte.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Roy Braam
 */
@Entity
@Table(name="maatregel_custom_input")
public class CustomInput {
    @Id
    private Long id;
    private Integer index;
    private String value;
    
    @ManyToOne
    private MaatregelEigenschap maatregelEigenschap;

    public CustomInput() {
    }

    public CustomInput(Integer index,String value){
        this.index=index;
        this.value=value;
    }
    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public MaatregelEigenschap getMaatregelEigenschap() {
        return maatregelEigenschap;
    }

    public void setMaatregelEigenschap(MaatregelEigenschap maatregelEigenschap) {
        this.maatregelEigenschap = maatregelEigenschap;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
