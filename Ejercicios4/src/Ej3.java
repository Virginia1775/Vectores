import java.util.Scanner;

/**
 * 
 */

/**
 * @author David
 * 1.	Dado un array de reales del tamaño N, visualizar por pantalla todos los 
 *      elementos del mismo cuyo valor pertenezca al intervalo [a,b). 
 */
public class Ej3 {

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
		
		int a,b;
		
		System.out.println("introduce el número a: ");
		a = entrada.nextInt();
		
		System.out.println("introduce el número b: ");
		b = entrada.nextInt();
		
		System.out.printf("Los numeros en el intervalo [%d,%d) son: ",a,b);
		Vectores.mostrar_valores_a_b(vector, a, b);

	}

}
