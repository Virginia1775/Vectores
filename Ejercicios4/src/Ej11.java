import java.util.Scanner;

/**
 * 
 */

/**
 * @author David
 * 11.	Dados dos vectores, calcular la suma de ambos. 
 */
public class Ej11 {

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
		
		System.out.println("tu vector1es: ");
		Vectores.mostrar_vector(vector);
		
		System.out.println("tu vector2 es: ");
		Vectores.mostrar_vector(vector2);
		
		int vector_suma[] = Vectores.suma_vectores(vector, vector2);
		
		System.out.println("tu vector suma es: ");
		Vectores.mostrar_vector(vector_suma);

	}

}
