package es.santander.ascender.prueba;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {

    
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        /*// Creamos una instancia de la clase IngresoElemento
        IngresoElemento ingreso = new IngresoElemento();
        
        // Llamamos al método para crear el arreglo
        int[] arreglo = ingreso.crearArreglo();
        
        // Imprimimos el arreglo para verificar que los valores fueron ingresados correctamente
        System.out.println("\nLos valores ingresados en el arreglo son:");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("["  +arreglo[i]+ "],");
        }*/

        /*BusquedaUno busqueda = new BusquedaUno();
        String[] arreglo = new String[]{ "nicolas", "mirko", "noelia", "nicolas", "noelia"};
        String nombre = "noelia";

        int resultado = busqueda.DevolverIndice(arreglo, nombre);

        if (resultado == -1){
            System.out.println("No se ha encontrado el nombre");
        }else{
            System.out.println("Se ha encontrado el nombre en el indice: " + resultado);
        }*/

        /*try {
            Producto[] inventario = {
                new Producto("Arroz", 20.5),
                new Producto("Harina", 10.0),
                new Producto("Azúcar", 15.0)
            };

            Producto p = new Producto("", 0);
            Producto productoBuscado = p.buscarProducto(inventario, "Azúcar");
            System.out.println("Producto encontrado: " + productoBuscado.getNombre() + ", Precio: " + productoBuscado.getPrecio());

            // Intentamos buscar un producto que no existe
            productoBuscado = p.buscarProducto(inventario, "Sal");
            System.out.println("Producto encontrado: " + productoBuscado.getNombre() + ", Precio: " + productoBuscado.getPrecio());
        
        } catch (ProductoNoEncontradoException e) {
            System.out.println("Error: " + e.getMessage());
        }*/

        
                // Crear algunos productos de ejemplo
                ProductoMenu[] productos = {
                    new ProductoMenu("Pizza", 10.99),
                    new ProductoMenu("Hamburguesa", 5.99),
                    new ProductoMenu("Pasta", 8.50)
                };
        
                // Crear un objeto ProductoMenu y llamar al menú dentro de un bloque try-catch
                ProductoMenu menu = new ProductoMenu("", 0);
        
                try {
                    // Llamar al método elegirMenu que maneja el menú
                    char resultado = menu.elegirMenu(productos);
                    System.out.println("Resultado del menú: " + resultado);
                } catch (Exception e) {
                    // Capturar cualquier excepción y mostrar el mensaje de error
                    System.err.println("Se ha producido un error en el menú: " + e.getMessage());
                }
            }
        }
        
    

