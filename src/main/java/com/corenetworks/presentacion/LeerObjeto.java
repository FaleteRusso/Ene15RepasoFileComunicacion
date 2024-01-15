package com.corenetworks.presentacion;

import com.corenetworks.modelo.Pedido;

import java.io.*;

public class LeerObjeto {
    public static void main(String[] args) {
        Pedido p1 = null;
        try (ObjectInputStream o1 = new ObjectInputStream(new FileInputStream("pedidos.dat"))) {
                while (true){
                    p1 = (Pedido) o1.readObject();
                    if(p1 == null){
                        break;
                    }
                    System.out.println(p1.toString());
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println(e.toString());
        } catch (ClassNotFoundException e) {
            System.out.println(e.toString());
        }
    }
}
