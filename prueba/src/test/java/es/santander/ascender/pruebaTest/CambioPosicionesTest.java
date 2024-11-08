package es.santander.ascender.pruebaTest;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

import es.santander.ascender.prueba.CambioPosiciones;

public class CambioPosicionesTest {
     
    @Test
    public void testcrearInvirtiendoOrden( ){


        CambioPosiciones cut = new CambioPosiciones();

        int[] origenParaLaPrueba = {3, 6, 4, 7};

        int[] resultado = cut.crearInvirtiendoOrden(origenParaLaPrueba); // envio el arreglo como parametro

        assertArrayEquals( new int[] {7, 6, 4, 3}, resultado);
       
        

      
      

    }
}
