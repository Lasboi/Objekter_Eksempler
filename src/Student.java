/*
Student klassen som har en masse variabler og nogle public get og set så vi kan manipulere med denne data fra vores main metode.
 */

public class Student {

    private String navn;
    int fodselsAar;
    String hometown;

    public int getAlder() {
        return 2019-fodselsAar;
    }

    public String hello() {
        return "Hello!";
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public int getFodselsAar() {
        return fodselsAar;
    }

    public void setFodselsAar(int fodselsAar) {
        this.fodselsAar = fodselsAar;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }
}
