import java.time.LocalDate;
import java.time.Period;

public class Person {
    private String name;
    private String vorname;
    private String geburtstag;
    private String geschlecht;


    public Person(String name, String vorname, String geburtstag, String geschlecht) {
        this.name = name;
        this.vorname = vorname;
        this.geburtstag = geburtstag;
        this.geschlecht = geschlecht;
    }


    public String getName() {
        return name;
    }

    public String getVorname() {
        return vorname;
    }

    public String getGeburtstag() {
        return geburtstag;
    }

    public String getGeschlecht() {
        return geschlecht;
    }

    public int getAlter() {
        String[] parts = geburtstag.split(",");
        LocalDate birthdate = LocalDate.of(Integer.parseInt(parts[0]), Integer.parseInt(parts[1]), Integer.parseInt(parts[2]));
        LocalDate heute = LocalDate.now();
        return Period.between(birthdate, heute).getYears();
    }

    /*public int getAlter() {
        // LocalDate datum = LocalDate.of(Integer.parseInt(geburtstag.substring(0,3)), Integer.parseInt(geburtstag.substring(5,5)), Integer.parseInt(geburtstag.substring(7,8)));
        // LocalDate heute = LocalDate.now();

        //geburtstags String aufteilen in tag monat und jahr
        String[] parts = geburtstag.split(",");
        //neues Date erzeugen von dem geburtstag
        Date birthdate = new Date(Integer.parseInt(parts[0])- 1900, Integer.parseInt(parts[1]) -1, Integer.parseInt(parts[2]));
        System.out.println(birthdate);
        //aktuellen tag holen
        Date heute = new Date();
        System.out.println(heute);
        //differenz errechnen
        //long difference = heute.getTime() - birthdate.getTime();
        //zurück formatieren und lesbare Zahlen
        Period.between(birthdate, heute);
        return (int)(difference / 1000 *60 *60 *24);
    }

     */

    public String getAnrede() {
        switch (geschlecht) {
            case "männlich": return "Herr";
            case "weiblich": return "Frau";
            default: return "";
        }
    }
}
