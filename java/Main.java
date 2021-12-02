import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int zmienna;
        int dalej = 0;
        int log = 0;
        int mis1=0,mis2=0,mis3=0,kla1=0,kla2=0,kla3=0,kar1=0,kar2=0,kar3=0;
        int pap1=0,pap2=0,pap3=0,cho1=0,cho2=0,cho3=0,szc1=0,szc2=0,szc3=0;
        int suma =0;
        String login;
        String haslo;
        Scanner scanner = new Scanner(System.in);
        Worker worker1 = new Worker("Przemyslaw", "Skrzynka", "984123609", "Lombardowa 2/3", "przemos@gmail.com", "kasjer", 8, 3500.00);
        Worker worker2 = new Worker("Karol", "Czosnek", "596600134", "Kolorowa 1", "Koxtotalny@gmail.com", "magazynier", 21, 4000.00);
        Customer customer1 = new Customer("Mateusz", "Jamnik", "688123456", "Bratana 5", "Komputer213@gmail.com", 18, true);
        Customer customer2 = new Customer("Maciej", "Bozy", "120966997", "Krysztalow 2", "topek997@gmail.com", 26, false);
        Accessories miska1 = new Accessories("Ceramiczna", "", "Brazowy", "25", "", "");
        Accessories miska2 = new Accessories("Metalowa", "", "Srebrny", "17", "", "");
        Accessories miska3 = new Accessories("Plastikowa", "", "Rozowy", "11", "", "");
        Accessories klatka1 = new Accessories("Stal", "", "", "300", "3X2M", "");
        Accessories klatka2 = new Accessories("Stal", "", "", "600", "5X3M", "");
        Accessories klatka3 = new Accessories("Stal", "", "", "900", "10X6M", "");
        Accessories karma1 = new Accessories("", "Royal Canin", "", "120", "", "1kg");
        Accessories karma2 = new Accessories("", "Brit Care", "", "55", "", "0.5kg");
        Accessories karma3 = new Accessories("", "Rinti Gold", "", "11", "", "100g");
        Animals chomik1 = new Animals("Syryjski","80g","5 tyg","samiec","35");
        Animals chomik2 = new Animals("Dzungarski","100g","11 tyg","samica","50");
        Animals chomik3 = new Animals("Chinski","115g","20 tyg","samiec","20");
        Animals szczur1 = new Animals("Domowy","70g","2 tyg","samica","15");
        Animals szczur2 = new Animals("Labolatoryjny","105g","33 tyg","samiec","25");
        Animals szczur3 = new Animals("Sniady","110g","15 tyg","samiec","30");
        Animals papuga1 = new Animals("Ara","1kg","6 lat","samiec","10000");
        Animals papuga2 = new Animals("Amazonka","500g","15 lat","samica ","2200");
        Animals papuga3 = new Animals("Nimfy","80g","4 lata","samica","120");

        do {
            try {
                System.out.println("1.logowanie   2.wyjście");
                log = scanner.nextInt();
            }catch(InputMismatchException e){
                System.out.println("podano niepoprawną wartość");
                scanner.nextLine();
            }
             if (log == 1) {
                System.out.println("Login: ");

                login = scanner.nextLine();
                if (login.equals("")) {
                    login = scanner.nextLine();
                }


                System.out.println("Hasło: ");

                haslo = scanner.nextLine();

                if (login.equals("admin") && haslo.equals("admin")) {


                    /**
                     * Funkcja zmienna pozwala na wybranie konkretnych danych,które chcemy uzyskac(ogolnych lub szczegolowych)
                     * Funkcja dalej pozwala na zapętlanie pętli lub przerwanie jej w dowolnym momencie.
                     * @author Kacper Niewiadomski
                     */
                    do {
                        System.out.println("1.Dane  2.Sklep  3.wyloguj");
                        try {
                            zmienna = scanner.nextInt();
                            switch (zmienna) {
                                case 1:
                                    do {
                                        System.out.println("Dane: \n");
                                        System.out.println("1.Pracownicy dane    2.Pracownicy szczegóły    3.Klienci dane    4.Klienci szczegóły    5.wróć");
                                        try {
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
                                                case 5:
                                                    dalej = 0;
                                                    break;


                                                default:
                                                    System.out.println("błąd");

                                                    dalej = 1;
                                                    break;

                                            }

                                        }catch(InputMismatchException e){
                                            System.out.println("podano nieprawidłową wartość");
                                            scanner.nextLine();
                                        }
                                    } while (dalej == 1);

                                    break;
                                case 2:
                                    do {
                                        System.out.println("Admin:\n 1.Akcesoria   2.Zwierzęta   3.wróć");
                                        zmienna = scanner.nextInt();
                                        switch (zmienna) {
                                            case 1:


                                                do {
                                                    System.out.println("Sklep: ");
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
                                                            System.out.println("4. wróć");
                                                            zmienna = scanner.nextInt();
                                                            switch (zmienna) {
                                                                case 1:
                                                                    dalej = 4;
                                                                    break;
                                                                case 2:
                                                                    dalej = 4;
                                                                    break;
                                                                case 3:
                                                                    dalej = 4;
                                                                    break;
                                                                case 4:
                                                                    dalej = 4;
                                                                    break;
                                                                default:
                                                                    System.out.println("Błąd");
                                                                    dalej = 4;

                                                            }

                                                            break;


                                                        case 2:
                                                            System.out.println("Klatki: ");
                                                            System.out.println("1. ");
                                                            klatka1.Klatka();
                                                            System.out.println("2. ");
                                                            klatka2.Klatka();
                                                            System.out.println("3. ");
                                                            klatka3.Klatka();
                                                            System.out.println("4. wróć");
                                                            zmienna = scanner.nextInt();
                                                            switch (zmienna) {
                                                                case 1:
                                                                    dalej = 4;
                                                                    break;
                                                                case 2:
                                                                    dalej = 4;
                                                                    break;
                                                                case 3:
                                                                    dalej = 4;
                                                                    break;
                                                                case 4:
                                                                    dalej = 4;
                                                                    break;
                                                                default:
                                                                    System.out.println("Błąd");
                                                                    dalej = 4;

                                                            }

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
                                                            zmienna = scanner.nextInt();
                                                            switch (zmienna) {
                                                                case 1:
                                                                    dalej = 4;
                                                                    break;
                                                                case 2:
                                                                    dalej = 4;
                                                                    break;
                                                                case 3:
                                                                    dalej = 4;
                                                                    break;
                                                                case 4:
                                                                    dalej = 4;
                                                                    break;
                                                                default:
                                                                    System.out.println("Błąd");
                                                                    dalej = 4;

                                                            }

                                                            break;

                                                        case 4:

                                                            dalej = 3;
                                                            break;

                                                        default:
                                                            System.out.println("Błąd");
                                                            dalej = 4;




                                                    }



                                                } while (dalej == 4);
                                                break;
                                            case 2:
                                                do {
                                                    System.out.println("Zwierzaki: \n");
                                                    System.out.println("kategorie:\n 1.chomiki \n 2.szczury \n 3.papugi \n 4.wróć");
                                                    zmienna = scanner.nextInt();
                                                    switch (zmienna) {

                                                        case 1:

                                                            System.out.println("Chomiki: ");
                                                            System.out.println("1. ");
                                                            chomik1.Zwierz();
                                                            System.out.println("2. ");
                                                            chomik2.Zwierz();
                                                            System.out.println("3. ");
                                                            chomik3.Zwierz();
                                                            System.out.println("4. wróć");
                                                            zmienna = scanner.nextInt();
                                                            switch (zmienna) {
                                                                case 1:
                                                                    dalej = 4;
                                                                    break;
                                                                case 2:
                                                                    dalej = 4;
                                                                    break;
                                                                case 3:
                                                                    dalej = 4;
                                                                    break;
                                                                case 4:
                                                                    dalej = 4;
                                                                    break;
                                                                default:
                                                                    System.out.println("Błąd");
                                                                    dalej = 4;

                                                            }

                                                            break;


                                                        case 2:
                                                            System.out.println(":Szczury ");
                                                            System.out.println("1. ");
                                                            szczur1.Zwierz();
                                                            System.out.println("2. ");
                                                            szczur2.Zwierz();
                                                            System.out.println("3. ");
                                                            szczur3.Zwierz();
                                                            System.out.println("4. wróć");
                                                            zmienna = scanner.nextInt();
                                                            switch (zmienna) {
                                                                case 1:
                                                                    dalej = 4;
                                                                    break;
                                                                case 2:
                                                                    dalej = 4;
                                                                    break;
                                                                case 3:
                                                                    dalej = 4;
                                                                    break;
                                                                case 4:
                                                                    dalej = 4;
                                                                    break;
                                                                default:
                                                                    System.out.println("Błąd");
                                                                    dalej = 4;

                                                            }

                                                            break;
                                                        case 3:
                                                            System.out.println("Papugi: ");
                                                            System.out.println("1. ");
                                                            papuga1.Zwierz();
                                                            System.out.println("2. ");
                                                            papuga2.Zwierz();
                                                            System.out.println("3. ");
                                                            papuga3.Zwierz();
                                                            System.out.println("4. wróć");
                                                            zmienna = scanner.nextInt();
                                                            switch (zmienna) {
                                                                case 1:
                                                                    dalej = 4;
                                                                    break;
                                                                case 2:
                                                                    dalej = 4;
                                                                    break;
                                                                case 3:
                                                                    dalej = 4;
                                                                    break;
                                                                case 4:
                                                                    dalej = 4;
                                                                    break;
                                                                default:
                                                                    System.out.println("Błąd");
                                                                    dalej = 4;

                                                            }

                                                            break;

                                                        case 4:

                                                            dalej = 3;
                                                            break;
                                                        default:
                                                            System.out.println("Błąd");
                                                            dalej = 4;

                                                    }

                                                } while (dalej == 4);
                                                break;
                                            case 3:
                                                dalej = 0;

                                        }
                                    }while (dalej == 3);
                                    break;
                                case 3:


                                    dalej = 3;
                                    break;
                                default:
                                    System.out.println("Błąd");
                                    dalej = 0;
                            }
                        }catch(InputMismatchException e){
                            System.out.println("podano niepoprawną wartość");
                            scanner.nextLine();
                        }
                    } while (dalej == 0);

                } else if (login.equals("klient") && haslo.equals("kup")) {
                    do {
                        System.out.println("Klient:\n 1.Akcesoria   2.Zwierzęta   3.Koszyk   4.Wyloguj");
                        try {
                            zmienna = scanner.nextInt();
                            switch (zmienna) {
                                case 1:


                                    do {
                                        System.out.println("Sklep: ");
                                        System.out.println("kategorie:\n 1.miski \n 2.klatki \n 3.karmy \n 4.wróć");
                                        try {
                                            zmienna = scanner.nextInt();
                                            switch (zmienna) {

                                                case 1:

                                                    System.out.println("miski: ");
                                                    System.out.println("1.dodaj: ");
                                                    miska1.Miska();
                                                    System.out.println("2.dodaj: ");
                                                    miska2.Miska();
                                                    System.out.println("3.dodaj: ");
                                                    miska3.Miska();
                                                    System.out.println("4. wróć");
                                                    zmienna = scanner.nextInt();
                                                    switch (zmienna) {
                                                        case 1:
                                                            mis1++;
                                                            dalej = 4;
                                                            suma = suma + 25;

                                                            break;
                                                        case 2:
                                                            mis2++;
                                                            dalej = 4;
                                                            suma = suma + 17;
                                                            break;
                                                        case 3:
                                                            mis3++;
                                                            dalej = 4;
                                                            suma = suma + 11;
                                                            break;
                                                        case 4:
                                                            dalej = 4;
                                                            break;
                                                        default:
                                                            System.out.println("Błąd");
                                                            dalej = 4;

                                                    }

                                                    break;


                                                case 2:
                                                    System.out.println("Klatki: ");
                                                    System.out.println("1.dodaj: ");
                                                    klatka1.Klatka();
                                                    System.out.println("\n2.dodaj: ");
                                                    klatka2.Klatka();
                                                    System.out.println("\n3.dodaj: ");
                                                    klatka3.Klatka();
                                                    System.out.println("\n4. wróć");
                                                    zmienna = scanner.nextInt();
                                                    switch (zmienna) {
                                                        case 1:
                                                            kla1++;
                                                            dalej = 4;
                                                            suma = suma + 300;
                                                            break;
                                                        case 2:
                                                            kla2++;
                                                            dalej = 4;
                                                            suma = suma + 600;
                                                            break;
                                                        case 3:
                                                            kla3++;
                                                            dalej = 4;
                                                            suma = suma + 900;
                                                            break;
                                                        case 4:
                                                            dalej = 4;
                                                            break;
                                                        default:
                                                            System.out.println("Błąd");
                                                            dalej = 4;

                                                    }

                                                    break;
                                                case 3:
                                                    System.out.println("karmy: ");
                                                    System.out.println("1.dodaj: ");
                                                    karma1.Karma();
                                                    System.out.println("2.dodaj: ");
                                                    karma2.Karma();
                                                    System.out.println("3.dodaj: ");
                                                    karma3.Karma();
                                                    System.out.println("4. wróć");
                                                    zmienna = scanner.nextInt();
                                                    switch (zmienna) {
                                                        case 1:
                                                            kar1++;
                                                            dalej = 4;
                                                            suma = suma + 120;
                                                            break;
                                                        case 2:
                                                            kar2++;
                                                            dalej = 4;
                                                            suma = suma + 55;
                                                            break;
                                                        case 3:
                                                            kar3++;
                                                            dalej = 4;
                                                            suma = suma + 11;
                                                            break;
                                                        case 4:
                                                            dalej = 4;
                                                            break;
                                                        default:
                                                            System.out.println("Błąd");
                                                            dalej = 4;

                                                    }

                                                    break;

                                                case 4:

                                                    dalej = 5;
                                                    break;

                                                default:
                                                    System.out.println("Błąd");
                                                    dalej = 4;


                                            }
                                        }catch(InputMismatchException e){
                                            System.out.println("podano niepoprawną wartość");
                                            scanner.nextLine();
                                        }

                                    } while (dalej == 4);
                                    break;
                                case 2:
                                    do {
                                        System.out.println("Zwierzaki: \n");
                                        System.out.println("kategorie:\n 1.chomiki \n 2.szczury \n 3.papugi \n 4.wróć");
                                        zmienna = scanner.nextInt();
                                        switch (zmienna) {

                                            case 1:

                                                System.out.println("Chomiki: ");
                                                System.out.println("1.dodaj: ");
                                                chomik1.Zwierz();
                                                System.out.println("2.dodaj: ");
                                                chomik2.Zwierz();
                                                System.out.println("3.dodaj: ");
                                                chomik3.Zwierz();
                                                System.out.println("4. wróć");
                                                zmienna = scanner.nextInt();
                                                switch (zmienna) {
                                                    case 1:
                                                        cho1++;
                                                        dalej = 4;
                                                        suma = suma + 35;
                                                        break;
                                                    case 2:
                                                        cho2++;
                                                        dalej = 4;
                                                        suma = suma + 50;
                                                        break;
                                                    case 3:
                                                        cho3++;
                                                        dalej = 4;
                                                        suma = suma + 20;
                                                        break;
                                                    case 4:
                                                        dalej = 4;
                                                        break;
                                                    default:
                                                        System.out.println("Błąd");
                                                        dalej = 4;

                                                }

                                                break;


                                            case 2:
                                                System.out.println(":Szczury ");
                                                System.out.println("1.dodaj: ");
                                                szczur1.Zwierz();
                                                System.out.println("2.dodaj: ");
                                                szczur2.Zwierz();
                                                System.out.println("3.dodaj: ");
                                                szczur3.Zwierz();
                                                System.out.println("4. wróć");
                                                zmienna = scanner.nextInt();
                                                switch (zmienna) {
                                                    case 1:
                                                        szc1++;
                                                        dalej = 4;
                                                        suma = suma + 15;
                                                        break;
                                                    case 2:
                                                        szc2++;
                                                        dalej = 4;
                                                        suma = suma + 25;
                                                        break;
                                                    case 3:
                                                        szc3++;
                                                        dalej = 4;
                                                        suma = suma + 30;
                                                        break;
                                                    case 4:
                                                        dalej = 4;
                                                        break;
                                                    default:
                                                        System.out.println("Błąd");
                                                        dalej = 4;

                                                }

                                                break;
                                            case 3:
                                                System.out.println("Papugi: ");
                                                System.out.println("1.dodaj: ");
                                                papuga1.Zwierz();
                                                System.out.println("2.dodaj: ");
                                                papuga2.Zwierz();
                                                System.out.println("3.dodaj: ");
                                                papuga3.Zwierz();
                                                System.out.println("4. wróć");
                                                zmienna = scanner.nextInt();
                                                switch (zmienna) {
                                                    case 1:
                                                        pap1++;
                                                        dalej = 4;
                                                        suma = suma + 10000;
                                                        break;
                                                    case 2:
                                                        pap2++;
                                                        dalej = 4;
                                                        suma = suma + 2200;
                                                        break;
                                                    case 3:
                                                        pap3++;
                                                        dalej = 4;
                                                        suma = suma + 120;
                                                        break;
                                                    case 4:
                                                        dalej = 4;
                                                        break;
                                                    default:
                                                        System.out.println("Błąd");
                                                        dalej = 4;

                                                }

                                                break;

                                            case 4:

                                                dalej = 5;
                                                break;
                                            default:
                                                System.out.println("Błąd");
                                                dalej = 4;

                                        }


                                    } while (dalej == 4);
                                    break;
                                case 3:
                                    System.out.println("Koszyk:");
                                    if(mis1>0) {
                                        miska1.Miska();
                                        System.out.println("razy: " + mis1 + "\n");
                                    }
                                    if(mis2>0) {
                                        miska2.Miska();
                                        System.out.println("razy: " + mis2 + "\n");

                                    }
                                    if(mis3>0) {
                                        miska3.Miska();
                                        System.out.println("razy: " + mis3 + "\n");

                                    }
                                    if(kla1>0) {
                                        klatka1.Klatka();
                                        System.out.println("\nrazy: " + kla1 + "\n");

                                    }
                                    if(kla2>0) {
                                        klatka2.Klatka();
                                        System.out.println("\nrazy: " + kla2 + "\n");

                                    }
                                    if(kla3>0) {
                                        klatka3.Klatka();
                                        System.out.println("\nrazy: " + kla3 + "\n");

                                    }
                                    if(kar1>0) {
                                        karma1.Karma();
                                        System.out.println("razy: " + kar1 + "\n");

                                    }
                                    if(kar2>0) {
                                        karma2.Karma();
                                        System.out.println("razy: " + kar2 + "\n");

                                    }
                                    if(kar3>0) {
                                        karma3.Karma();
                                        System.out.println("razy: " + kar3 + "\n");

                                    }
                                    if(cho1>0) {
                                        chomik1.Zwierz();
                                        System.out.println("razy: " + cho1 + "\n");

                                    }
                                    if(cho2>0) {
                                        chomik2.Zwierz();
                                        System.out.println("razy: " + cho2 + "\n");

                                    }
                                    if(cho3>0) {
                                        chomik3.Zwierz();
                                        System.out.println("razy: " + cho3 + "\n");

                                    }
                                    if(szc1>0) {
                                        szczur1.Zwierz();
                                        System.out.println("razy: " + szc1 + "\n");

                                    }
                                    if(szc2>0) {
                                        szczur2.Zwierz();
                                        System.out.println("razy: " + szc2 + "\n");

                                    }
                                    if(szc3>0) {
                                        szczur3.Zwierz();
                                        System.out.println("razy: " + szc3 + "\n");

                                    }
                                    if(pap1>0) {
                                        papuga1.Zwierz();
                                        System.out.println("razy: " + pap1 + "\n");

                                    }
                                    if(pap2>0) {
                                        papuga2.Zwierz();
                                        System.out.println("razy: " + pap2 + "\n");

                                    }
                                    if(pap3>0) {
                                        papuga3.Zwierz();
                                        System.out.println("razy: " + pap3 + "\n");

                                    }
                                    System.out.println("suma: " + suma + "zl"+ "\n");
                                    System.out.println("1.Zapłać   2.wróć");
                                    zmienna = scanner.nextInt();
                                    switch (zmienna){
                                        case 1:
                                            dalej = 20;
                                            System.out.println("zapłacono");
                                            break;
                                        case 2:
                                            dalej = 5;
                                            break;
                                    }




                                    break;
                                case 4:
                                    dalej = 3;

                            }
                        }catch(InputMismatchException e){
                            System.out.println("podano niepoprawną wartość");
                            dalej=5;
                            scanner.nextLine();
                        }
                    }while (dalej == 5);
                }
                else {
                    System.out.println("nie prawidłowy login lub hasło");
                    dalej = 3;
                }
                login = "";

            }
            else if(log == 2){
                dalej = 8;
            }
            else{
                System.out.println("");
                dalej = 3;
            }
        }while (dalej == 3) ;
    }
}
