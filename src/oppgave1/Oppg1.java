package oppgave1;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oppg1 {
    public static void main (String[] args) {
        String inLowerLimit = showInputDialog("Skriv inn nedre grense.");
        String inUpperLimit = showInputDialog("Skriv inn øvre grense");

        int lowerLimit = Integer.parseInt(inLowerLimit);
        int upperLimit = Integer.parseInt(inUpperLimit);
        int sum = 0;
        int teller = 0;

        if (lowerLimit >= upperLimit) {
            System.out.print("Nedre grense kan ikke være større enn øvre grense, prøv igjen.");
        }
        else {
            while (lowerLimit <= upperLimit) {
                System.out.print(lowerLimit+" + ");
                sum += lowerLimit;
                lowerLimit++;
                teller++;
                if (teller == 10) {
                    teller = 0;
                    System.out.println();
                }
            }
        }
        System.out.print(" = "+sum);
    }
}
