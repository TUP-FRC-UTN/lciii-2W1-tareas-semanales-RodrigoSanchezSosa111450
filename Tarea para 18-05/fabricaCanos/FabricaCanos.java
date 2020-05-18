package fabricacanos;

import java.util.Scanner;

public class FabricaCanos {

    /*3. Una empresa que fabrica caños de diferentes tipos, materiales y medidas está desarrollando un sistema para automatizar 
    la planificación y control de su circuito productivo. Suponga que usted es parte del equipo de desarrollo y le asignan la siguiente tarea:
 Desarrolle la clase Material de manera que contenga en su interior los atributos: descripción (String) código(int) valorUnitario (float).
 Desarrolle la clase Producto de manera que contenga en su interior los atributos descripción (String) y Materiales (Material[]).
 Desarrolle en la clase Producto un constructor que reciba por parámetro una cantidad de elementos y dimensione el vector de materiales.
 Desarrolle en la clase Producto un método que permita agregar un Material recibido por parámetro al vector.
 Desarrolle en la clase Producto un método que retorne el costo total. Dicho valor se calcula sumando todos los valores unitarios de los Materiales 
    que componen el Producto.
 Desarrolle en la clase Producto un método que reciba por parámetro un código de material y retorne true si dicho material forma parte del Producto.
 Desarrolle en la clase producto un método que retorne un vector con todos los materiales que tengan un valor unitario menor a un parámetro.
 Desarrolle en la clase producto un método que retorne un vector donde cada casillero contenga la cantidad de materiales por precio, siguiendo las 
    siguiente regla: Si 0 < precio ≤ 10 contarlo en el primer casillero. Si 10 < precio ≤ 20 contarlo en el segundo casillero. Si 20 < precio ≤ 30 
    contarlo en el tercer casillero. Si precio > 30 contarlo en el cuarto casillero.
 Desarrolle un programa principal que permita ingresar los datos de un producto, cree un objeto de esa clase y luego posibilite mediante un menú 
    llamar a los métodos de los puntos 4 a 8 todas las veces y en el orden que el usuario quiera.*/
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Indique nombre del producto: ");
        String descripcion = sc.nextLine();
        System.out.print("Indique la cantidad de materiales: ");
        int cantMateriales = sc.nextInt();

        Producto p = new Producto(descripcion, cantMateriales);

        int opcion;

        do {
            System.out.println("");//para dejar un espacio luego de cada iteración
            System.out.println("Elija una opción sobre su producto:");
            System.out.println("1) Agregar material.");
            System.out.println("2) Costo total.");
            System.out.println("3) Material en producto.");
            System.out.println("4) Materiales menores a un precio.");
            System.out.println("5) Listar cantidad de materiales por precio.");
            System.out.println("6) Salir.");
            opcion = sc.nextInt();

            if (opcion == 1) {
                System.out.print("Ingrese descripción del material: ");
                sc.nextLine();
                String descripcionMat = sc.nextLine();
                System.out.print("Ingrese el código del material: ");
                int codigoMat = sc.nextInt();
                System.out.print("Ingrese valor del material: ");
                double valorUnitarioMat = sc.nextDouble();
                Material mat = new Material(descripcionMat, codigoMat, valorUnitarioMat);
                p.agregarMaterial(mat);
                System.out.println("Creado: " + mat.toString());
            } else if (opcion == 2) {
                System.out.println("Costo total del producto: " + p.costoTotal());
            } else if (opcion == 3) {
                System.out.print("Ingrese un código de material: ");
                int codigoMatEnProd = sc.nextInt();
                if (p.existeMaterial(codigoMatEnProd) == true) {
                    System.out.println("El producto contiene este material.");
                } else {
                    System.out.println("El producto no contiene este material.");
                }
            } else if (opcion == 4) {
                System.out.print("Ingrese un monto máximo:");
                double montoMax = sc.nextDouble();
                System.out.println(p.materialesMenoresParam(montoMax)); //???
            } else {
                System.out.println("Cantidad de materiales por precio:");
                System.out.println(p.cantPorPrecio());
            }
        } while (opcion != 6);

        /*
        Producto p = new Producto("Puerta", 4);
        Material m = new Material();
        
        m.setCodigo(1);
        m.setDescripcion("Chapa 1mm");
        m.setValorUnitario(100);
        
         m.setCodigo(2);
        m.setDescripcion("Chapa");
        m.setValorUnitario(20);
        
        p.agregarMaterial(m);

        Material[] materiales = p.materialesMenoresParam(50);
        System.out.println("Los materiales con valor unitario menor a 50 son: ");
        for (int i = 0; i < materiales.length; i++) {
            if (materiales[i] != null) {
                System.out.println(materiales[i].toString());
            }

        }*/
    }

}
