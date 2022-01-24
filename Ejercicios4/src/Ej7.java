import java.util.Scanner;

/**
 * 
 */

/**
 * @author David
 * 7.	Dados dos arrays de reales de tamaño N, suponiendo que modelan dos vectores 
 *      de un espacio N-dimensional, decir si son paralelos o no. Son paralelos si todos 
 *      sus valores son proporcionales
 */
public class Ej7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("¿Cuantos elementos quieres?: ");
		int tam = entrada.nextInt();
		
		float vector[] = new float[tam];
		float vector2[] = new float[tam];
		
		System.out.println("Introduce el vector 1: ");
		Vectores.pedir_vector(vector);
		
		System.out.println("Introduce el vector 2: ");
		Vectores.pedir_vector(vector2);
		
		System.out.println("Los vectores son: ");
		Vectores.mostrar_vector(vector);
		Vectores.mostrar_vector(vector2);
		
		//boolean res = Vectores.sonParalelos(vector, vector2);
		
		if (Vectores.sonParalelos(vector, vector2)) {
			System.out.println("Los vectores son paralelos");
		} else {
			System.out.println("Los vectores NO son paralelos");
		}

	}

}
