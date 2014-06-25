/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hoofdstuk12_5;

/**
 *
 * @author marjolein.vancelst
 */
public class Cursus2 implements Comparable<Cursus2> {

    private int cursusNr;
    private String cursusNaam;
    private int prijs;

    public Cursus2(int cursusNr, String cursusNaam, int prijs) {
        setCursusNr(cursusNr);
        setCursusNaam(cursusNaam);
        this.prijs = prijs;
    }

    public int getCursusNr() {
        return cursusNr;
    }

    public void setCursusNr(int nr) {
        this.cursusNr = nr;
    }

    public String getCursusNaam() {
        return cursusNaam;
    }

    public void setCursusNaam(String naam) {
        this.cursusNaam = naam;
    }

    public int getPrijs() {
        return prijs;
    }

    public void setPrijs(int prijs) {
        this.prijs = prijs;
    }

    @Override
    public String toString() {
        return (cursusNr + "\t" + cursusNaam + "\t" + prijs);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Cursus2)) {
            return false;
        }
        Cursus2 c = (Cursus2) o;
        return cursusNr == c.getCursusNr();
    }

    @Override
    public int hashCode() {
        return cursusNr;
    }

    @Override
    public int compareTo(Cursus2 c) {
        /*//sorteren op cursusnummer
         if (cursusNR < c.getCursusnr()) {
         return 1;
         } else {
         return 0;
         }

         //sorteren op cursusnaam         
         return cursusNaam.compareTo(c.getCursusNaam());
         }

         //sorteren op cursusprijs: niet consistent met equals()         
         if (prijs < c.getPrijs()) {
         return -1;
         } else if (prijs > c.getPrijs()) {
         return 1;
         } else {
         return 0;
         }/*/

        //sorteren op cursusprijs: consistent met equals()
        if (this.equals(c)) {
            return 0;
        } else {
            return prijs == c.getPrijs() ? -1 : prijs - c.getPrijs();
        }
    }
}
