import java.util.Scanner;

/**
 * 
 */

/**
 * @author David
 * 4.	Dado un array de enteros de tama�o N, rotar sus valores una posici�n a la izquierda, 
 *      es decir, si tenemos un array como el siguiente: 5 -1 -3 15 4, el resultado 
 *      deber� ser el array rotado a la izquierda: -1 -3 15 4 5. 
 */
public class Ej4_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("�Cuantos elementos quieres?: ");
		int tam = entrada.nextInt();
		
		int vector[] = new int[tam];
		
		System.out.println("Introduce el vector: ");
		Vectores.pedir_vector(vector);
		
		System.out.println("tu vector es: ");
		Vectores.mostrar_vector(vector);
		
		Vectores.rotarIzq(vector);
		System.out.println("tu vector rotado es: ");
		Vectores.mostrar_vector(vector);

	}

}
