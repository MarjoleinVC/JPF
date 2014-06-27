/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oefening31;

import java.util.Date;
import java.io.Serializable;

/**
 *
 * @author marjolein.vancelst
 */
public class GastenBoekEntry implements Serializable {

    private static final long serialVersionUID = 1L;
    private Date datum;
    private String gast;
    private String boodschap;

    public GastenBoekEntry(String gast, String boodschap) {
        this.datum = new Date();
        this.gast = gast;
        this.boodschap = boodschap;
    }

    public Date getDatum() {
        return datum;
    }

    public String getGast() {
        return gast;
    }

    public String getBoodschap() {
        return boodschap;
    }
}
