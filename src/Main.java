import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int zmienna;
        int dalej;
        Scanner scanner = new Scanner(System.in);
        Worker worker1 = new Worker("Przemyslaw","Skrzynka","984123609","Lombardowa 2/3","przemos@gmail.com","kasjer",8);
        Worker worker2 = new Worker("Karol","Czosnek","596600134","Kolorowa 1","Koxtotalny@gmail.com","magazynier",21);
        Customer customer1=new Customer("Mateusz","Jamnik","688123456","Bratana 5","Komputer213@gmail.com",18,true);
        Customer customer2=new Customer("Maciej","Bozy","120966997","Krysztalow 2","topek997@gmail.com",26,false);
        do {
            System.out.println("1.Pracownicy dane    2.Pracownicy szczegóły    3.Klienci dane    4.Klienci szczegóły");

            zmienna = scanner.nextInt();
            switch (zmienna) {
                case 1:
                    worker1.Dane();
                    worker2.Dane();
                    break;
                case 2:
                    worker1.Szczegoly();
                    worker2.Szczegoly();
                    break;
                case 3:
                    customer1.Kdane();
                    customer2.Kdane();
                    break;
                case 4:
                    customer1.Kszczegoly();
                    customer2.Kszczegoly();
                    break;
                default:
                    System.out.println("");
            }
            System.out.println("czy chcesz kontynułować jeśli tak wpisz 0 jeśli nie wpisz cokolwiek innego");
            dalej = scanner.nextInt();
        }while (dalej == 0);
    }
}