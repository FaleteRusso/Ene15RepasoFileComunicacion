package com.corenetworks.presentacion;

import java.io.*;
import java.net.Socket;

public class ClienteEj1 {
    public static void main(String[] args) {
        String articulo= "Pera";
        int cantidad = 4;
        try (Socket cl = new Socket("localhost", 3001);) {
            PrintWriter sSalida = new PrintWriter(cl.getOutputStream(), true);
            sSalida.printf("%10s%d %n",articulo,cantidad);
            try (BufferedReader bf = new BufferedReader(new InputStreamReader(cl.getInputStream()));) {
                System.out.println(bf.readLine());
            }


        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
