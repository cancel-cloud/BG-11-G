package de.lukas.aufgaben.task118;

public class Fahrzeug {
    protected double tankgroesse;
    protected int kilometerstand;
    protected double tankinhalt;
    protected int baujahr;

    public Fahrzeug(double tankgroesse, int kilometerstand, double tankinhalt, int baujahr) {
        this.tankgroesse = tankgroesse;
        this.kilometerstand = kilometerstand;
        this.tankinhalt = tankinhalt;
        this.baujahr = baujahr;
    }

    public void tanke(double pMenge) {
        if (pMenge + this.tankinhalt <= this.tankgroesse) {
            this.tankinhalt += pMenge;
        }
    }

    public boolean passtInTank(double pMenge) {
        return (pMenge + this.tankinhalt) <= this.tankgroesse;
    }

    public double getTankinhalt() {
        return this.tankinhalt;
    }

    public int getKilometerstand() {
        return this.kilometerstand;
    }

    public int getBaujahr() {
        return this.baujahr;
    }

    public void fahre(int pStrecke) {
        // Assuming 1 unit of 'tankinhalt' allows for 10 units of 'pStrecke'
        double requiredFuel = pStrecke / 10.0;
        if (this.tankinhalt >= requiredFuel) {
            this.tankinhalt -= requiredFuel;
            this.kilometerstand += pStrecke;
        }
    }

    // Add more methods as needed...
}