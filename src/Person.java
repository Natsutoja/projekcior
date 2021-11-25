public class Person {
    public String imie;
    public String nazwisko;
    public String nrtel;
    public String adress;
    public String email;

    public Person(String imie, String nazwisko, String nrtel, String adress, String email) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nrtel = nrtel;
        this.adress = adress;
        this.email = email;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getNrtel() {
        return nrtel;
    }

    public void setNrtel(String nrtel) {
        this.nrtel = nrtel;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress){
        this.adress = adress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String adress){
        this.email = email;
    }
}
