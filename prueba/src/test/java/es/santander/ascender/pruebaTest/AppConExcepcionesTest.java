package es.santander.ascender.pruebaTest;

import org.junit.jupiter.api.Test;

import es.santander.ascender.prueba.AppConExcepciones;

public class AppConExcepcionesTest {


    @Test
    public void testValidarIndice(){

        try {

            AppConExcepciones ap = new AppConExcepciones();

        float [] lista = {8.0f, 7.0f, 8.0f, 5.5f};

         ap.devolverValorEnIndice(lista,45);

            
        } catch (Exception e) {
            System.err.println("Se ha producido un error: " + e.getMessage());
        }

        


    }
}
