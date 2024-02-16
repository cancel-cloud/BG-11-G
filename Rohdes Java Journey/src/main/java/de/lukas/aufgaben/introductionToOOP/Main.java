package de.lukas.aufgaben.introductionToOOP;

class Main {
    public static void main(String[] args) {
        Person patrick = new Person();
        patrick.setVorname("Patrick");
        patrick.setNachname("Krüger");
        patrick.setAge(46);
        patrick.setBirthPlace("Weilburg");
        patrick.setBirthDate("1978-12-24");
        patrick.setPhoneNumber("+49 0170 30 30 30 30 301");
        System.out.println(patrick.getAllInfo());
    }
}