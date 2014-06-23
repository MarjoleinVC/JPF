package Oefening13;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marjolein.vancelst
 */
public class Examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Student Ruben = new Student("Ruben", 85);
        Student Freya = new Student("Freya", 75);
        System.out.println("De eerste student: " + Ruben.getNaam() + ", score = " + Ruben.getScore());
        System.out.println("De tweede student: " + Freya.getNaam() + ", score = " + Freya.getScore());
    }

}
