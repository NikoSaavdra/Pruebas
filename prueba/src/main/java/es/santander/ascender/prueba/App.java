package es.santander.ascender.prueba;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        // Creamos una instancia de la clase IngresoElemento
        IngresoElemento ingreso = new IngresoElemento();
        
        // Llamamos al método para crear el arreglo
        int[] arreglo = ingreso.crearArreglo();
        
        // Imprimimos el arreglo para verificar que los valores fueron ingresados correctamente
        System.out.println("\nLos valores ingresados en el arreglo son:");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Elemento " + (i + 1) + ": " + arreglo[i]);
        }
    }
}
