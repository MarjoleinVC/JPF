/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oefening31;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author marjolein.vancelst
 */
public class GastenBoekManager {

    private static final String GASTENBOEK_PATH = "C:\\Users\\marjolein.vancelst\\Documents\\3. JPF\\JPFProjecten\\JPF\\src\\Oefening31\\gastenBoek.dat";

    public void save(GastenBoek gastenboek) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(GASTENBOEK_PATH);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(gastenboek);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public GastenBoek load() {
        File file = new File(GASTENBOEK_PATH);
        if (file.exists()) {
            try {
                FileInputStream fileInputStream = new FileInputStream(GASTENBOEK_PATH);
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                return (GastenBoek) objectInputStream.readObject();
            } catch (Exception e) {
                System.out.println(e);
                return null;
            }
        } else {
            return new GastenBoek();
        }
    }
}
