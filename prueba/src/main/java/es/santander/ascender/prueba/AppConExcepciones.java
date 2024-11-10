package es.santander.ascender.prueba;

public class AppConExcepciones {

    // Se ingresa un array y un indice como argumentos y se debe encontrar su contenido

    public float devolverValorEnIndice(float[] lista, int indiceABuscar) throws Exception  {
        if (indiceABuscar < 0) {
            throw new Exception("Me has pedido un índice negativo: " + indiceABuscar);
        } else {
            if (indiceABuscar >= lista.length) {
                throw new Exception("Me has pedido un índice mayor que los permitidos: " + indiceABuscar);
            }
        }
        return lista[indiceABuscar];
    }
    public double sumarValores(double[] valores) {
        double suma = 0.0;
        for (int i = 0; i < valores.length; i++) {
            suma = suma + valores[i];
        }
        return suma;
    }
    public double calcularMediaValores(double[] valores) {
        double suma = sumarValores(valores);
        return suma/valores.length;
    }
}
