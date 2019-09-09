/*
Main metoden som tager imod vores package (folder) kaldet Frisk så den kan arbejde i den package.
Vi starter ud med at instansiere en ny Verden af klassen Verden som hedder world1. Derefter tilgår vi den data inde i
Verden klassen som hedder meningenMedVerden så vi kan få den data som står der som vi så printer til konsollen.
Derefter instansiere vi en ny Verden kaldet world2 som gør præcis det samme som ovenover dog ændre vi først lige værdien
i dataen meningenMedVerden så den i stedet kommer til at skrive 32.
I den nederste del af koden tager vi fat i den klasse der hedder FacebookBesked og opretter en ny instans som hedder besked1.
Derefter giver vi denne instans (besked1) en værdi til sin String kaldet tekst og denne tekst printer vi til sidst ud i
vores konsol.
 */

package Frisk;

public class Main {
    public static void main(String[] args) {

        Verden world1 = new Verden();
        System.out.println("Meningen med verden er " + world1.meningenMedVerden);

        Verden world2 = new Verden();
        world2.meningenMedVerden = 32;
        System.out.println("Meningen med verden er " + world2.meningenMedVerden);

        FacebookBesked besked1 = new FacebookBesked();
        besked1.tekst = "Se min mad!";
        System.out.println(besked1.tekst);

    }
}
