package Oefeningen;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marjolein.vancelst
 */
public class Oefening11 {

    public Oefening11(int a) {
        setX(a);
    }

    private int x;

    public void print() {
        System.out.println("Waarde x: " + x);
    }

    public int absoluut() {
        return Math.abs(x);
    }

    public int som(int a) {
        return x + a;
    }

    public float som(float a) {
        return x + a;
    }

    public double som(double a) {
        return x + a;
    }

    public void add(int a) {
        x += a;
    }

    public double toDouble() {
        return (double) x;
    }

    public int getX() {
        return x;
    }

    public void setX(int a) {
        x = a;
    }
}
