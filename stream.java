import java.io.*;

 class WriteLines {
   public WriteLines(String filename) throws IOException {
        // Crea il PrintWriter incapsulando FileWriter
        PrintWriter output = new PrintWriter(new FileWriter(filename));
        
        // Crea il BufferedReader incapsulando InputStreamReader per leggere da console
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Inserisci le linee di testo (lascia vuoto per terminare):");
        String linea = input.readLine();
        
        // Continua a leggere e scrivere fino a quando la linea non è vuota
        while (!linea.equals("")) {
            output.println(linea);
            linea = input.readLine();
        }
        
        // Chiude gli stream
        input.close();
        output.close();
    }

    public static void main(String[] args) {
        try {
            // Specifica il nome del file di output
            new WriteLines("output.txt");
            System.out.println("Scrittura completata su output.txt");
        } catch (IOException e) {
            System.out.println("Si è verificato un errore: " + e.getMessage());
        }
    }
}
