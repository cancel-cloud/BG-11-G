public class Task3 {

    public static void main(String[] args) {
        //vordefinierte anzahl an zeilen
        int starcount = 4;
        //zeichen welches ausgegeben werden soll
        String zeichen = "*";

        //erste schleife, welche die Zeilenanzahl angibt
        for (int i = 0; i<starcount; i++) {
            //zweite schleife, welche ausgibt, wie viele zeichen in einer Zeile sein sollten
            for (int j=0; j<=i; j++) {
                //gebe das zeichen so lange aus, wie j kleiner gleich i ist
                System.out.print(zeichen);
            }
            //leere Zeile am Ende, damit das Ende zu erkennen ist
            System.out.println();
        }

    }
}
