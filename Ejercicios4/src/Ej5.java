import java.util.Scanner;

/**
 * 
 */

/**
 * @author David
 5.	Dado un array de enteros de tamaño N, rotar sus valores una posición a la derecha,
    es decir, si tenemos un array como el siguiente: 5 -1 -3 15 4, el resultado deberá 
    ser el array rotado a la derecha: 4 5 -1 -3 15.
 */
public class Ej5 {

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
		
		int num;
		System.out.println("¿Cuantas rotaciones quieres?");
		num = entrada.nextInt();
	
		Vectores.rotarIzq(vector);

		
		System.out.println("tu vector rotado es: ");
		Vectores.mostrar_vector(vector);

	}

}
