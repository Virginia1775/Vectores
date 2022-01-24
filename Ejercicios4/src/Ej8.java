import java.util.Scanner;

/**
 * 
 */

/**
 * @author David
 * 8.	Dado un array de enteros de tamaño N, decir si es capicúa o no, es decir, 
 *      si por ejemplo el array es: 5 2 1 2 5, el resultado debe ser “verdad”
 *      (se debe tener en cuenta que el tamaño el array puede ser par o impar).
 */
public class Ej8 {

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
		
		boolean res = Vectores.esCapicua(vector);
		if (res) {
			System.out.println("El vector es capicúa");
		} else {
			System.out.println("El vector no es capicua");
		}

	}

}
