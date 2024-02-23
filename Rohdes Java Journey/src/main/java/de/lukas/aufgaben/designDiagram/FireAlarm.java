package de.lukas.aufgaben.designDiagram;

public class FireAlarm {

    /**
     * Represents a fire alarm (Feuermelder) with a certain loudness (lautstaerke), alarm state, and a battery (Batterie).
     */
    public static class Feuermelder {
        private final Double lautstaerke;
        private boolean alarm;
        private final Batterie batterie;

        /**
         * Returns the loudness of the fire alarm.
         *
         * @return the loudness of the fire alarm
         */
        public Double getLautstaerke() {
            return lautstaerke;
        }

        /**
         * Checks if the alarm is currently active.
         *
         * @return true if the alarm is active, false otherwise
         */
        public boolean isAlarm() {
            return alarm;
        }

        /**
         * Sets the state of the alarm.
         *
         * @param alarm the new state of the alarm
         */
        public void setAlarm(boolean alarm) {
            this.alarm = alarm;
        }

        /**
         * Activates the alarm.
         */
        public void feuerMelden() {
            setAlarm(true);
        }

        /**
         * Deactivates the alarm.
         */
        public void alarmAbschalten() {
            setAlarm(false);
        }

        /**
         * Creates a new fire alarm with the given parameters.
         *
         * @param lautstaerke the loudness of the fire alarm
         * @param pL          not used in the constructor
         * @param pB          the battery of the fire alarm
         * @param pA          the initial state of the alarm
         */
        public Feuermelder(Double lautstaerke, Double pL, Batterie pB, boolean pA) {
            this.lautstaerke = lautstaerke;
            this.alarm = pA;
            this.batterie = pB;
        }
    }

    public static class Batterie {
        private final int ladestand;

        public int getLadestand() {
            return ladestand;
        }

        public Batterie(int ladestand) {
            this.ladestand = ladestand;
        }
    }

    /**
     * The main method which is the entry point for the program.
     * It creates a new instance of Batterie and Feuermelder.
     * It then prints the initial state of the Feuermelder.
     * After that, it triggers an alarm and prints the state of the Feuermelder.
     * Finally, it turns off the alarm and prints the state of the Feuermelder again.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        // Create a new Batterie with a ladestand of 100
        Batterie b = new Batterie(100);

        // Create a new Feuermelder with a lautstaerke of 100.0, a Batterie b, and an initial alarm state of false
        Feuermelder f = new Feuermelder(100.0, 100.0, b, false);

        // Print the initial state of the Feuermelder
        System.out.println("------------------");
        System.out.println("Feuermelder");
        System.out.println("Alarm: " + f.isAlarm());
        System.out.println("Lautstärke: " + f.getLautstaerke());
        System.out.println("Batterie: " + f.batterie.getLadestand());
        System.out.println("------------------");

        // Trigger an alarm
        f.feuerMelden();

        // Print the state of the Feuermelder after triggering the alarm
        System.out.println(f.isAlarm());

        // Turn off the alarm
        f.alarmAbschalten();

        // Print the state of the Feuermelder after turning off the alarm
        System.out.println(f.isAlarm());
    }
}
