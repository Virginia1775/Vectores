import java.util.Scanner;

/**
 * 
 */

/**
 * @author David
 * Programa que calcula el producto escalar de dos vectores pedidos por teclado
 */
public class Ej12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("¿Cuantos elementos quieres?: ");
		int tam = entrada.nextInt();
		
		int vector[] = new int[tam];
		System.out.println("Introduce el vector 1: ");
		Vectores.pedir_vector(vector);
		
		int vector2[] = new int[tam];
		System.out.println("Introduce el vector 2: ");
		Vectores.pedir_vector(vector2);
		
		System.out.println("tu vector1 es: ");
		Vectores.mostrar_vector(vector);
		
		System.out.println("tu vector2 es: ");
		Vectores.mostrar_vector(vector2);
		
		System.out.printf("El prodcuto escalar de los dos vectores es %d: ", 
				Vectores.producto_escalar(vector, vector2));

	}

}
