import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int zmienna;
        int dalej;
        String login;
        String haslo;
        Scanner scanner = new Scanner(System.in);
        Worker worker1 = new Worker("Przemyslaw","Skrzynka","984123609","Lombardowa 2/3","przemos@gmail.com","kasjer",8,3500.00);
        Worker worker2 = new Worker("Karol","Czosnek","596600134","Kolorowa 1","Koxtotalny@gmail.com","magazynier",21,4000.00);
        Customer customer1=new Customer("Mateusz","Jamnik","688123456","Bratana 5","Komputer213@gmail.com",18,true);
        Customer customer2=new Customer("Maciej","Bozy","120966997","Krysztalow 2","topek997@gmail.com",26,false);
        Accessories miska1=new Accessories("Ceramiczna","Brazowy","25"," ","","");
        Accessories miska2=new Accessories("Metalowa","Stalowy","17","","","");
        Accessories miska3=new Accessories("Plastikowa","Rozowy","11","","","");
        Accessories klatka1=new Accessories("Stal","","300","3X2M","","");
        Accessories klatka2=new Accessories("Stal","","600","5X3M","","");
        Accessories klatka3=new Accessories("Stal","","900","10X6M","","");
        Accessories karma1=new Accessories("","Royal Canin","","120","","1kg");
        Accessories karma2=new Accessories("","Brit Care","","55","","0.5kg");
        Accessories karma3=new Accessories("","Rinti Gold","","11","","100g");
        System.out.println("Login: ");
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int zmienna;
        int dalej = 0;
        String login;
        String haslo;
        Scanner scanner = new Scanner(System.in);
        Worker worker1 = new Worker("Przemyslaw","Skrzynka","984123609","Lombardowa 2/3","przemos@gmail.com","kasjer",8,3500.00);
        Worker worker2 = new Worker("Karol","Czosnek","596600134","Kolorowa 1","Koxtotalny@gmail.com","magazynier",21,4000.00);
        Customer customer1=new Customer("Mateusz","Jamnik","688123456","Bratana 5","Komputer213@gmail.com",18,true);
        Customer customer2=new Customer("Maciej","Bozy","120966997","Krysztalow 2","topek997@gmail.com",26,false);
        Accessories miska1=new Accessories("Ceramiczna","","Brazowy","25","","");
        Accessories miska2=new Accessories("Metalowa","","Srebrny","17","","");
        Accessories miska3=new Accessories("Plastikowa","","Rozowy","11","","");
        Accessories klatka1=new Accessories("Stal","","","300","3X2M","");
        Accessories klatka2=new Accessories("Stal","","","600","5X3M","");
        Accessories klatka3=new Accessories("Stal","","","900","10X6M","");
        Accessories karma1=new Accessories("","Royal Canin","","120","","1kg");
        Accessories karma2=new Accessories("","Brit Care","","55","","0.5kg");
        Accessories karma3=new Accessories("","Rinti Gold","","11","","100g");
        do {
        System.out.println("Login: ");

        login = scanner.nextLine();
        if(login.equals("")){
            login =scanner.nextLine();
        }


        System.out.println("Hasło: ");

        haslo = scanner.nextLine();

        if(login.equals("admin") && haslo.equals("admin")) {


            

                /**
                 * Funkcja zmienna pozwala na wybranie konkretnych danych,które chcemy uzyskac(ogolnych lub szczegolowych)
                 * Funkcja dalej pozwala na zapętlanie pętli lub przerwanie jej w dowolnym momencie.
                 * @author Kamil Kuchciński
                 * @author Kacper Niewiadomski
                 */
do{
                System.out.println("1.Dane  2.Sklep  3.wyloguj");
                zmienna = scanner.nextInt();
                switch (zmienna) {
                    case 1:
                        do {
                        System.out.println("Dane: \n");
                        System.out.println("1.Pracownicy dane    2.Pracownicy szczegóły    3.Klienci dane    4.Klienci szczegóły");

                        zmienna = scanner.nextInt();
                        switch (zmienna) {
                            case 1:
                                worker1.Dane();
                                worker2.Dane();
                                dalej = 1;

                                break;
                            case 2:
                                worker1.Szczegoly();
                                worker2.Szczegoly();
                                dalej = 1;

                                break;
                            case 3:
                                customer1.Kdane();
                                customer2.Kdane();
                                dalej = 1;

                                break;
                            case 4:
                                customer1.Kszczegoly();
                                customer2.Kszczegoly();
                                dalej = 1;

                                break;


                            default:
                                System.out.println("błąd");

                                dalej = 1;
                                break;
                        }
                        } while (dalej == 1);

                        break;
                    case 2:
                        do {
                            System.out.println("Sklep: \n");
                            System.out.println("kategorie:\n 1.miski \n 2.klatki \n 3.karmy \n 4.wróć");
                            zmienna = scanner.nextInt();
                            switch (zmienna) {
                                case 1:
                                    System.out.println("miski: ");
                                    System.out.println("1. ");
                                    miska1.Miska();
                                    System.out.println("2. ");
                                    miska2.Miska();
                                    System.out.println("3. ");
                                    miska3.Miska();
                                    System.out.println("początek: 4");
                                    dalej = scanner.nextInt();
                                    break;
                                case 2:
                                    System.out.println("Klatki: ");
                                    System.out.println("1. ");
                                    klatka1.Klatka();
                                    System.out.println("2. ");
                                    klatka2.Klatka();
                                    System.out.println("3. ");
                                    klatka3.Klatka();
                                    System.out.println("początek: 4");
                                    dalej = scanner.nextInt();
                                    break;
                                case 3:
                                    System.out.println("karmy: ");
                                    System.out.println("1. ");
                                    karma1.Karma();
                                    System.out.println("2. ");
                                    karma2.Karma();
                                    System.out.println("3. ");
                                    karma3.Karma();
                                    System.out.println("4. wróć");
                                    dalej = scanner.nextInt();
                                    break;

                                case 4:

                                    dalej = 0;
                                    break;
                            }

                        } while (dalej == 4);
                        break;
                    case 3:

                        dalej=3;
                }
} while (dalej == 0);

        }


        else if(login.equals("klient") && haslo.equals("kup")){



        }
        else {
            System.out.println("nie prawidłowy login lub hasło");
            dalej = 3;
        }
        login= "";

        } while (dalej == 3);
    }

}
