import java.util.Scanner;

/**
 * 
 */

/**
 * @author David
 * 10.	Dados dos array de enteros de tamaños N y M respectivamente, 
 *      concatenarlos en un nuevo array de tamaño N+M, es decir si los arrays 
 *      de entrada son por ejemplo: 5 -1 -3 15 4 y 3 4 2, el array concatenado 
 *      resultado deberá ser: 5 -1 -3 15 4 3 4 2. 
 */
public class Ej10 {

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
		
		System.out.println("¿Cuantos elementos quieres?: ");
		int tam2 = entrada.nextInt();
		int vector2[] = new int[tam2];
		System.out.println("Introduce el vector 2: ");
		Vectores.pedir_vector(vector2);
		
		System.out.println("tu vector es: ");
		Vectores.mostrar_vector(vector2);
		
		int vectorRes [] = Vectores.concatenar(vector, vector2);
		System.out.println("El vector concatenado es ");
		Vectores.mostrar_vector(vectorRes);

	}

}
