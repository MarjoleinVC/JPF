package IntroInKlassen;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * SpaarRekening.java
 */
/**
 *
 * @author marjolein.vancelst
 */
public class SpaarRekening extends Rekening {

    private static double intrest;

    public SpaarRekening(String rnr, double intrest) throws RekeningException {
        super(rnr);
        this.intrest = intrest;
    }

    @Override
    public double getSaldo() {
        double rente = berekenRente();
        //nadat saldo in base class Rekening "protected" werd, veranderde storten(rente); in:
        saldo += rente;
        return saldo;
    }

    private double berekenRente() {
        //nadat saldo in base class Rekening "protected" werd, mag deze code verwijderd worden: double saldo = super.getSaldo();
        return saldo * intrest / 100.0;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + intrest;
    }

    public void toon() {
        System.out.println("Dit is een spaarrekening waarop " + intrest + "% intrest gegeven wordt.");
    }
}
