package comercio;

import java.util.Scanner;

public class Comercio {

    /*1. En un comercio se mantienen los datos de sus clientes, algunos de los cuales son de confianza suficiente para 
    comprar al fiado. Programar dos clases llamadas Cliente y ClientePreferencial respectivamente aplicando herencia. 
    Sobreescribir el método toString e incluir constructores con parámetros en cada una de ellas.
    De cada cliente se conoce su número, nombre y teléfono, mientras que de los clientes preferenciales se conoce 
    adicionalmente su saldo, límite (saldo máximo) y su domicilio.*/
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Cliente c = new Cliente("Luis", 1, "4554466");
        
        ClientePreferencial cp = new ClientePreferencial("Juan", 2, "1144998822");
        
        cp.setLimite(200);
        cp.setSaldo(115);
        cp.setDomicilio("Av. UTN 123");
        
        /*
        Cliente cp = new ClientePreferencial("Juan", 2, "1144998822");
        */
        
        System.out.println(c);
        System.out.println(cp);
    }

}
