

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
        public void Klatka(){
            System.out.printf(" material: " + material + "\n wymiary: " + wymiary + "\n cena: " + cena + "zl");
        }
        public void Miska(){
            System.out.println(" material: " + material + "\n kolor: " + kolor + "\n cena: " + cena + "zl");
        }
        public void Karma(){
            System.out.println(" nazwa: " + nazwa + "\n waga: " + waga +"\n cena: " + cena + "zl");
        }
    }


