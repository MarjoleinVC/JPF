/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hoofdstuk13;

import java.io.Serializable;

/**
 *
 * @author marjolein.vancelst
 */
public class TeSerialiseren implements Serializable {

    private static final long serialVersionUID = 1L;
    private int bewaardGetal;

    public TeSerialiseren(int getal) {
        this.bewaardGetal = getal;
    }

    public int getGetal() {
        return bewaardGetal;
    }

    public int getKwadraat() {
        return bewaardGetal * bewaardGetal;
    }
}
