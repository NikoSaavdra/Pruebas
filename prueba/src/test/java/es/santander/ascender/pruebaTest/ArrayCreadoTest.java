package es.santander.ascender.pruebaTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import es.santander.ascender.prueba.PruebaArrays;

public class ArrayCreadoTest {

    
    @Test
    public void testCrearArray(){

        PruebaArrays Prueba = new PruebaArrays(); 

    // crea un array nuevo para pasa los elemento

    int[] resultado = Prueba.crearArray();

    
    assertNotNull(resultado);
    assertEquals(100, resultado.length);
    for (int i = 0 ; i < 100; i++) {
        assertEquals(i, resultado[i]);
        
        
    } }

    @Test
    public void testSumarELementos(){

        PruebaArrays Prueba = new PruebaArrays(); 
        

       int acum = Prueba.sumarElementos(); // Tengo el acumulado del prog.principal
       int[] arregloUno = Prueba.obtenerArreglo();
       
       int total = 0;
       
       
       for (int i = 0 ; i < arregloUno.length; i++) {
        
              total += arregloUno[i];
              
        } 
       
        assertEquals(5, arregloUno.length);
        assertEquals(acum, total);

    }

    
    @Test
    public void testConocerContenido(){

        PruebaArrays Prueba = new PruebaArrays();

        int[] nuevo = Prueba.enviarArray();
        int resultadoContenido = Prueba.conocerContenido();

        assertEquals(resultadoContenido, nuevo[3]);

    }










}
