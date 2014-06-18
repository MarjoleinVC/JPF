/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpf;

import java.util.Arrays;

/**
 *
 * @author marjolein.vancelst
 */
public class Oefening5_6 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        // Oefening5_6
        int[] getal;
        getal = new int[5];
        int sum = 0;

        /*omdat Math.random ALTIJD double tussen 0 (inbegrepen) en 1 (niet inbegrepen) is, moet de waarde *100 +1 gedaan worden.
            => getal tussen 1 en 100
            +1 om geen 0 te krijgen, 100 is geen probleem volgens opgave
            i<5 want java start tabel op 0 (n-1=4)
        */
        for (int i = 0; i < 5; i++) 
        {
            getal[i] = (int) (Math.random() * 100 + 1);
        }

        for (int i : getal) 
        {
            sum += i;
        }

        //float geeft altijd 0 na komma --> float binnen bewerking zetten, anders maak je een float van een int-resultaat
        float gemiddelde =  ((float)sum / getal.length);

        System.out.println("De getallen van de array zijn: " + Arrays.toString(getal));
        System.out.println("Som: " + sum);
        System.out.println("Gemiddelde: " + gemiddelde);

    }

}
