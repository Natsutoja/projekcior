public class Customer extends Person  {
    boolean staly;
    int wiek;

    public Customer(String imie, String nazwisko, String nrtel, String adress, String email, int wiek, boolean staly) {
        super(imie, nazwisko, nrtel, adress, email);
        this.staly = staly;
        this.wiek = wiek;
    }
    /**
     * Wyswietla ogolne informacje o  kliencie
     * @author Kamil Kuchciński
     */
    public void Kdane(){
        System.out.printf(" Imie: " + imie + "\n Nazwisko: " + nazwisko + "\n Staly klient:  " + (staly ? "tak" : "nie") + "\n\n");
    }
    /**
     * Wyswietla szczegolowe informacje o kliencie
     * @author Kamil Kuchciński
     */
    public void Kszczegoly(){
        System.out.println(" Imie: " + imie + "\n Nazwisko: " + nazwisko + "\n Staly klient: " + (staly ? "tak" : "nie") + "\n Numer Telefonu: " + nrtel + "\n Adres: " + adress + "\n E-mail: " + email + "\n wiek: " + wiek + "\n");
    }

}
