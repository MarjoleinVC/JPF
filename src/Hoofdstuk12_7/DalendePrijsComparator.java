/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hoofdstuk12_7;

import java.util.Comparator;

/**
 *
 * @author marjolein.vancelst
 */
public class DalendePrijsComparator implements Comparator<Cursus> {

    @Override
    public int compare(Cursus c1, Cursus c2) {
        if (c1.compareTo(c2) == 0) {
            return 0;
        } else {
            if (c1.getPrijs() < c2.getPrijs()) {
                return 1;
            } else {
                return -1;
            }
        }
    }
}
