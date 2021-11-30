public class Accessories {
   public String material;
   public String nazwa;
   public String kolor;
   public String cena;
   public String wymiary;
   public String  waga;

   public Accessories(String material,String nazwa,String kolor,String cena,String wymiary,String waga){
      this.material=material;
      this.nazwa=nazwa;
      this.kolor=kolor;
      this.cena=cena;
      this.wymiary=wymiary;
      this.waga=waga;
   }
   public void Items(){
      System.out.printf(material + " " + nazwa + " " + kolor + " " + cena + " " + wymiary + " " + waga +  "\n");
   }
}
