/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IntroInKlassen;

/**
 *
 * @author marjolein.vancelst
 */
public class RekeningException extends java.lang.Exception {

    private String rekeningNummer;

    public RekeningException(String msg) {
        super(msg);
    }

    public RekeningException(String msg, String nummer) {
        super(msg);
        this.rekeningNummer = nummer;
    }

    public String getVerkeerdNummer() {
        return " => " + rekeningNummer;
    }
}
