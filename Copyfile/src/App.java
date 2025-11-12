import java.io.File;
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class
import java.util.Scanner;    // Import the Scanner class to read text files

public class App {
    public static void main(String[] args) throws Exception {
        String file;
        Scanner input = new Scanner(System.in);
        System.out.println("Inserire il nome del file da creare:");
        file=input.nextLine();
        FileWriter scrivi0 = new FileWriter(file);
        System.out.println("Inserire il nome del secondo file da creare:");
        file=input.nextLine();
        FileWriter scrivi1 = new FileWriter(file);

        FileWriter myWriter = new FileWriter("filename.txt");
        for(int i=0; i<10; i++) myWriter.write("Testo numero "+i+"\n");
        myWriter.close();  // must close manually
        System.out.println("Fatto");

        File fail = new File("filename.txt");
        Scanner leggi = new Scanner(file);
        while(leggi.hasNextLine()) {
            String s = leggi.nextLine();
            System.out.println(s);
        }
        leggi.close();  // must close manually
        
    }
}