public class Worker extends Person  {
    public String stanowisko;
    public int id;
    public double placa;

    public Worker(String imie, String nazwisko, String nrtel, String adress, String email, String stanowisko, int id, double placa) {
        super(imie, nazwisko, nrtel, adress, email);
        this.stanowisko = stanowisko;
        this.id = id;
        this.placa = placa;
    }

    /**
     * Wyswietla ogolne informacje o  pracowniku
     * @author Kamil Kuchciński
     * @author Kacper Niewiadomski
     */
    public void Dane(){
        System.out.printf(imie + " " + nazwisko + " " + stanowisko + " " + placa + "\n");
    }
    /**
     * Wyswietla szczegolowe informacje o pracowniku
     * @author Kamil Kuchciński
     * @author Kacper Niewiadomski
     */
    public void Szczegoly(){
        System.out.println(imie + " " + nazwisko + " " + stanowisko + " " + placa + " " + nrtel + " " + adress + " " + email + " " + id + "\n");
    }

}
