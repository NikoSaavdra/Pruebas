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
        
        
    }

    }


}
