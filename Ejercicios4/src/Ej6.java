import java.util.Scanner;

/**
 * 
 */

/**
 * @author David
 * 6.	Dado un array de enteros de tamaño N, se debe buscar el primer elemento del 
 *      array mayor que un número A, y a partir de él inclusive, visualizar todos los 
 *      valores de los siguientes hasta el último elemento del array.
 */
public class Ej6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("¿Cuantos elementos quieres?: ");
		int tam = entrada.nextInt();
		
		int vector[] = new int[tam];
		
		System.out.println("Introduce el vector: ");
		Vectores.pedir_vector(vector);
		
		System.out.println("tu vector es: ");
		Vectores.mostrar_vector(vector);
		
		System.out.println("Introduce un número: ");
		int a = entrada.nextInt();
		
		System.out.printf("Los números que hay en el vector a partir de %d son: ", a);
		Vectores.mostrar_vector_a_partir_a(vector, a);

	}

}
