package es.santander.ascender.prueba;

public class PruebaArrays {

    // Se necesita un array de 100 elementos

    public int [] crearArray(){
        
        // Se crea la variable de arreglo del objeto, de 100 elementos
        int[] arreglo = new int[100]; 

        for ( int i=0; i<= 100; i ++){
          
            arreglo[i] = i;

        }

        return arreglo;
    }

}
