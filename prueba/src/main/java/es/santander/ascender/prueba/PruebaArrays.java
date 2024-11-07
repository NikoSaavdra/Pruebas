package es.santander.ascender.prueba;

import java.util.Scanner;

public class PruebaArrays {

    // Se necesita un array de 100 elementos

    public int [] crearArray(){
        
        // Se crea la variable de arreglo del objeto, de 100 elementos
        int[] arreglo = new int[100]; 

        for ( int i=0; i< 100; i ++){
          
            arreglo[i] = i;

        }

        return arreglo;
    }

    // suma los elementos de una arrray

    public int sumarElementos(){

        int[] arregloUno = {2, 8, 9, 7, 9};
        int total = 0;

        for(int i=0; i < arregloUno.length; i ++){
                   
            total += arregloUno[i];
            
        }
        return total;
    }

    // Método adicional para retornar el arreglo
    public int[] obtenerArreglo() {
        return new int[] {2, 8, 9, 7, 9};
    }

    // Se ingresa un arreglo y un indice, quiere saber el contenido del indice.

    public int conocerContenido(){

        int[] arrayDos = {5 ,8 ,9 ,9 ,6 ,8 };
        
        int indice = 3;

          /*// En el caso que se quiera ingresar el contenido por teclado
          int tamaño = arrayDos.length - 1;
          Scanner scanner = new Scanner(System.in);
          System.out.print("Ingrese el numero de indice entre 0" + tamaño);
          
          int ind = scanner.nextInt(); // Se obtiene el indice*/



        int contenido = arrayDos[indice];

        return contenido;
        
    }

    public int[] enviarArray(){
            
        return new int[] {5 ,8 ,9 ,9 ,6 ,8 };

    }

    

    

}
