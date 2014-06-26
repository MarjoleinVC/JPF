/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hoofdstuk13;

import java.io.*;

/**
 *
 * @author marjolein.vancelst
 */
public class SerialVersionUID {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        File file = new File("e:\\out.dat");
        FileOutputStream fos = new FileOutputStream("out.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        TeSerialiseren SchrijfMeWeg = new TeSerialiseren(1);
        oos.writeObject(SchrijfMeWeg);
        oos.close();

        FileInputStream fis = new FileInputStream("out.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);

        TeSerialiseren dto = (TeSerialiseren) ois.readObject();
        System.out.println("Data:" + dto.getGetal());
        ois.close();
    }
}
