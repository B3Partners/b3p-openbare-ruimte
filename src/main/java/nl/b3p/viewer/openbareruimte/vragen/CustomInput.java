/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.b3p.viewer.openbareruimte.vragen;

/**
 *
 * @author Roy Braam
 */
public class CustomInput {
    private Integer startIndex;
    private Integer length;    

    CustomInput(Integer startIndex, Integer length) {
        this.startIndex = startIndex;
        this.length = length;
    }

    //<editor-fold defaultstate="collapsed" desc="Getters and setters">
    public Integer getStartIndex() {
        return startIndex;
    }
    
    public void setStartIndex(Integer startIndex) {
        this.startIndex = startIndex;
    }
    
    public Integer getLength() {
        return length;
    }
    
    public void setLength(Integer length) {
        this.length = length;
    }
    //</editor-fold>
}
