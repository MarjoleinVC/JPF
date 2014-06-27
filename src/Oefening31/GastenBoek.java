/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oefening31;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author marjolein.vancelst
 */
public class GastenBoek implements Serializable {

    private static final long serialVersionUID = 1L;
    
    List<GastenBoekEntry> gastenBoekLijst = new ArrayList<GastenBoekEntry>();

    public List<GastenBoekEntry> getGastenBoekLijst() {
        return gastenBoekLijst;
    }

    public void addEntry(GastenBoekEntry entry) {
        gastenBoekLijst.add(entry);
    }
}
