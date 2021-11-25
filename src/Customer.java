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
     * @author Kacper Niewiadomski
     */
    public void Kdane(){
        System.out.printf(imie + " " + nazwisko + " " + (staly ? "tak" : "nie") + "\n");
    }
    /**
     * Wyswietla szczegolowe informacje o kliencie
     * @author Kamil Kuchciński
     * @author Kacper Niewiadomski
     */
    public void Kszczegoly(){
        System.out.println(imie + " " + nazwisko + " " + staly + " " + nrtel + " " + adress + " " + email + " " + wiek + "\n");
    }

}