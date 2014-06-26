/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.vdab.winkel;

import java.math.BigDecimal;

/**
 *
 * @author marjolein.vancelst
 */
public class Product {

    private String omschrijving;
    private BigDecimal prijs;

    public Product() {
    }

    public Product(String omschrijving, BigDecimal prijs) {
        setOmschrijving(omschrijving);
        setPrijs(prijs);
    }

    public String getOmschrijving() {
        return omschrijving;
    }

    public void setOmschrijving(String omschrijving) {
        this.omschrijving = omschrijving;
    }

    public BigDecimal getPrijs() {
        return prijs;
    }

    public void setPrijs(BigDecimal prijs) {
        this.prijs = prijs;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Product)) {
            return false;
        }
        Product andere = (Product) obj;

        return this.omschrijving.equals(andere.omschrijving);
    }

    @Override
    public int hashCode() {
        return omschrijving.hashCode();
    }

    @Override
    public String toString() {
        return String.format("%40s %.2f ", omschrijving, prijs);
        //%40s = string (omschrijving) met maximaal 40 karakters; %.2f = decimaal getal (prijs) met 2 cijfers na komma
    }
}
