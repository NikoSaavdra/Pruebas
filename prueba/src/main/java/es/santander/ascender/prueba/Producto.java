package es.santander.ascender.prueba;

/*
 * Imagina que estás desarrollando una aplicación para gestionar 
 * una lista de productos en una tienda. La lista de productos 
 * está representada por un arreglo de objetos de tipo Producto. 
 * Cada objeto Producto tiene dos atributos: nombre (una cadena de texto) y 
 * precio (un valor numérico de tipo double).

    Escribe un método llamado buscarProducto que reciba el arreglo 
    de productos y el nombre de un producto que se desea buscar. 
    El método debe devolver el objeto Producto que coincida con el nombre dado. 
    Si el producto no se encuentra, el método debe lanzar 
    una excepción personalizada llamada ProductoNoEncontradoException
 */

 // Se debe crear la clase producto

// Excepción personalizada
class ProductoNoEncontradoException extends Exception {
    public ProductoNoEncontradoException(String mensaje) {
        super(mensaje);
    }
}

public class Producto {
    private String nombre;
    private double precio;

    // Crear el constructor
public Producto(String nombre, double precio){
    this.nombre = nombre;
    this.precio = precio;
   }

    // GETTERS para acceder a los atributos
    public String getNombre(){

       return nombre;
    }

    public double getPrecio(){

        return precio;
    }





public Producto buscarProducto( Producto[] productos , String nombre) throws ProductoNoEncontradoException{

    if( productos.length == 0){
        throw new ProductoNoEncontradoException("No se han encontrado productos en el inventario.");
    }

        for( int i = 0; i <  productos.length; i ++){
            
            if(productos[i].getNombre().equals(nombre)){

                return productos[i] ;

            }
        }

    // Si el producto no se encuentra, lanzamos la excepción
    throw new ProductoNoEncontradoException("Producto '" + nombre + "' no encontrado en el inventario.");
    

    
}

}






