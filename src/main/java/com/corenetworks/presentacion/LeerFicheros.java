package com.corenetworks.presentacion;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class LeerFicheros {
    public static void main(String[] args) {
        try(FileReader f1= new FileReader("salida.txt");
            FileWriter fw = new FileWriter("MAYUSCULAS.txt")) {
            int letra = 0;
            String texto ="";
            while (true){
            letra=f1.read();
            texto+=Character.toString((char) letra);
            System.out.println((char) letra);
            if(letra==-1){
                break;
            }
            }
            System.out.println();
            System.out.println();
            System.out.println(texto.toUpperCase());
            fw.write((texto.toUpperCase()));
            fw.flush();

        } catch (FileNotFoundException e) {

            System.out.println(e.toString());
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
