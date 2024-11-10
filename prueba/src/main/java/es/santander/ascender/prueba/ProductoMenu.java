package es.santander.ascender.prueba;

import java.util.Scanner;

/*
 * Crea un programa en Java que simule un menú de opciones para una tienda. El programa debe mostrar un menú con las siguientes opciones:

    Ver productos disponibles
    Realizar una compra
    Consultar saldo
    Salir

El programa debe utilizar una estructura switch para gestionar la selección del usuario. Dependiendo de la opción seleccionada, el programa debe 
   realizar las siguientes acciones:

    Opción 1: Mostrar un mensaje que simule la lista de productos disponibles (por ejemplo, "Producto A", "Producto B", "Producto C").
    Opción 2: Solicitar al usuario el nombre de un producto y su precio, y mostrar un mensaje simulando que la compra se ha realizado con éxito.
    Opción 3: Mostrar un mensaje que indique el saldo actual (puedes simular un saldo inicial de, por ejemplo, 1000 unidades monetarias).
    Opción 4: Salir del programa.

Utiliza un ciclo while para seguir mostrando el menú hasta que el usuario elija la opción de salir (opción 4).
 */


 public class ProductoMenu {
 
     private String nombre;
     private double precio;
 
     // Constructor de la clase
     public ProductoMenu(String nombre, double precio) {
         this.nombre = nombre;
         this.precio = precio;
     }
 
     // Getters para acceder a las variables
     public String getNombre() {
         return nombre;
     }
 
     public double getPrecio() {
         return precio;
     }
 
     // Método para manejar la interacción con el menú
     public char elegirMenu(ProductoMenu[] productos) throws Exception {
         Scanner valorEntrada = new Scanner(System.in);
         boolean sigue = true;
         
         while (sigue) {
             System.out.println("Seleccione una opción: ");
             System.out.println("1. Ver productos disponibles");
             System.out.println("2. Buscar producto por nombre");
             System.out.println("3. Salir");
 
             // Leer la opción del menú
             int opcion = valorEntrada.nextInt();
             valorEntrada.nextLine(); // Consumir la nueva línea después de leer el número
 
             if (opcion < 1 || opcion > 3) {
                 throw new Exception("Opción no válida, por favor intente nuevamente.");
             }
 
             switch (opcion) {
                 case 1:
                     // Mostrar productos disponibles
                     for (int i = 0; i < productos.length; i++) {
                         System.out.println("Producto: " + productos[i].getNombre());
                     }
                     // Pedir al usuario que elija si desea volver o salir
                     char respuesta = elegir(valorEntrada);
                     if (respuesta == 'S' || respuesta == 's') {
                         sigue = false;
                     }
                     break;
 
                 case 2:
                     // Buscar un producto por nombre
                     System.out.println("Ingrese el nombre del producto:");
                     String nombreBuscado = valorEntrada.nextLine();
                     boolean encontrado = false;
 
                     for (int i = 0; i < productos.length; i++) {
                         if (productos[i].getNombre().equals(nombreBuscado)) {
                             double precio = productos[i].getPrecio();
                             System.out.println("Producto: " + nombreBuscado + " tiene un precio de: " + precio);
                             encontrado = true;
                             break;
                         }
                     }
 
                     if (!encontrado) {
                         System.out.println("Producto no encontrado.");
                     }
 
                     // Pedir al usuario que elija si desea volver o salir
                     char respuestaBusqueda = elegir(valorEntrada);
                     if (respuestaBusqueda == 'S' || respuestaBusqueda == 's') {
                         sigue = false;
                     }
                     break;
 
                 case 3:
                     // Salir del menú
                     System.out.println("Ha salido del menú.");
                     sigue = false;
                     break;
             }
         }
 
         valorEntrada.close(); // Cerrar el scanner al final del programa
         return 'S'; // Retornar un valor de ejemplo, aunque no se necesite en este caso
     }
 
     // Método para elegir si volver o salir
     public char elegir(Scanner input) {
         System.out.println("Presione cualquier tecla para volver al Menú o 'S' para salir.");
 
         String respuesta = input.nextLine();
         if (respuesta.length() > 0) {
             return respuesta.charAt(0);
         } else {
             return 'S'; // Si no se ingresa nada, por defecto consideramos que se desea salir
         }
     }
 }
 
