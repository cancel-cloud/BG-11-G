//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Person martin = new Person("Eberhard", "Martin", "2012,06,13", "männlich");

        System.out.println(martin.getGeschlecht());
        System.out.println(martin.getAlter());
        System.out.println(martin.getAnrede());
    }
}