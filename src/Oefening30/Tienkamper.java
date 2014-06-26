/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oefening30;

/**
 *
 * @author marjolein.vancelst
 */
public class Tienkamper implements Comparable<Tienkamper> {

    private String naam;
    private int punten;

    public Tienkamper(String naam, int punten) {
        setNaam(naam);
        setPunten(punten);
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getPunten() {
        return punten;
    }

    public void setPunten(int punten) {
        this.punten = punten;
    }

    @Override
    public String toString() {
        return naam + " - " + punten;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Tienkamper)) {
            return false;
        }
        Tienkamper andere = (Tienkamper) obj;
        return this.getNaam().equals(andere.getNaam());
    }

    @Override
    public int hashCode() {
        return this.getNaam().hashCode();
    }

    @Override
    public int compareTo(Tienkamper obj) {
        return this.getNaam().compareTo(obj.getNaam());
    }
}
