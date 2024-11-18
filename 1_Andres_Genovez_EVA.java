/*En una biblioteca, se requiere un programa en Java que permita gestionar los libros disponibles y los préstamos realizados. El programa debe utilizar un HashMap para almacenar la información de los libros, donde la clave será el ISBN del libro (un número) y el valor será el número de copias disponibles en el inventario.
 
El programa debe incluir las siguientes funcionalidades mediante un menú interactivo: 

1. Agregar un libro al catálogo: 
o El usuario debe ingresar el ISBN del libro y la cantidad de copias disponibles. 
o Si el ISBN ya existe en el catálogo, se debe sumar la cantidad ingresada a la existente. 
o Si el ISBN no existe, se debe agregar al catálogo con la cantidad indicada. 
o Si el usuario ingresa una cantidad negativa, el programa debe mostrar un mensaje de error y no realizar ninguna acción. 

2. Prestar un libro: 
o El usuario debe ingresar el ISBN del libro que desea prestar. 
o Si el ISBN existe en el catálogo: 
■ Verificar si hay al menos una copia disponible. 
■ Si hay copias disponibles, reducir en 1 el número de copias en el inventario y mostrar un mensaje indicando que el préstamo se realizó con éxito. 
■ Si no hay copias disponibles, mostrar un mensaje indicando que no hay stock para realizar el préstamo. 
o Si el ISBN no existe en el catálogo, mostrar un mensaje indicando que el libro no está registrado. 

3. Devolver un libro: 
o El usuario debe ingresar el ISBN del libro que desea devolver. 
o Si el ISBN existe en el catálogo: 
■ Aumentar en 1 el número de copias disponibles en el inventario. 
■ Mostrar un mensaje indicando que la devolución se realizó con éxito. 
o Si el ISBN no existe en el catálogo, mostrar un mensaje indicando que el libro no pertenece al catálogo. 

4. Consultar disponibilidad de un libro:

El usuario debe ingresar el ISBN del libro para consultar la cantidad de copias disponibles.
Si el lSBN existe, mostrar la cantidad de copias disponibles.
Si el lSBN no existe, mostrar un mensaje indicando que el libro no está registrado.

5. Mostrar todos los libros disponibles:

El programa debe listar todos los libros del catálogo, mostrando el ISBN y la cantidad de copias disponibles.
Si el catálogo está vacío, debe mostrar un mensaje indicando que no hay libros registrados.

6. Salir del programa:
El programa debe finalizar.

Restricciones y validaciones:

En todas las operaciones, verificar si el ISBN existe en el catálogo antes de realizar
Acciones.

Si el usuario elige una opción inválida en el menú, debe mostrar un mensaje de
error y volver a mostrar el menú.

Evitar que el programa termine inesperadamente si el usuario introduce datos no
válidos.*/

/**
 *
 * @author agenovez
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Biblioteca {

    public static void main(String[] args) {
        // Crear un HashMap para gestionar el catálogo de libros
        Map<Integer, Integer> catalogo = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        int opcion;

        do {
            // Menú principal
            System.out.println("\n=== Menú de Gestión de Biblioteca ===");
            System.out.println("1. Agregar un libro al catálogo");
            System.out.println("2. Prestar un libro");
            System.out.println("3. Devolver un libro");
            System.out.println("4. Consultar disponibilidad de un libro");
            System.out.println("5. Mostrar todos los libros disponibles");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            
            while (!scanner.hasNextInt()) { // Validar entrada
                System.out.println("Por favor, ingrese un número válido.");
                scanner.next();
            }
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1: // Agregar un libro
                    System.out.print("Ingrese el ISBN del libro: ");
                    int isbn = scanner.nextInt();
                    System.out.print("Ingrese la cantidad de copias: ");
                    int cantidad = scanner.nextInt();

                    if (cantidad < 0) {
                        System.out.println("Error: La cantidad no puede ser negativa.");
                    } else {
                        catalogo.put(isbn, catalogo.getOrDefault(isbn, 0) + cantidad);
                        System.out.println("Libro agregado/actualizado en el catálogo.");
                    }
                    break;

                case 2: // Prestar un libro
                    System.out.print("Ingrese el ISBN del libro a prestar: ");
                    isbn = scanner.nextInt();

                    if (catalogo.containsKey(isbn)) {
                        if (catalogo.get(isbn) > 0) {
                            catalogo.put(isbn, catalogo.get(isbn) - 1);
                            System.out.println("Préstamo realizado con éxito.");
                        } else {
                            System.out.println("No hay copias disponibles para prestar.");
                        }
                    } else {
                        System.out.println("El libro con ISBN " + isbn + " no está registrado.");
                    }
                    break;

                case 3: // Devolver un libro
                    System.out.print("Ingrese el ISBN del libro a devolver: ");
                    isbn = scanner.nextInt();

                    if (catalogo.containsKey(isbn)) {
                        catalogo.put(isbn, catalogo.get(isbn) + 1);
                        System.out.println("Devolución realizada con éxito.");
                    } else {
                        System.out.println("El libro con ISBN " + isbn + " no pertenece al catálogo.");
                    }
                    break;

                case 4: // Consultar disponibilidad
                    System.out.print("Ingrese el ISBN del libro: ");
                    isbn = scanner.nextInt();

                    if (catalogo.containsKey(isbn)) {
                        System.out.println("Cantidad disponible: " + catalogo.get(isbn));
                    } else {
                        System.out.println("El libro con ISBN " + isbn + " no está registrado.");
                    }
                    break;

                case 5: // Mostrar todos los libros
                    if (catalogo.isEmpty()) {
                        System.out.println("No hay libros registrados en el catálogo.");
                    } else {
                        System.out.println("\n=== Libros en el Catálogo ===");
                        for (Map.Entry<Integer, Integer> entry : catalogo.entrySet()) {
                            System.out.println("ISBN: " + entry.getKey() + " | Copias disponibles: " + entry.getValue());
                        }
                    }
                    break;

                case 6: // Salir
                    System.out.println("Saliendo del programa.");
                    break;

                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
        } while (opcion != 6);

        scanner.close();
    }
}
