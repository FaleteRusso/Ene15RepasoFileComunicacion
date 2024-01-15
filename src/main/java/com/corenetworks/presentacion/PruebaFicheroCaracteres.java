package com.corenetworks.presentacion;

import java.io.FileWriter;
import java.io.IOException;

public class PruebaFicheroCaracteres {
    public static void main(String[] args) {
        FileWriter f1 = null;
        try {
            f1 = new FileWriter("salida.txt");
            f1.write("Buen inicio de semana!!!");
            f1.flush();
        } catch (IOException e) {
            System.out.println(e.toString());
        }

    }
}
