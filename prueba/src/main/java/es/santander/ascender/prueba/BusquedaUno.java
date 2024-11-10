package es.santander.ascender.prueba;

/*
 * Implemente un algoritmo que reciba un arreglo de cadenas de texto y 
 * un texto de búsqueda, y devuelva el índice de la primera ocurrencia de la cadena buscada en el arreglo. 
 * Si la cadena no se encuentra en el arreglo, debe devolver -1.
 */

 // Puede señ que el texto aparezca varias veces en el arreglo, debe 
 // el indice del primero encontrado.
public class BusquedaUno {

    public int DevolverIndice( String[] arreglo, String texto){

          
        for( int i = 0; i < arreglo.length; i ++){ 
            
            if( arreglo[i].equals(texto)){
            
                return i;
             
            }
        }
    
        return -1;

        }
       

    }

