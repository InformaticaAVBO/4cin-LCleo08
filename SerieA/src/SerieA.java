package serie.a;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class SerieA {

    public static void main(String[] args) throws FileNotFoundException {

        Campionato seriea = new Campionato();
        Scanner input = new Scanner(System.in);
        int scelta;

        do {
            System.out.println("\n--- MENU SERIE A ---");
            System.out.println("1) Visualizza classifica");
            System.out.println("2) Cerca squadra");
            System.out.println("3) Ricalcola punti");
            System.out.println("4) Ordina per punti");
            System.out.println("5) Esci");
            System.out.print("Scelta: ");
            scelta = input.nextInt();
            input.nextLine(); // pulisce buffer

            switch (scelta) {
                case 1:
                    seriea.stampaCampionato();
                    break;
                case 2:
                    System.out.print("Inserisci il nome della squadra: ");
                    String nome = input.nextLine();
                    Squadra trovata = seriea.cercaSquadra(nome);
                    if (trovata != null) {
                        System.out.println("Squadra trovata:\n" + trovata);
                    } else {
                        System.out.println("Nessuna squadra trovata con quel nome.");
                    }
                    break;
                case 3:
                    seriea.ricalcolaPunti();
                    break;
                case 4:
                    seriea.ordinaPerPunti();
                    break;
                case 5:
                    System.out.println("Uscita dal programma...");
                    break;
                default:
                    System.out.println("Scelta non valida!");
            }

        } while (scelta != 5);

        input.close();
    }
}
