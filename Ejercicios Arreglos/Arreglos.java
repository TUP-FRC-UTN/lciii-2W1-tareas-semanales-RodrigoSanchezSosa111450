package arreglos;

import java.util.Scanner;

public class Arreglos {

    /*1. Agregar a la clase Equipo (unidad 1) un arreglo con los datos de los jugadores. De cada jugador se conoce su nombre,
    posición (1: arquero, 2: defensor, 3: mediocampo, 4: delantero) número de camiseta, cantidad de partidos jugados y porcentaje
    de estado físico (100 equivale a un jugador sano y 0 a uno imposibilitado de jugar por lesiones).
    Desarrollar un programa que permita cargar todos los datos de un equipo y a continuación informe:
     Cantidad de jugadores con menos de 10 partidos jugados.
     Nombre del jugador con mayor cantidad de partidos jugados.
     Promedio de estado físico de todo el equipo.
     Estado físico de un jugador particular identificado por número de camiseta.
     Promedio de partidos jugados de los jugadores de cada posición (4 resultados).*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Jugador[] equipo;

        int cantJugMenDiezPart = 0;
        int compMasPJ = 0;
        String jugMasPJ = "";
        int acuEstFis = 0;
        double promEstFis;
        int cArq, cDef, cMed, cDel;
        int acuArq, acuDef, acuMed, acuDel;
        cArq = cDef = cMed = cDel = acuArq = acuDef = acuMed = acuDel = 0;

        System.out.print("Ingrese cantidad de jugadores: ");
        int cantidad = sc.nextInt();

        equipo = new Jugador[cantidad];

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese nombre del jugador " + i + ": ");
            sc.nextLine();
            String nombre = sc.nextLine();

            System.out.print("Ingrese posicion del jugador " + i + ": ");
            int posicion = sc.nextInt();

            System.out.print("Ingrese numero de camiseta del jugador " + i + ": ");
            int nroCamiseta = sc.nextInt();

            System.out.print("Ingrese partidos jugados por el jugador " + i + ": ");
            int pj = sc.nextInt();

            switch (posicion) {
                case 1:
                    cArq++;
                    acuArq += pj;
                    break;
                case 2:
                    cDef++;
                    acuDef += pj;
                    break;
                case 3:
                    cMed++;
                    acuMed += pj;
                    break;
                case 4:
                    cDel++;
                    acuDel += pj;
                    break;
                default:
                    break;
            }

            if (pj < 10) {
                cantJugMenDiezPart++;
            }

            if (i == 0) {
                jugMasPJ = nombre;
                compMasPJ = pj;
            } else if (pj > compMasPJ) {
                jugMasPJ = nombre;
                compMasPJ = pj;
            }

            System.out.print("Ingrese porcentaje de estado fisico del jugador " + i + ": ");
            int porcEstadoFis = sc.nextInt();
            acuEstFis += porcEstadoFis;

            equipo[i] = new Jugador(nombre, posicion, nroCamiseta, pj, porcEstadoFis);
        }

        promEstFis = (double) acuEstFis / cantidad;

        for (int i = 0; i < cantidad; i++) {
            System.out.println(equipo[i]);
        }
        
        double promPJArq = (double)acuArq / cArq;
        double promPJDef = (double)acuDef / cDef;
        double promPJMed = (double)acuMed / cMed;
        double promPJDel = (double)acuDel / cDel;

        System.out.println("Jugadores con menos de 10 partidos: " + cantJugMenDiezPart);
        System.out.println("Jugador con mas partidos jugados: " + jugMasPJ);
        System.out.println("Promedio de estado fisico: " + promEstFis);
        System.out.print("Ingrese un numero de camiseta para conocer su estado fisico: ");
        int nroCamEstFis = sc.nextInt();
        for (int i = 0; i < cantidad; i++) {
            if (equipo[i].getNroCamiseta() == nroCamEstFis) {
                System.out.println("Estado fisico del jugador con camiseta numero " + nroCamEstFis + ": " + equipo[i].getPorcEstadoFis());
                break;
            }
        }
        System.out.println("Promedio de partidos jugados por arqueros: " + promPJArq);
        System.out.println("Promedio de partidos jugados por defensores: " + promPJDef);
        System.out.println("Promedio de partidos jugados por mediocampo: " + promPJMed);
        System.out.println("Promedio de partidos jugados por delanteros: " + promPJDel);

    }

}
