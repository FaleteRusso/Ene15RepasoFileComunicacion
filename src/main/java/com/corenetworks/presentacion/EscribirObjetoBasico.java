package com.corenetworks.presentacion;

import com.corenetworks.modelo.Pedido;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EscribirObjetoBasico {
    public static void main(String[] args) {
//instacias 3 pedidos
        Pedido p1=new Pedido(1,"juan lopez",1000.00,"correos");
        Pedido p2 =new Pedido(2,"Cristina Sifuentes",248,"MRW");
        Pedido p3 = new Pedido(3,"Ana Torrija",487,"Tienda");

        try (FileOutputStream f1=new FileOutputStream("Pedidos.dat");
             ObjectOutputStream o1=new ObjectOutputStream(f1);
             ObjectOutputStream o2=new ObjectOutputStream(new FileOutputStream("Pedidos2.dat"))){
        o1.writeObject(p1);
            o1.writeObject(p2);
            o1.writeObject(p3);
            o1.flush();

        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
