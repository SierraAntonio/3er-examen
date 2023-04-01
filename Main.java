package paclk1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
        int inicioRenglon = 599;
        int numRenglones = 50;
        String archivoEntrada = "C:\\Users\\Antonio\\Documents\\emails.cvss";
        String archivoSalida = "conteoPalabras.txt";

        Map<String, Integer> conteoPalabras = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(archivoEntrada))) {
            String linea;
            int numRenglonActual = 0;
            while ((linea = br.readLine()) != null && numRenglonActual < inicioRenglon + numRenglones) {
                numRenglonActual++;
                if (numRenglonActual <= inicioRenglon) {
                    continue;
                }
                String[] palabras = linea.split(",");
                for (String palabra : palabras) {
                    int cuenta = conteoPalabras.getOrDefault(palabra, 0);
                    conteoPalabras.put(palabra, cuenta + 1);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileWriter fw = new FileWriter(archivoSalida)) {
            for (int i = 0; i < 3000; i++) {
                int cuenta = conteoPalabras.getOrDefault(String.valueOf(i), 0);
                fw.write(cuenta + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
       
    }
}
