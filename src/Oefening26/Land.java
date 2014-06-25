/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oefening26;

/**
 *
 * @author marjolein.vancelst
 */
public class Land {

    private String landCode;
    private String landNaam;
    private String hoofdstad;
    private long aantalInwoners;
    private float oppervlakte = 1.0F;

    public Land(String landCode, String landNaam, String hoofdstad, long aantalInwoners, float oppervlakte) {
        setLandCode(landCode);
        setLandNaam(landNaam);
        setHoofdstad(hoofdstad);
        setAantalInwoners(aantalInwoners);
        setOppervlakte(oppervlakte);
    }

    public String getLandCode() {
        return landCode;
    }

    public void setLandCode(String landCode) {
        this.landCode = landCode;
    }

    public String getLandNaam() {
        return landNaam;
    }

    public void setLandNaam(String landNaam) {
        this.landNaam = landNaam;
    }

    public String getHoofdstad() {
        return hoofdstad;
    }

    public void setHoofdstad(String hoofdstad) {
        this.hoofdstad = hoofdstad;
    }

    public long getAantalInwoners() {
        return aantalInwoners;
    }

    public void setAantalInwoners(long aantalInwoners) {
        if (aantalInwoners >= 0) {
            this.aantalInwoners = aantalInwoners;
        }
    }

    public float getOppervlakte() {
        return oppervlakte;
    }

    public void setOppervlakte(float oppervlakte) {
        if (oppervlakte > 0) {
            this.oppervlakte = oppervlakte;
        }
    }

    public float getBevolkingsDichtheid() {
        return getAantalInwoners() / getOppervlakte();
    }
}
