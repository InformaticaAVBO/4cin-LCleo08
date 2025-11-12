import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class App {

    public static void copyFile( String fileIn, String fileOut ) throws IOException {
        File f = new File(fileIn);
        Scanner leggi = new Scanner(f);
        FileWriter scrivi = new FileWriter(fileOut);
        // legge riga per riga e le scrive in output
        while (leggi.hasNextLine()) {
            String s = leggi.nextLine();
            scrivi.write(s);
        }
        leggi.close();
        scrivi.close();
    }


    public static void main(String[] args) throws Exception {

        // chiede i nomi dei file all'utente
        Scanner leggiDaTastiera = new Scanner(System.in);
        System.out.print("Nome del file di input: ");
        String inputFilename = leggiDaTastiera.nextLine();
        System.out.print("Nome del file di output: ");
        String outputFilename = leggiDaTastiera.nextLine();
        leggiDaTastiera.close();

        // copia input in output
        copyFile( inputFilename, outputFilename);



        /*
        FileWriter myWriter = new FileWriter("filename.txt");
        for (int i=0; i<100; i++) {
            myWriter.write("Questa è una prima frase scritta in un file\n");
        }
        myWriter.close();
        System.out.println("Ok, ho scritto sul file!");
        */

    }
}