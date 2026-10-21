/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ordenamientoburbuja;

/**
 *
 * @author Guadalupe
 */
import java.util.Arrays;

public class OrdenamientoBurbuja {

    public static void ordenamientoBurbuja(int[] arreglo) {
        for (int pasada = 0; pasada < arreglo.length - 1; pasada++) {
            for (int j = 0; j < arreglo.length - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    int auxiliar = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = auxiliar;
                }
            }
        }
    }

    public static void ordenamientoBurbujaMejorado(int[] arreglo) {
        for (int pasada = 0; pasada < arreglo.length - 1; pasada++) {
            boolean huboIntercambio = false;

            for (int j = 0; j < arreglo.length - 1 - pasada; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    int auxiliar = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = auxiliar;
                    huboIntercambio = true;
                }
            }

            if (!huboIntercambio) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[][] pruebas = {
            {5, 3, 8, 2, 1},
            {1, 2, 3, 5, 4},
            {1, 2, 3, 4, 5}
        };

        String[] nombres = {
            "Arreglo desordenado",
            "Arreglo parcialmente ordenado",
            "Arreglo ordenado"
        };

        for (int i = 0; i < pruebas.length; i++) {
            int[] tradicional = pruebas[i].clone();
            int[] mejorado = pruebas[i].clone();

            System.out.println("\n" + nombres[i]);
            System.out.println("Inicial:     "
                    + Arrays.toString(pruebas[i]));

            ordenamientoBurbuja(tradicional);
            System.out.println("Tradicional: "
                    + Arrays.toString(tradicional));

            ordenamientoBurbujaMejorado(mejorado);
            System.out.println("Mejorado:    "
                    + Arrays.toString(mejorado));
        }
    }
}