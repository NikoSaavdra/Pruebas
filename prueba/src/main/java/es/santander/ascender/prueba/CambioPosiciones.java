package es.santander.ascender.prueba;

public class CambioPosiciones {

    public int[] crearInvirtiendoOrden( int[] origen){


        int[] destino = new int[origen.length];
       
        for(int i=0; i < origen.length; i ++){

              destino[destino.length - (i + 1)] = origen[i];

        }

      
      return destino;

    }
}
