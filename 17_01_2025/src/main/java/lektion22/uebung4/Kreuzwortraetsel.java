package lektion22.uebung4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

public class Kreuzwortraetsel implements Comparator<String> {
    static String[] alleWoerter = {"Bienenschwarm", "Buch", "Bibel",
            "Beige", "Barriere", "Bein", "Beil", "Christ", "Christian", "Carmen"};


    @Override
    public int compare(String o1, String o2) {

        // if o1 is bigger than o2 -> return 1

        // if o1 is smaller than o2 -> return -1
        if (o1.length() < o2.length()) {
            return -1;
        }

        // if o1 is equal than o2 -> check which letter comes earlier -> if even -> return 0
        else if (o1.length() == o2.length()) {
            char[] o1CharArray = o1.toCharArray();
            char[] o2CharArray = o2.toCharArray();
            // durch die Wörter durch iterieren
            for (int i = 0; i < o1.length(); i++) {
                if (o1CharArray[i] < o2CharArray[i]) {
                    return -1;
                } else if (o1CharArray[i] == o2CharArray[i]) {
                    continue;
                } else {

                    return 1;
                }
                // to get here it has to go in the equal case all the time

            }
            return 0;
        } else {
            return 1;
        }
        // if not worked
    }


    public static void main(String[] args) {
        TreeSet<String> t = new TreeSet<>(new Kreuzwortraetsel());
        t.addAll(Arrays.asList(alleWoerter));


        for (String wort : t) {
            System.out.println(wort);
        }

    }


}
