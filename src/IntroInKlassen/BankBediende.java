package IntroInKlassen;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.text.*;

/**
 *
 * @author marjolein.vancelst
 */
public class BankBediende {

    public static void main(String[] args) {

        DecimalFormat fmt = new DecimalFormat("#,##0.00");
        Rekening[] rekeningen = new Rekening[100];
        rekeningen[0] = new SpaarRekening("BE12 3456 7890 1234", 2.5);
        rekeningen[1] = new ZichtRekening("BE98 7654 3210 9876", 1000);

        rekeningen[0].storten(100.0);
        rekeningen[1].storten(200.0);
        rekeningen[1].afhalen(5000.0);

        for (int i = 0; i < rekeningen.length; i++) {
            if (rekeningen[i] != null) {
                System.out.println("Saldo van de rekening: " + fmt.format(rekeningen[i].getSaldo()));
            }
        }
    }
}
