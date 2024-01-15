package com.corenetworks.presentacion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorEj1 {
    public static void main(String[] args) {
        BufferedReader mE;
        PrintWriter mS;
        String respuesta;
        int cantidad =0;
        try(ServerSocket servidor = new ServerSocket(3001);) {
            while(true){
                System.out.println("Esperando peticion ...");
                Socket s1 = servidor.accept();
                mE = new BufferedReader(new InputStreamReader(s1.getInputStream()));
                respuesta= mE.readLine();
                System.out.println(respuesta);
                System.out.println(respuesta.substring(10).strip());


                mS = new PrintWriter(s1.getOutputStream(),true);
                mS.printf("El total de la compra es %.2f€ %n",(cantidad*2.0));



            }
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}