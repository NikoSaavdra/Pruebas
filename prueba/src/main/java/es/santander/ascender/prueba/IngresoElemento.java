package es.santander.ascender.prueba;

import java.util.Scanner;

public class IngresoElemento {
    
    // Se ingresa el tamaño del array 
    // Se ingresara los elementos a una array


    public int[] crearArreglo(){

        Scanner valor = new Scanner( System.in);

        System.out.println("Ingrese la cantidad de elemetos del array");
        int cantidad = valor.nextInt();

        int[] array = new int[cantidad];

        System.out.println("Ingrese los " + cantidad + " valores");
        
      

     
        for(int i = 0; i< cantidad; i ++){

            System.out.print("Elemento " + (i + 1) + ": ");

            array[i] = valor.nextInt();

        }



        return array;
    }

}


    // Se sumaran los elemtos 
    // SE Obtendra el promedio de la sumatoria y su cantidad
    // Ingresa un indice por teclado y se tiene su contenido
    // Se ingresa un numero y se valida si está en el array
    
