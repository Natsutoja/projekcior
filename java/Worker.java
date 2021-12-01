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
        System.out.printf("Imie: " + imie + "\n" + "Nazwisko: " + nazwisko + "\n" + "Stanowisko: " + stanowisko + "\n" + "placa: " + placa + "\n");
    }
    /**
     * Wyswietla szczegolowe informacje o pracowniku
     * @author Kamil Kuchciński
     * @author Kacper Niewiadomski
     */
    public void Szczegoly(){
        System.out.println("Imie: " + imie + "\n" + "Nazwisko: " + nazwisko + "\n" + "Stanowisko: " + stanowisko + "\n" + "placa: " + placa + "\n" + "numer telefonu: " + nrtel + "\n" + "Adres: " + adress + "\n" + "E-mail: " + email + "\n" + "Id: " + id + "\n");
    }

}
