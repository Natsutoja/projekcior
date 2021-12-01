public class skopiuj {
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
}
