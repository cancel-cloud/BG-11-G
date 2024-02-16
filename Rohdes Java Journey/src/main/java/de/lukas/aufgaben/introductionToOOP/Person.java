package de.lukas.aufgaben.introductionToOOP;

public class Person {
    private String vorname;
    private String nachname;
    private int age;
    private String birthPlace;
    private String phoneNumber;
    private String birthDate;

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFullName() {
        return vorname + " " + nachname;
    }

    public String getAllInfo() {
        return "Name: " + getFullName() + "\n" +
                "Age: " + age + "\n" +
                "Birthplace: " + birthPlace + "\n" +
                "Phone number: " + phoneNumber + "\n" +
                getAgeByBirthDate();

    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getAgeByBirthDate() {
        return "Age by birthdate: " + (2024 - Integer.parseInt(birthDate.split("-")[0]));
    }
}
