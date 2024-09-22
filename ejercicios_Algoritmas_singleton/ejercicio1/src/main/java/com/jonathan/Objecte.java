package com.jonathan;

public class Objecte {
 private static Objecte instance;
    private String nom;
    private String cognom;
    private int edat;

    private Objecte(String nom, String cognom, int edat) {
        this.nom = nom;
        this.cognom = cognom;
        this.edat = edat;
    }

    public static Objecte getInstance(String nom, String cognom, int edat) {
        if (instance == null) {
            instance = new Objecte(nom, cognom, edat);
        }
        
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return instance;
    }

    @Override
    public String toString() {
        return "Nom: " + nom + "  Cognom: " + cognom + "   Edat: " + edat;
    }
}
