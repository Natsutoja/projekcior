public class Animals {
    public String gatunek;
    public String waga;
    public String wiek;
    public String plec;
    public String cena;

    public Animals(String gatunek,String waga,String wiek,String plec,String cena){
        this.gatunek=gatunek;
        this.waga=waga;
        this.wiek=wiek;
        this.plec=plec;
        this.cena=cena;
    }

  public void zwierz(){
      System.out.println("gatunek: " + gatunek + "\n samiec: " + plec + "\n wiek: " + wiek + "\n waga: " + waga + "\n cena: " + cena + "zl");
  }

}
