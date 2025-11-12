package serie.a;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class Campionato {

    int DIM = 20;
    Squadra[] classifica;

    public Campionato() throws FileNotFoundException {
        classifica = new Squadra[DIM];
        File f = new File("data/Classifica.csv");
        Scanner leggi = new Scanner(f);

        for (int i = 0; leggi.hasNextLine(); i++) {
            String s = leggi.nextLine();
            String[] ss = s.split(",");
            classifica[i] = new Squadra(ss[0], ss[1], ss[2], ss[3], ss[4], ss[5], ss[6], ss[7], ss[8], ss[9]);
        }

        leggi.close();
    }

    public void stampaCampionato() {
        System.out.println("\n--- CLASSIFICA SERIE A ---");
        for (int i = 0; i < DIM; i++) {
            System.out.println(classifica[i]);
        }
    }

    // 🔹 Cerca squadra per nome
    public Squadra cercaSquadra(String nome) {
        for (int i = 0; i < DIM; i++) {
            if (classifica[i].getNome().equalsIgnoreCase(nome)) {
                return classifica[i];
            }
        }
        return null;
    }

    // 🔹 Ricalcola punti da vinte e pareggiate
    public void ricalcolaPunti() {
        for (int i = 0; i < DIM; i++) {
            int vinte = Integer.parseInt(classifica[i].getVinte());
            int pareggi = Integer.parseInt(classifica[i].getPareggiate());
            int nuoviPunti = vinte * 3 + pareggi;
            classifica[i].setPunti(Integer.toString(nuoviPunti));
        }
        System.out.println("Punti ricalcolati correttamente!");
    }

    // 🔹 Ordina le squadre in base ai punti (decrescente)
    public void ordinaPerPunti() {
        Arrays.sort(classifica, (a, b) -> {
            int pa = Integer.parseInt(a.getPunti());
            int pb = Integer.parseInt(b.getPunti());
            return pb - pa;
        });
        System.out.println("Classifica ordinata in base ai punti (dal più alto al più basso).");
    }
}
