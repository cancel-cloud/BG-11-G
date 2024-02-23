package de.lukas.aufgaben.task118;


import de.lukas.aufgaben.task118.extended.Auto;
import de.lukas.aufgaben.task118.extended.Crossmaschine;
import de.lukas.aufgaben.task118.extended.Roller;

class Besitzer {
    private String name;
    private double geld;
    private Roller pRoller;
    private Crossmaschine pCrosser;
    private Auto pAuto;

    public Besitzer(double geld, String pName, Roller pRoller, Crossmaschine pCrosser, Auto pAuto) {
        this.geld = geld;
        this.name = pName;
        this.pRoller = pRoller;
        this.pCrosser = pCrosser;
        this.pAuto = pAuto;
    }

    public void tankeDeinenRoller(double pMenge) {
        pRoller.tanke(pMenge);
    }

    public void fahreDeinenRoller(int pStrecke) {
        pRoller.fahre(pStrecke);
    }

    public void erhalteTaschengeld(double pSumme) {
        this.geld += pSumme;
    }

    public double getGeld() {
        return this.geld;
    }

}