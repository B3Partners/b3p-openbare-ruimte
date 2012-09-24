/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.b3p.viewer.openbareruimte.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author Roy Braam
 */
@Entity
public class VlakMaatregel {
    @Id
    private Long id;
    private String vlakType;
    @ManyToOne
    private Maatregel maatregel;
}
