/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.b3p.viewer.openbareruimte.entities;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 *
 * @author Roy Braam
 */
@MappedSuperclass
public class CustomInput {    
    private Integer index;
    private String value;
    
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
}
