package IntroInKlassen;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import static IntroInKlassen.Rekening.printRekening;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author marjolein.vancelst
 */
public class BankBediende {

    public static void main(String[] args) throws RekeningException {

        /*DecimalFormat fmt = new DecimalFormat("#,##0.00");
        Rekening[] rekeningen = new Rekening[3];
        try {
            rekeningen[0] = new SpaarRekening("035-0621094-44", 2.5);
            rekeningen[1] = new ZichtRekening("784-5879305-64", 1000);
            rekeningen[2] = new SpaarRekening("001-3456789-01", 5.5);

            rekeningen[0].storten(100.0);
            rekeningen[1].storten(200.0);
            rekeningen[1].afhalen(50.0);
        } catch (RekeningException re) {
            System.out.println(re.getMessage() + re.getVerkeerdNummer());
        }
        for (int i = 0; i != rekeningen.length; i++) {
            if (rekeningen[i] != null) {
                System.out.println(rekeningen[i].toString());
            }
        }/*/
        
        // ------GENERICS: eerste collectie van rekeningen----------------------
        Set<Rekening> setRek = new HashSet<Rekening>();

        ZichtRekening z1 = new ZichtRekening("001-1234567-11", 1000);
        z1.storten(100.80);
        ZichtRekening z2 = new ZichtRekening("001-1234567-22", 1000);
        z2.storten(200.80);
        SpaarRekening s1 = new SpaarRekening("833-1234567-88", 3.5);
        s1.storten(1500.0);
        SpaarRekening s2 = new SpaarRekening("833-1234567-99", 3.5);
        s2.storten(3000.0);

        setRek.add(z1);
        setRek.add(z2);
        setRek.add(s1);
        setRek.add(s2);

        double somSaldo = 0.0;

        for (Rekening rek : setRek) {
            somSaldo += rek.getSaldo();
        }
        System.out.println();
        System.out.println("Totaal saldo: " + somSaldo);

        System.out.println();
        System.out.println("HashSet van Rekeningen");
        printRekening(setRek);

        List<Rekening> alRek = new ArrayList<Rekening>();
        alRek.add(z1);
        alRek.add(z2);
        alRek.add(s1);
        alRek.add(s2);

        System.out.println();
        System.out.println("ArrayList van Rekeningen");
        printRekening(alRek);
    }
}
