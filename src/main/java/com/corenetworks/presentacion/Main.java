package com.corenetworks.presentacion;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File f1 = new File("archavo_ejemplo.txt");
        System.out.println("nombre del archivo"+f1.getName());
        System.out.println("Ruta absoluta"+f1.getAbsolutePath());
        System.out.println("Es uns carpeta?" + f1.isDirectory());
        System.out.println("es un fichero?"+ f1.isFile());
        System.out.println("ultima modificacion?" + f1.lastModified());

        //Crear una carpeta
        File f2= new File("Documentos");
        if (!f2.exists()){
            System.out.println(f2.mkdir());
        }
        System.out.println("nombre de la carpeta " + f2.getName());
        System.out.println("Ruta absoluta"+f2.getAbsolutePath());
        System.out.println("Es uns carpeta?" + f2.isDirectory());
        System.out.println("es un fichero?"+ f2.isFile());
        System.out.println("ultima modificacion?" + f2.lastModified());
    }
}
