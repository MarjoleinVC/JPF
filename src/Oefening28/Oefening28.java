/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Oefening28;
import java.util.*;
/**
 *
 * @author marjolein.vancelst
 */
public class Oefening28 {
    public static void main(String[] args) {
        String[] woorden = {"Banaan", "Perzik", "Kiwi", "Appel", "Okkernoot", "Kriek", "Peer"};
        
        HashMap<Character, Integer> letters = new HashMap();
        int huidigAantal = 0;
        Integer resultaat;
        Character beginletter;
        
        for (String eenWoord : woorden)
        {
            beginletter = (Character) (eenWoord.charAt(0));
            if ((resultaat = letters.get(beginletter)) != null)
            {
                huidigAantal = resultaat.intValue();
                letters.put(beginletter, huidigAantal + 1);
            }
            else
            {
                letters.put(beginletter, 1);
            }
        }
        
        Set letterKeys = letters.keySet();
        Iterator it = letterKeys.iterator();
        while (it.hasNext())
        {
            Character eenLetter = (Character) (it.next());
            System.out.println(eenLetter + " - " + letters.get(eenLetter));
        }
        System.out.println("De hashmap bevat " + letters.size() + " elementen.");
    }    
}
