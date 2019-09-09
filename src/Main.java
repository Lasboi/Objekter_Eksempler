/*
Kort forklaret så er dette vores main metode for vores Student klasse. Igennem denne kode går vi ind i Student klassen
og spytter nogle information ind til den klasse med hvad vi ønsker de forskellige værdier skal være til de angivene metoder
Vi kan direkte fra vores main metode ændre i alt instansieret inde i Student klassen. Og denne information skriver vi så
ud i vores konsol
 */

public class Main {

    public static void main(String[] args) {

        Student ahmed = new Student();

        Student sune = new Student();

        ahmed.setNavn("Ahmed Hassan");
        sune.setNavn("Sune Bro");

        ahmed.setFodselsAar(1997);
        sune.setFodselsAar(2002);

        sune.hometown = "Slagelse";

        System.out.println("Studerende i klassen er: " + ahmed.getNavn() + " og " + sune.getNavn());

        System.out.println("Sunes alder er " + sune.getAlder());
        System.out.println("Ahmeds alder er " + ahmed.getAlder());

        int gennemsnitsAlder = (sune.getAlder() + ahmed.getAlder())/2;

        System.out.println("Gennemsnitsalderen er " + gennemsnitsAlder);

        // Et eksempel på forskellen mellem at lægge int sammen og string sammen
        int a = 1;
        int b = 2;

        System.out.println(a+b);

        String c = "1";
        String d = "2";
        System.out.println(c+d);

    }
}
