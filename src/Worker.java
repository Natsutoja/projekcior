public class Worker extends Person  {
    public String stanowisko;
    public int id;

    public Worker(String imie, String nazwisko, String nrtel, String adress, String email, String stanowisko, int id) {
        super(imie, nazwisko, nrtel, adress, email);
        this.stanowisko = stanowisko;
        this.id = id;
    }

    /**
     * Wyswietla ogolne informacje o  pracowniku
     * @author Kamil Kuchciński
     * @author Kacper Niewiadomski
     */
    public void Dane(){
        System.out.printf(imie + " " + nazwisko + " " + stanowisko + "\n");
    }
    /**
     * Wyswietla szczegolowe informacje o pracowniku
     * @author Kamil Kuchciński
     * @author Kacper Niewiadomski
     */
    public void Szczegoly(){
        System.out.println(imie + " " + nazwisko + " " + stanowisko + " " + nrtel + " " + adress + " " + email + " " + id + "\n");
    }

}