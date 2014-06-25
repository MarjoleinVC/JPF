package IntroInKlassen;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author marjolein.vancelst
 */
public class ZichtRekening extends Rekening {

    private int maxKrediet;

    public ZichtRekening(String rnr, int bedrag) throws RekeningException {
        super(rnr);
        maxKrediet = bedrag;
    }

    @Override //Dit is een annotatie om de method uit de superclass te overriden
    public void afhalen(double bedrag) {
        //nadat saldo in base class Rekening "protected" werd, veranderde getSaldo() in saldo en super.afhalen(bedrag) in saldo -= bedrag:
        double testSaldo = saldo - bedrag + maxKrediet;
        if (testSaldo > 0) {
            saldo -= bedrag;
        }
    }

    @Override //Wanneer saldo opgevraagd wordt (afdrukken + opsturen van rekeninguittreksels) wordt 0.05 EUR aangerekend:
    public double getSaldo() {
        saldo -= 0.05;
        return saldo;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", " + maxKrediet;
    }
}
