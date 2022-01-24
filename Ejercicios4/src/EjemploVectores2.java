import java.util.Scanner;

/**
 * 
 */

/**
 * @author David
 * Ejercicio que lee un vector por teclado y lo muestra en pantalla
 */
public class EjemploVectores2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int tam;
		System.out.println("¿Cuantos elementos quieres? ");
		tam = entrada.nextInt();
		
		float temperaturas [] = new float[tam];
		for (int i = 0; i < temperaturas.length; i++) {
			System.out.printf("temperatura %d: ",i);
			temperaturas[i] = entrada.nextFloat();
		}
		
		for (int i = 0; i < temperaturas.length; i++) {
			System.out.printf("%.2f ", temperaturas[i]);
		}
		
		
		

	}

}
