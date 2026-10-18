
package unida.appmenu;

import java.util.Scanner;

public class AppMenu {

    public static void main(String[] args) {
        //Instanciamos el Scanner para leer los datos desde la consola 
        Scanner scanner = new Scanner(System.in);
        
        //Instanciamos la clase de operaciones para usar sus metodos 
        MenuOperaciones operaciones = new MenuOperaciones();
        
        int opcion = 0; //Variable para almacenar la opcion elegida 
        
        do{
            //Mostramos las opciones del menu en pantalla 
            System.out.println("/n==== MENU INTERACTIVO EN JAVA ====");
            System.out.println("1. Saludar  usuario");
            System.out.println("2. Calcular el cuadrado de un numero");
            System.out.println("3. Salir");
            System.out.println("Elija una opcion (1-3): ");
            
            //Leemos la opcion numerica ingresada por el usuario 
            opcion = scanner.nextInt();
            
            //Evaluamos la opcion con la estructura switch 
            switch (opcion){
                case 1:
                    scanner.nextLine(); //limpiamos el buffer del enter pendiente 
                    System.out.println("Ingrese su nombre: "); 
                    String nombre = scanner.nextLine();
                    operaciones.mostrarSaludo(nombre); //llamamos al metodo 
                    break;
                    
                case 2:
                    System.out.println("Ingrese un numero entero: ");
                    int num = scanner.nextInt();
                    int resultado = operaciones.calcularCuadrado(num);
                    System.out.println("El cuadrado de " + num + "es: " + resultado);
                    break;
                    
                case 3:
                    System.out.println("Saliendo del sistema... ¡Mucho exito en tu examen!");
                    break;
                    
                default:
                    System.out.println("Opcion invalida. Por Favor, elija un numero entre 1 y 3. ");
            } 
        } while (opcion != 3); //el ciclo se repite mientras la opcion sea diferente de 3 
        
        //cerramos el scanner para liberar recursos de memoria 
        scanner.close () ;
    }
}
 
