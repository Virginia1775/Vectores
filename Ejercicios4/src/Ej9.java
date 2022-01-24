import java.util.Scanner;

/**
 * 
 */

/**
 * @author David
 * 9.	Dado un array de enteros de tamaño N, copiarlo a otro array de igual tamaño,
 *      pero de forma inversa, es decir, si por ejemplo el array de entrada 
 *      es: 5 -1 -3 15 4, el resultado debe ser un nuevo array cuyos valores 
 *      son: 4 15 -3 -1 5.
 */
public class Ej9 {

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
		
		//int inverso [] = new int[tam];
		//Vectores.invertir_vector(vector, inverso);
		int inverso [] = Vectores.invertir_vector(vector);
		
		System.out.println("tu vector invertido es: ");
		Vectores.mostrar_vector(inverso);

	}

}
